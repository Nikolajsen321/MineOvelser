import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class ExceptionHandling {
    public static void main(String[] args) {
        // IDE intergret udviklingmiljø eller integrated devolpment enviroment,
        // værktøj der gør programering nemmer end at teksteditor og komandolinje grænse flade
        // hvor inteliJ IDEA  er designet som en IDE for JVM languages der kan dog tilføjes flere
        // plugins der udvidere for at provide polygot experience


        //JVM java virtuel machine  der gør det muligt at for computer at køre java - programer
        // samt programmer skrevet på andre sprog, der også er komplimeret til java - bytekode
        /* hvis JVM opdager en operation som er umulig at udføre
           Java run time errors er thrown as an exception, en exception
           er et objekt som repræsenter en error eller betingelse der forhindre excution
          hvis exception ikke ordnes så terminates programet
     */

        // for at demsotrere hvordan exception handling og exception objekts kastes
        // første eksempel  der læser 2 integere her er der helt simpel lav noget
        // kode som dividere to tal uden at fange nogle exception eller give noget info

        Scanner input = new Scanner(System.in);
//*******************************************************************************
        System.out.println("Enter two integers without any informaiton");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        // hvis man fx skriver 3 / 0 her får man en ArtimetricException
        // fx floating - point number giver ikke fejl
        // simple måde at fixe er ved if - statement
//*********************************************************************************
        System.out.println("Enter two integers without any informaiton");
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        if(number4 != 0) {
            System.out.println(number3 + " / " + number4 + " = " + (number3 / number4));
        }else {
            System.out.println("Man kan ikke dividere med 0");
        }
//***********************************************************************************
        // tilføjer metode
        System.out.println("Enter two integers");
        int number5= input.nextInt();
        int number6 = input.nextInt();
        int result1 = quotient1(number5, number6);
        System.out.println(number5 + " / " + number6 + " = " + result1);
//***********************************************************************************
        //  Det er et problem at man lader metoden  terminate  programmet
        // the caller skal helst vælge om det skal terminate
        // Java enabler en metode der throw exceptions der kan gribes af og håndteret
        // af caller
        // den kaster altså ved throw new ArthimeticEception  exception

        System.out.println("Skriv to integers ");
        int number7= input.nextInt();
        int number8 = input.nextInt();
        int result2 = quotient2(number7, number8);
        System.out.println(number7 + " / " + number8 + " = " + result2);
//***********************************************************************************
         /* når en exception kastes, så normal udførsel flow stoppet
        altså er at pass en exception fra et stedt til et andet
        statement for at invoke en metode er indeholdt i en try blok
        try blok indeholder kode som udføres under normale forhold
        exception fanges af catch blok, koden i catch udføres for at håndtere
        exceptionen hvor efter statments efter catch blok udføres
        throw statemnt er ligsom en metode kald, i stedet for at kalde en metode,
        den kalder et catch blok
        catch blok er som en metode defention med en parameter der matcher
        den type/værdi  der matcher den der kastes
        men det der adskiller fra en metode efter at catch blok udføres,
       program kontrollen returnere ikke throw statement i stedet
       udføre den næste statement efter catch blokken
       */

       int number9 = input.nextInt();
       int number10 = input.nextInt();

       try {
           int result3 = quotient3(number9,number10);
           System.out.println(number9 + " / " + number10 + " = " + result3);
       }catch (ArithmeticException e){
           e.getMessage();
           System.out.println( e.toString());
//           System.out.println("Exception an integer" + "cannot be divided by zero");
       }
//***********************************************************************************
        // InputmisMatch
        /*
        fordel ved exception er man kan seperating og opdage errors (I en called method)
         */
        boolean continueInput = true;
        do {
            try {
                System.out.println("Input mis match indtast  integer");
                int number = input.nextInt();
                // vis resultat
                System.out.println("The number entered is " + number);
                continueInput = false;
            }
            catch (InputMismatchException iME){
                System.out.println("Try agian " + " wrong input required integer");
                input.nextLine(); // Discard input


            }

        }while (continueInput);

    }

    public static int quotient3(int number9, int number10) {
        if(number10 == 0){
            throw new ArithmeticException("Division kan ikke være 0");
        }
        return number9 / number10;
    }

    private static int quotient2(int number7, int number8) {
        if(number8 == 0){
            throw new ArithmeticException("Division kan ikke være 0");
        }
        return number7 / number8;
    }

    private static int quotient1(int number5, int number6) {
        if(number6 == 0) {
            System.out.println("Man kan ikke dividere med 0");
            System.exit(-1);
        }
        return number5 / number6;
    }



}