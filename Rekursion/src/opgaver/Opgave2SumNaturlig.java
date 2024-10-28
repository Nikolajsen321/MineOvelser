package opgaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opgave2SumNaturlig {
    public static void main(String[] args) {
        int index =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Naturlige tal altså hele ikke negative tal");
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,-10));
        System.out.println(sumAfNaturlige(list,index));

        System.out.println("Indtast et tal og lad programmet udregne antal naturlige");
        int n = input.nextInt();
        System.out.println(sumNaturligeTal(n));


//        int c = 4;
//        c += 2;
//        System.out.println(c);
//        c= -2;
//        c =+ 2;
//        System.out.println(c);
    }

    private static int sumAfNaturlige(List<Integer> list,int index) {
        int sum = 0;
        if(list.get(index) < 0 ){
            sum += 0;
        }
        else {
            sum += list.get(index);
            sum += sumAfNaturlige(list,index+1);
        }
        return sum;
    }

    private static int sumNaturligeTal(int n ){
        if(n == 0){
            return 0;
        }
        else {
            int mindreProblem = sumNaturligeTal(n - 1);
            return n + mindreProblem;

            /*
            Fx for 3 vil det være  3- 1  = 2-1 = 1- 1 = 0
            så vil den retunere 0  det vil sige for n = 1  vil mindreProblem = 0
            retunere så n +0 = 1 + 0
            og for   n = 2 vil den være
            mindreproblem = 2 + 1   osv
             */
        }
    }
}
