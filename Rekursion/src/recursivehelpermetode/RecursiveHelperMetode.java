package recursivehelpermetode;

public class RecursiveHelperMetode {
    public static void main(String[] args) {
        /*
        Sometimes you can find a solution to the original problem by defining a recursive function
        to a problem similar to the original problem. This new method is called a recursive helper
        method. The original problem can be solved by invoking the recursive helper method.
         */

        /*
        sidste eksempel med palindrome metode isPalindrome() er ikke effektiv
        da det laver et new string for hver recursive call
        for at undgå at lave new strings, kan man bruge low og high indices til at
        indikere range af substring
        Disse to indices must be passed to the recursice method, og siden
        orginal metode er isPalindrome(String s), er man nød til at lave new method
        isPalindrome(String s,int low, int high) to accept additional information on the string
        som given i eksempel under
         */

        System.out.println("Is moon a palindrome? "
                 + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? "
                 + isPalindrome("noon"));
        System.out.println("Is a a palindrome? " + isPalindrome("a"));
        System.out.println("Is aba a palindrome? " + isPalindrome("aba"));
        System.out.println("Is ab a palindrome? " + isPalindrome("ab"));

        /*
        To overloaded (to med samme navn men forskelig parameter) isPalindrome() metoder er defineret
        første metode isPalindrome(String s) checkker om en stirng er en palindrome
        anden metode isPalindrome(String s,int low, int high) checkker om en substring s(low..hgih) er
        en palindrome.
        første metode passes(giver) string s med low =0 og high = s.length() -1 til anden metode
        Anden metode kan invokes recursively til at chekke en palindrome i en skrumpenene substring

       It is a common design technique
       in recursive programming to
       define a second method that receives additional parameters.
       Such a method is known as a
       recursive helper method.
       Helper methods are very useful in designing recursive solutions for problems involving
       strings and arrays. The sections that follow give two more examples.


         */


    }

    public static boolean isPalindrome(String s){
        return isPalindrome(s,0,s.length()-1);
    }

//    public static boolean isPalindrome(String s,int low,int high){
//        if(high <= low){ // base case
//            return true;
//        }
//        else if(s.charAt(low) != s.charAt(high)){
//            return false;
//        }
//        else {
//            return isPalindrome(s,low+1,high-1);
//        }
//    }


    public static boolean isPalindrome(String s,int start,int slut){
        if(slut - start <= 1 && s.charAt(start) == s.charAt(slut)){
            return true;
        }
        else if(s.charAt(start) == s.charAt(slut)) {
            return isPalindrome(s, start + 1, slut - 1);
        }
//        else {
//            return false;
//        }
        return false;
    }
}
