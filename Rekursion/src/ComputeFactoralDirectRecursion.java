import java.util.Scanner;
public class ComputeFactoralDirectRecursion {
    public static void main(String[] args) {
        // lav en scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast en ikke negativ Integer ");
        int n = input.nextInt();

        //Display factoral
        System.out.println("Factoral af " + n+"! " + "er " + factoral(n));
    }

    /*
    Ideen med rekursion er  metoden  bliver ved med at kalde sig selvtil n == 0

    It is simpler and more efficient to implement the factorial method using a loop.
    However, we use the recursive factorial method here to demonstrate the concept
    of recursion. Later in this chapter, we will present some problems that are inherently
    recursive and are difficult to solve without using recursion.


     If recursion does not reduce the problem in a manner that allows it to eventually converge
     into the base case or a base case is not specified, infinite recursion can occur. For example,
     suppose you mistakenly write the factorial method as follows:

    public static long factorial(int n) {
     return n * factorial(n − 1);

     Understående eksempel hvor en metode rekursivt kalder (invokes) sig selv kaldes for
     direct recursion

     Der findes også indirekte recursion, der opstår når metode A invokes (kalder) metode B
     som igen direkte eller indirekte invokes metode A


     Rekursion er




}
     */

    //Direct Recursion
    private static long factoral(int n) {
        if(n == 0) { //termineringsreglen
            return 1;
        }
        else { //ReferantReglen
            return n * factoral(n -1); // da 4*(6)   3*2*1
            //
        }
    }

    /*
    Fx 100! = 100! * 99! beskrive løsning hvor løsning selv indgår
    Generelt
     */

}
