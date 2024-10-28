import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.time.LocalTime;
import java.util.Arrays;

public class ComboBoxTime extends Application {
    private ComboBox<Integer> timeVælger = new ComboBox<>();
    private  ComboBox<Integer>  minutVælger = new ComboBox<>();
    @Override
    public void start(Stage stage){
        stage.setTitle("Dette er en ComboBox for timer og minuter");
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

        Label lblTimer = new Label("Timer");
        pane.add(lblTimer,0,0);
        pane.add(timeVælger,1,0);
        getTimer();

        Label lblMinuter = new Label("Minuter");
        pane.add(lblMinuter,2,0);
        pane.add(minutVælger,3,0);
        getMinuter();
        

    }

    private void getTimer(){
        int [] timerArray = new int [24];
        for(int i = 1; i <= 23; i++){
            timeVælger.getItems().add(i);
        }
    }

    private void getMinuter() {
        int [] minuterArray = new int [60];
        for(int i = 1; i <= 59; i++){
            minutVælger.getItems().add(i);
        }
    }
}
