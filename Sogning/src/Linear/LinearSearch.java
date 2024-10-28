package Linear;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args){
        /*
        Kigger på et usorteret mængde

        En lineære søgning undersøger om det element man er kommet til er det der søges efter
        element på plads i fx
        og hvis det er stopper søgning

         */


        ArrayList<String> stringList = new ArrayList<>(List.of("Hans","Jens","ADAM","Carl"));
        String navn = "Hans";

        System.out.println(linearSearchMetodeNavn(stringList,navn));

    }

    private static String linearSearchMetodeNavn(ArrayList<String> stringList, String string) {
        String fundetNavn = null;
        int i = 0;

        while (fundetNavn == null && i < stringList.size()){
            if(string ==stringList.get(i)){
                fundetNavn = stringList.get(i);
            }
            else {
                i++;
            }
        }
        return fundetNavn;
    }

}
