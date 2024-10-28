public class ProblemSolvingUsingRecursion {
    public static void main(String[] args) {

        /*
        The preceding sections presented two classic recursion examples. All recursive methods have
         the following characteristics:
         ■■ The method is implemented using an if−else or a switch statement that leads to
            different cases.
         ■■ One or more base cases (the simplest case) are used to stop recursion.
         ■■ Every recursive call reduces the original problem, bringing it increasingly closer to a
            base case until it becomes that case.

            General for at løse problem ved bruge recursion, deler man det indtil subproblemer
            hver subproblem er det samme som orginal problem, men i mindre størrelse
            Man kan anvende samme tilgang til hver subproblem for at løse det
            recursivly

            Rekursion er over alt , man kan tænke rekusivt, fx ved at drikke kaffe
            beskrive proceduren rekursiv

            public static void drinkCoffe(Cup cup){
              if(!cup.isEmpty)){
                cup.takeOneSip();
                drinkCoffe(cup);
                }
              }

           Antag at cup er objekt for et cup af coffe med instance methods isEmpty() og takeOnesip()
          man kan  dele problemet op i to subproblems
           1. er at drikke en slurk af kaffe
           2. er at drikke resten af kaffen i cup

          2. problem er samme som det orginale problem, men i mindre størrelse

          base case for problem er hvornår cup er tomt

          forstill problem med at print n gange, man kan dele problem op i 2 subproblem
          1. at print message engang
          2. at print message n-1 gange

          2. er samme som orginal problem men mindre i størrelse

          base case for problem er n == 0 man kan løse problemet med
          recursion som følgende
         public static void nPrintln(String message, int times) {
            if (times >= 1) {
             System.out.println(message);
             nPrintln(message, times − 1);
             } // The base case is times == 0
           }

           Note the fib method in the preceding section returns a value to its caller, but the drinkCoffee
           and nPrintln methods are void and they do not return a value.


           Palidrome string hvis man læser det samme fra venstre mod højre som højre mod venstre
          dad og mom

           The problem of checking whether
           a string is a palindrome can be divided into two subproblems:
             ■■ Check whether the first character and the last character of the string are equal.
             ■■ Ignore the two end characters and check whether the rest of the substring is a
                palindrome.

           Andet subproblem er det samme som det orginale problem, men mindre i størrelse

           2 base cases
           (1) de to end character er ikke de samme
           (2)string størrelse er 0 eller 1

           i case 1, string ikke palindrom
           i case 2 string er en palindrom

           recursive metode for problem kan implementeres som given
         */
        System.out.println("Is moon a palindrome? " + isPalindrome("moon"));
        System.out.println("Is noon a palindrome? "
                   + isPalindrome("noon"));
       System.out.println("Is a a palindrome? " + isPalindrome("a"));
       System.out.println("Is aba a palindrome? " +
                 isPalindrome("aba"));
       System.out.println("Is ab a palindrome? " + isPalindrome("ab"));

    }

    /*
    The substring method in line 102 creates a new string that is same as the original string
    except without the first and the last characters. Checking whether a string is a palindrome is
    equivalent to checking whether the substring is a palindrome if the two end characters in the
     original string are the same.
     */

    private static boolean isPalindrome(String s) {
        if(s.length() <= 1){   // base case
         return true;
        }
        else if(s.charAt(0)!= s.charAt(s.length()-1)){
            return false;

        }
        else {
            return isPalindrome(s.substring(1,s.length()-1));

        }
    }
}
