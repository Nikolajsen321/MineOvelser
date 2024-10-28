package opgaver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Opgave5MaxIListElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,11,7,8,9,10));
        System.out.println("For listen "+ list + "\n er det største tal " + maksElement(list,1,list.get(0)));

    }

    private static int maksElement(List<Integer> list,int nextIndex, int currentMax) {
        if(nextIndex == list.size()){
            return currentMax;
        }
        else {

            if (list.get(nextIndex) > currentMax) {
                currentMax = list.get(nextIndex);
            }
            return maksElement(list, nextIndex +1, currentMax);
        }

    }

    /*
    For følgende metode skal man forstå at der kommer jo 3 parameter ind
    list = der er en arraylist som holder alle elementerne
    nextIndex som ved hver rekursion er næste index i listen
    currentMax som er den faktiske værdi der er størst forløbende

    if(nextIndex == list.size()) er terminerings reglen

     */
}
