import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class GuiFxRadioBtn extends Application {
    private final Label lblTxt = new Label("RadioButton example");
    private final ToggleGroup group = new ToggleGroup();

    @Override
    public void start(Stage stage){
        stage.setTitle("RadioButto");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(40));
        pane.setVgap(20);
        pane.setHgap(20);

        HBox hBox = new HBox();
        pane.add(hBox,0,0);
        String [] colorStrings = {"Red","Blue","Green","Black"};

        Color [] colors = {Color.RED,Color.BLUE,Color.GREEN,Color.BLACK};



        //ad 4 radiobuttoms til hBox
        for(int i = 0; i < colors.length; i++){
            RadioButton rb = new RadioButton();
            hBox.getChildren().add(rb);
            rb.setText(colorStrings[i]);
            // får radiobuttom til at huske sine egen farve
            rb.setUserData(colors[i]);
            // sikre at kun en radio buttom er i selekted stadie
            rb.setToggleGroup(group);
            // sætter metode til at udføre når radiobutton er valgt
            rb.setOnAction(event -> this.setLabelColor());

        }
        /*
        Hver radio button der laves i for - loop er added til ToogleGroup object kaldet group
        det sikre at for alle radio button til samme gruppe "group" kan kun en vælges
        Man kan også chekke på gruppen hvilken der valgt forløbeligt

        Hver radio button får en farve og en tekstreng som user data
        text er vidst ved siden af knap, og user data er tilgængelig for senre brug

        Der addes hver knap til HBox object og addere box til GridPane  i sidste linje
        får man gruppe af  toggles (radio buttons), får den nuværende selektede
        kode lige under

        setLabelColor();
        metoden henter data fra den valgte knap i group af knapper og bruger denne farve
        til at ændre farven på label på billedet
         */


        // addere en centered label til pane  ved col = 0 og row = 1
        pane.add(lblTxt,0,1);
        GridPane.setHalignment(lblTxt, HPos.CENTER);

        // select first Radio button og opdatere farve af lblTxt så kan ved index 0 er selected
        RadioButton rb0 = (RadioButton) group.getToggles().get(0);
        rb0.setSelected(true);
      Color color1 = (Color) rb0.getUserData();
      lblTxt.setTextFill(color1);






    }

    private void setLabelColor() {
        RadioButton rb = (RadioButton) group.getSelectedToggle();
        Color color = (Color) rb.getUserData();
        lblTxt.setTextFill(color);
    }

}
