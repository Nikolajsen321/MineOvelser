import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



public class GamePanel extends JPanel implements ActionListener {
    // starter med screen width og screen height
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    // snake har man units en slags matrix hvor stor vil man have objekterne i spillet
    //altså hvor stor vil man have objekterne i spillet
    static final int UNIT_SIZE = 25;
    // så vil man udregne hvor mange objekter som man kan have på skærmen
    static final int GAME_UNITS = (SCREEN_WIDTH * SCREEN_HEIGHT) / UNIT_SIZE;
    // så laver man et delay for timer der skal implementeres senere
    static final int DELAY = 80;
    // 75 var temlig hurtig så jo højre desto langsomer er spillet
    // laver to arrays x og y  skal holde alle koordinater for alle
    // krops dele for slangen samt hovdet
    // størelsen på array sættes til hvor stor maks units er for hvad der kan være på skærmen
    final int[] x = new int [GAME_UNITS]; // alle x - koordinater for krops delene samt hovede
    final int[] y = new int[GAME_UNITS]; // alle y - koordinater for krops delene samt hovede
    // sætter nu de intiale antal krops dele for slangen  fx her er det 6
    int bodyParts = 6;
    // laver en int der kaldes for æbler spist som er først 0
    int aplleEaten = 0;
    // nu laver man x - koordinater for hvor æblet er lokaliseret samme for y
    // det skal dog opstå random hvergang slangen spier et æbel
    int appleX;
    int appleY;
    // så vil man have en retning som man kan gøre med en char
    char directions = 'R';  // sætter retningen til højre
    // først ved start så R for højre L venstre U for op og D for ned
    boolean running = false;
    Timer timer;
    Random random;
    // alt overstående er alt som man skal erklære inden constructoren

    GamePanel(){
        random = new Random();
        // sætter den ønskede størelse for gamePanel
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        // når man er færdig med at constructing this. game Panel skal man kalde startGame metoden
        startGame();
    }
    public void startGame(){
        newApple();
        running = true;
        // tager delay value hvor hurtig som spillet går samt det er this
        // fordi man bruger ActionListerner interface
        timer = new Timer(DELAY,this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
        // når man starter spillet så får man bagrunden med 600 x 600 dimension
        // hver item i spillet kommer til at have en dimension af 25  pixels for width og højde
        // som jo er svært at se i spillet så det man gør er man laver det om til en matrice eller grid
        // så man nemmer kan se tingene

    }

    public void draw(Graphics g) {
        // benytter for loop til at tegne linjer over panel  så det bliver en slags grid
        if (running) {
//            for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
//                g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
//                g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
//            }
            // tegner æblet
            g.setColor(Color.RED);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            // så skal hovdet og kroppen tegnes
            // krops delene
            for (int i = 0; i < bodyParts; i++) {
                // i == 0 har man med hovdet af slangen
                if (i == 0) {
                    g.setColor(Color.GREEN);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
                // hvis i ikke er lig 0 har man med kroppen af slangen
                else {
                    g.setColor(new Color(45,180,0, 255));
                    // 255 er i den range hvor farverne ligger
                    g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255),random.nextInt(255)));
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
// scoreboard det skal bruges til tegne nuværende score
            g.setColor(Color.RED);
            g.setFont(new Font("Ink Free",Font.BOLD,40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Score: " + aplleEaten,(SCREEN_WIDTH - metrics.stringWidth("Score: " + aplleEaten))/2,
                    g.getFont().getSize());



        } else {
            gameOver(g);
        }
    }
    public void newApple(){
        // formål er at generate koordinater for os for et nyt æbel, når metoden kaldes
        //hver gang man begynder, score et point, eller spiser et æble
        // dividere med unit_size så man får centrum i en af firkanterne i gitteret
        // man ganger med UNIT_SIZE da man vil have æblet fordelt lige i en af firkanterne
        appleX = random.nextInt((int)(SCREEN_WIDTH / UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT / UNIT_SIZE))*UNIT_SIZE;


    }
    public void moveFunction(){
        // først et for loop der iterate gennem alle krops dele af slangen
        // man shifter altså krops dele af slangen
        for(int i = bodyParts; i > 0; i--){
            // man shifter index af krops dele over et sted
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        // laver en switch der ændre retningen for slangen
        // directions er en char value
        switch (directions){
            case'U':
                // y værdi for hovdet af slangen
                y[0] = y[0] - UNIT_SIZE;
                break;
            case'D':

                y[0] = y[0] + UNIT_SIZE;
                break;
            case'L':

                x[0] = x[0] - UNIT_SIZE;
                break;
            case'R':

                x[0] = x[0] + UNIT_SIZE;
                break;

        }

    }
    public void chekApple(){
        // cheker om x og y for slangens hovede er lig med x og y for æblet
        if((x[0] == appleX && y[0] == appleY)){
            bodyParts++;
            aplleEaten++;
            newApple();
        }

    }
    public void chekCollisions(){
        // først chekker man om hovdet kolidere med kroppen
        for(int i = bodyParts; i > 0; i--){
            if((x[0] == x[i] && y[0] == y[i])){
                running = false;
            }
            // så chekker man om hovdet rør venstre væg
            if(x[0] < 0){
                running = false;
            }
            // chek for højre væg
            if(x[0] > SCREEN_WIDTH){
                running = false;
            }
            // chek om hovede rør top væg

            if(y[0]  < 0){
                running = false;
            }
            // chek om hovede rør nedereste væg
            if(y[0] > SCREEN_HEIGHT){
                running = false;
            }
            if(!running){
                timer.stop();
            }

        }

    }

    public void gameOver(Graphics g){
        // Scoreboard
        g.setColor(Color.RED);
        g.setFont(new Font("Ink Free",Font.BOLD,40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score: " + aplleEaten,(SCREEN_WIDTH - metrics1.stringWidth("Score: " + aplleEaten))/2,
                g.getFont().getSize());
        //Game over text
        g.setColor(Color.RED);
        // font = skriftype
        g.setFont(new Font("Ink Free",Font.BOLD,75));
        // der noget som kaldes font metrics
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Game Over!",(SCREEN_WIDTH - metrics2.stringWidth("Game Over!"))/2,
                SCREEN_HEIGHT/2);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // her skal bevægelses delen til slangen laves/ kaldes der kontroler den
        if(running){
            moveFunction();
            chekApple();
            chekCollisions();
        }
        repaint();


    }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            // der skal fyldes nogle dele for at kontroler slangen
            switch (e.getKeyCode()){
                case KeyEvent.VK_LEFT:
                    // for at undgå bruger drejer 180 i den anden retning så tvinger til 90 grader
                    if(directions != 'R'){
                        directions = 'L';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    // for at undgå bruger drejer 180 i den anden retning så tvinger til 90 grader
                    if(directions != 'L'){
                        directions = 'R';
                    }
                    break;

                case KeyEvent.VK_UP:
                    // for at undgå bruger drejer 180 i den anden retning så tvinger til 90 grader
                    if(directions != 'D'){
                        directions = 'U';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    // for at undgå bruger drejer 180 i den anden retning så tvinger til 90 grader
                    if(directions != 'U'){
                        directions = 'D';
                    }
                    break;

            }

        }
    }
}
