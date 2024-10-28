package GuiTest;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class GuiFxRb extends Application {
    // metoden start(Stage stage) kaldes automatisk med vindue kaldet Stage
    // skabt af operativsystemet
    Label lblName = new Label("Navn");
    TextField txfNavn = new TextField();
    Button btnUpperCase = new Button("Upper Case");
    Button btnLowerCase = new Button("Lower Case");

    @Override
    public void start(Stage stage){
        stage.setTitle("Øvelse med RadioButtom");
        //linerne Gridpane
        GridPane pane = new GridPane();
        this.initContent(pane);
        /*
         følgende fastlægger, at komponenter som tilføjes vinduet, skal layouts med Gridpane - layout
         Komponenter som skal vises i vinduet, tilføjes i metoden initContent(pane)
         som tager den skabte Gridpane som parameter
         */
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(90));
        pane.setHgap(20);
        pane.setVgap(20);
        pane.setGridLinesVisible(false);

        pane.add(lblName,0,0,1,1);
        pane.add(txfNavn,1,0,4,1);

//        pane.add(btnLowerCase,0,2,2,3);


        HBox hBox = new HBox(btnLowerCase,btnUpperCase);
        hBox.setSpacing(10);
        pane.add(hBox,1,1,4,2);

        btnUpperCase.setOnAction(event -> this.setUpperCase());
        btnLowerCase.setOnAction(event -> this.setLowerCase());




    }

    private void setLowerCase() {
        String navn = txfNavn.getText();
        String firstChar = navn.substring(0,1).toLowerCase();
        String restString = navn.substring(1,navn.length());
        txfNavn.setText(firstChar + restString);
    }

    private void setUpperCase() {
        String navn = txfNavn.getText();
        String firstChar = navn.substring(0,1).toUpperCase();
        String restString = navn.substring(1,navn.length());
        txfNavn.setText(firstChar + restString);

    }

}
