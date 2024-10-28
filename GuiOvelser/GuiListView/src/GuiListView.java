import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GuiListView extends Application {
    private ListView<String> lvwNames = new ListView<>();
    private ArrayList<String> listNames = new ArrayList<>();
    private TextField txfName = new TextField();
    private TextField txfnameChange = new TextField();
    private TextArea txaAreaOfNames = new TextArea();

    private Button btnAddName = new Button("Add Name");
    private Button btnDeleteName = new Button("Delete Name");
    private Button btnChangeName = new Button("Change Name");
    private Button btnAddToTextArea = new Button("Add To TextArea");


    @Override
    public void start(Stage stage){
        stage.setTitle("ListView");
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

        setCurrentListNames();
        pane.add(txfName,0,0);
        lvwNames.getItems().setAll(listNames);
        pane.add(lvwNames,0,1,1,4);
//        pane.add(txfnameChange,10,4,12,6);

        ChangeListener<String> listener = (ov,oldString,newString)->this.selectionChange();
        lvwNames.getSelectionModel().selectedItemProperty().addListener(listener);
        lvwNames.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        pane.add(txaAreaOfNames,0,7,1,9);
        pane.add(btnAddToTextArea,7,7,8,10);
        txaAreaOfNames.setEditable(false);
        btnAddToTextArea.setOnAction(event ->this.addNamesToTextArea());



           /*
        Koden ovenover der får metoden til at hænge sammen med listen
        første del 42 laver en ny ChangeListener, og i den anden statement 43 er
        ChangeListener added til den selected item property for selectionmodel af listview
        hver gang noget nyt i list view er selected, så bliver ChangeListenr informeret
        og metoden selectionChange udføres
         */


        /*
        Følgende kode er for en knap der skal adde flere navne til listen
         */
        pane.add(btnAddName,2,0,3,3);
        btnAddName.setOnAction(event ->this.addName());
        pane.add(btnDeleteName,6,0,7,3);
        btnDeleteName.setOnAction(event -> this.deleteName());
        pane.add(btnChangeName,12,0,13,3);
        btnChangeName.setOnAction(event -> this.changeName());




    }

    private void addNamesToTextArea() {
        StringBuilder sb = new StringBuilder();
        for(String s : lvwNames.getSelectionModel().getSelectedItems()) {
            if (s != null) {
                sb.append(s +  "\n");
            }
        }
        txaAreaOfNames.setText(sb.toString());

    }

    private void changeName() {
        selectionChangeName();

    }

    private void selectionChangeName() {
        String selectedItem = lvwNames.getSelectionModel().getSelectedItem();
        int indexOfSelected = lvwNames.getSelectionModel().getSelectedIndex();
        if(selectedItem != null && txfName.getText() != null){
            listNames.set(indexOfSelected,txfName.getText());
            updateNames();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("No name wrtitten/selected ");
            alert.setHeaderText("Select or write a name");
            alert.setContentText("Select a name and write a name");
            alert.show();
        }
    }

    private void deleteName() {
        if(lvwNames.getSelectionModel().getSelectedItem() != null){
            for(int i = 0; i < listNames.size(); i++){
                if(lvwNames.getSelectionModel().getSelectedItem().compareTo(listNames.get(i)) == 0){
                    listNames.remove(i);
                    updateNames();
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Need to select a name");
            alert.setHeaderText("No name selected");
            alert.setHeaderText("You need to select a name for it to be deleted");
            alert.show();
        }

    }

    private void deleteTxaName() {
        if(txaAreaOfNames.getText().compareTo(lvwNames.getSelectionModel().getSelectedItem())==0){

        }
    }

    private void addName() {
        String name = txfName.getText();
        if(!name.isEmpty()){
            listNames.add(name);
            updateNames();
        }else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Manglende navn");
            alert.setHeaderText("Skriv navn");
            alert.setContentText("Du skal skrive det navn som skal tilføres");
            alert.show();
        }
    }

    private void selectionChange() {
        /*
        I denne metode får man en værdi fra listview hvis noget er valgt
        så her skal den tag det valgte navn sætte det i et textfield afhængig af hvilken der vælges
        hvis værdi er null skal den ikke vise noget men clear textfield
         */
        String selected = lvwNames.getSelectionModel().getSelectedItem();
        if(selected!= null){
            txfName.setText(selected);
        }else {
            txfName.clear();
        }

    }

    private void updateNames() {
        lvwNames.getItems().setAll(listNames);
    }

    private void setCurrentListNames() {
        listNames.add("Hans");
        listNames.add("Mie");

    }

}
