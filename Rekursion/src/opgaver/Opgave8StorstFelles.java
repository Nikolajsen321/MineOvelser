package opgaver;

import java.util.Scanner;

public class Opgave8StorstFelles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv to tal og se hvilket tal der det største tal" +
                " som går op i begge");
        System.out.println("\nTal1");
        int tal1 = input.nextInt();
        System.out.println("\n tal2");
        int tal2 = input.nextInt();

        System.out.println("Største fælles nævner er " + gcdMetode(tal1,tal2));

    }

    private static int gcdMetode(int tal1, int tal2) {
        int divisioner = 0;
        if(tal2 <= tal1  && tal1 % tal2 == 0){
          divisioner = tal2;
        }
        else if(tal1 < tal2){
            divisioner = gcdMetode(tal2,tal1);
        }
        else {
             divisioner = gcdMetode(tal2,tal1 % tal2);
        }
        return divisioner;
    }

//    private static int gcdMetode(int tal1, int tal2) {
//     if(tal2 == 0){
//         return tal1;
//     }
//     else {
//         return gcdMetode(tal2,tal1 % tal2);
//     }
//
//    }





}
