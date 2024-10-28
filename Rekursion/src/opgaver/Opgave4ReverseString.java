package opgaver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Opgave4ReverseString {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et ord og det vil blvie vendt om ");
        String string = input.nextLine();

        System.out.println(reverseWord(string));

    }

    private static String reverseWord(String string) {
        if (string.length() <= 1 ) {
            return string;
        }else {
            return reverseWord(string.substring(1)) + string.charAt(0);

            /*
            Her tager string.substring(1) altså den vil i hallo
            tag fra index(1) som er ello  og  lægge sidste index til
            ello  + h

            for ello
            tager llo +  e

            for llo
            tager lo  + l

            for lo
            tager  o  + l

            og nu er  string.length <= 1  så den retunere bare
            o
            så det bliver
            o + l
            retunere igen  så det bliver
            ol + l
            retunere igen
            oll+e
            retunere igen
            olleh






             */

        }


    }


}
