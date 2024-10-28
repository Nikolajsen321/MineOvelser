package opgaver;

import java.util.Scanner;

public class Opgave6CheckPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et ord og se om det er et palindrome ");
        String ord = input.nextLine();
        System.out.println("Det er " + checkPalindromeMethod(ord,0,ord.length()-1));
    }

    private static boolean checkPalindromeMethod(String ord, int first, int last) {
        if(first == ord.length()-1){ // first >= last
            return true;
        }
        else if(ord.charAt(last) == ord.charAt(first)){
            return checkPalindromeMethod(ord,first+1,last-1);

        }
        else {
            return false;
        }

    }


}
