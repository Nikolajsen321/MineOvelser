import javafx.application.Application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Skriv int og så laver den en next line ");
        Scanner input = new Scanner(System.in);
        int varible = input.nextInt();
        String strin = input.next();
        String string = input.nextLine();
        System.out.println(varible + " " +string);
        Application.launch(ComboBoxTime.class);
    }
}
