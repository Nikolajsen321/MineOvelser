import java.util.Scanner;
import java.util.SortedMap;

public class FibonacciNumbers {
    public static void main(String[] args) {
        /*
        Consider the well-known Fibonacci-series problem:
        The series: 0 1 1 2 3 5 8 13 21 34 55 89 . . .
        indexes:    0 1 2 3 4 5 6  7  8  9 10 11

        begynder med 0 og 1 og ligger det subsequent (nummer fra før til)

        0 +1 = 1 og 1+1 = 2  2+1 = 3 osv

        brugte modellen til at modeller en kanin bestands

        fib(0) = 0
        fib(1) = 1
        fib(index) = fib(index -2) + fib(index -1) ; index >= 2

        Hvordan finder man fib(index) for et given index?
        nemt at finde fib(2) da man kender fib(0) og man kender fib(1)
        antager man at man kender fib(index -2) og fib(index -1), kan man få fat
        på fib(index) medet det samme, derved er problem med uderegne fib(index)
        reduceret til at udregne fib(index -2) og fib(index -1)
        Ved at gøre det , så anvender man ideen recusivly indtil index  er redcuceret til 0 eller 1

        Base case index er  index = 0 og index = 1

        hvis man kalder metode med index = 0 eller 1 retunere resultat med det samme

        hvis man kadler med index >= 2 deler den problemet op i to subproblems for at udregne
        fib(index -1) og fib(index -2) ved at bruge recursive calss

        recursive algoritme for at computing fib(index) kan simple beskrives som

        if (index == 0)
           return 0;

       else if (index == 1)
            return 1;
       else
           return fib(index − 1) + fib(index − 2);


           Programmet viser ikke den store mængde arbejde ens computer gøre
           bag scenen

          The recursive implementation of the fib method is very simple and straightforward, but
          it isn’t efficient, because it requires more time and memory to run recursive methods. See
          Programming Exercise 18.2 for an efficient solution using loops. Though it is not practical,
          the recursive fib method is a good example of how to write recursive methods.


         */

        Scanner input = new Scanner(System.in);
        System.out.println("Indtast integer som ikke er negativ ");
        int index = input.nextInt();
        System.out.println("Fibonacci nummer ved index " + index + " er " + fib(index) );


    }

    public static long fib(long index){
        if(index == 0){
            return 0;
        }
        else if(index == 1){
            return 1;
        }
        else {
            return fib(index -1) + fib(index -2);

        }
    }
}
