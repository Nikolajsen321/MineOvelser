import java.io.IOException;
import java.util.Scanner;

public class FileInputAndOutput {
    public static void main(String[] args) throws Exception{
        java.io.File file = new java.io.File("scores.txt");
//        if(file.exists()){
//            System.out.println("File already exist");
//            System.exit(1);
//        }
//        //create file
//        java.io.PrintWriter output = new java.io.PrintWriter(file);
//
//        // write formatted output to the file
//        output.print("John T Smith ");
//        output.println(90);
//        output.print("Eric K Jones");
//        output.println(85);
//
//        //Close the file
//        output.close();

        if(file.exists()){
            System.out.println("File already exist");
            file.delete();
            System.exit(1);

        }
        try (java.io.PrintWriter output = new java.io.PrintWriter(file)){
        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);
        }
        // Create a Scanner for the file

        Scanner input = new Scanner(file);
        // Read data from file
        while (input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        //Close the file
        input.close();
    }
}
