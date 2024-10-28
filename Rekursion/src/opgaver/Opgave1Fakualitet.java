package opgaver;

import java.util.Scanner;

public class Opgave1Fakualitet {
    public static void main(String[] args) {

        /*
        Opgave 1: Beregn Fakultet
        Beskrivelse: Skriv en rekursiv funktion, der beregner fakulteten af et givet heltal n.
        Fakultetet af et tal n, betegnet som n!, er produktet af alle positive heltal op til n.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et tal der en postiv interger ");
        int n = input.nextInt();

        System.out.println("Faktoral af " +n +"!  =" +  faktoral(n));
    }

    private static int faktoral(int n) {
        if(n == 0){ //termineringsregel
            return 1;
        }else {
         return n * faktoral(n-1); //rekursion reglen
            /*
            Man kalder subproblemmerne for rekursive kald
             */
        }
    }
}
