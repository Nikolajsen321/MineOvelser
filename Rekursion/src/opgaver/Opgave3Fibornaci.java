package opgaver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Opgave3Fibornaci {
   static Map<Integer,Long> memo = new HashMap<>();
    public static void main(String[] args) {
        /*
        Terminerings regel
        hvis n = 0   return 0
        hvis n= 1  return 1

        rekursion regel
        hvis n > 1  return   (n-1) + (n-2)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast et index der ikke er negativ" +
                "  som ligger antal fra før til næste");
        int n = input.nextInt();
        System.out.println("Fibunaci nummer fra index " + n + " er " + fibonaciTal(n));
        System.out.println();
        System.out.println("Fibunaci nummer fra index " + n + " er " + fibonaciTal2(n));


    }

    private static long fibonaciTal(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else {
            return fibonaciTal(n-1) + fibonaciTal(n-2);
        }



        /*
        Følgende sker man starter fx med at have n = 3
        fib(3)
        da  n = 3 > 0  og 1  vil den resultere i

        fib(2) +fib(1)
        For fib(2) vil være:
        fib(1) + f(0)
        retunere 1 og 0 = 1 + 0  = 1

        For fib(1) vil bare return 1

        så  1 + 1 = 2




        Hvis du følger rekursivt kald for Fibonacci-sekvensen, vil du se, at mange af de underliggende dele af beregningerne inkluderer rekursive opkald, der til sidst når basistilfældene n = 0 og n = 1. Disse basistilfælde returnerer henholdsvis 0 og 1, og de danner grundlaget for de rekursive opkald, deres sum og efterfølgende opkald.

        For eksempel, når n = 3:
       fibonaciTal(3) = fibonaciTal(2) + fibonaciTal(1)
       fibonaciTal(2) = fibonaciTal(1) + fibonaciTal(0)
       fibonaciTal(1) og fibonaciTal(0) når basistilfældene og returnerer henholdsvis 1 og 0.
         */
    }

    private static long fibonaciTal2(int n) {
        if( n <= 1){
            return n;
        }
        /*
        Metoden under gør det muligt at huske hvad fibonacio af følgende værdi giver
        fx fibonaci(2)  = 1  altså retuner 1
        og fibonaci(3) = 2 altså retunere den bare 2
        det vil sige den husker altså for memo.put(2,result)  som vil være (2,1) og
        memo.(3,result) osv
        så frem over vil den huske værdierne
         */

        if(memo.containsKey(n)){
            return memo.get(n);
        }

            long result = fibonaciTal(n - 1) + fibonaciTal(n - 2);
            memo.put(n, result);
            return result;
        }
}
