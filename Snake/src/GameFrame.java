import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        // når benytter fx i this.add(new gamePanel) så det fordi man ikke skal bruge det andre steder
        // eller flere af dem

        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        // for at sætte vinduet i midten af skærmen
        this.setLocationRelativeTo(null);
        // følgende er det hele for gameframe klassen



    }
}
