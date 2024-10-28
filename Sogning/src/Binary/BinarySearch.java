package Binary;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {

        /*
        I binæresøgning kigger man på en sorteret mængde fx i et array / list
        Man kigger på det midereste værdi og ser om det tal man har er mindre eller større end eller lig
        fordi hvis det mindre kan man skaffe sig af med halvdelen og samme hvis større
        og hvis det lig har man fundet det

         */


        ArrayList<String> stringList = new ArrayList<>(List.of("Adam","Bo","Carl","Dave","Eva"));
       String stringSøgteNavn ="Eva";

        System.out.println(findNavnBinary(stringList,stringSøgteNavn));

    }

    private static String findNavnBinary(ArrayList<String> stringList, String stringSøgteNavn) {
        String fundetNavn = null;
        int left = 0;
        int right = stringList.size()-1;
        while(fundetNavn == null && left <= right ){
            int middle = (left + right) / 2;
            String s = stringList.get(middle);
            if(s.compareTo(stringSøgteNavn) == 0){
                fundetNavn = s;
            }
            else if(s.compareTo(stringSøgteNavn) > 0){
                right = middle -1;
            }
            else {
                left = middle +1;
            }
        }
        return fundetNavn;

    }
}
