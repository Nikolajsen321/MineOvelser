import java.util.ArrayList;

public class InsertionSortNoter {
    public static void main(String[] args) {
        /*
        Insertion sort algo sortere en list af værdier ved at gentagende
        inserting a new element into a sorted sublist until the whole list
        is sorted

        fx (2,9,5,4,8,1,6)

        algo kan beskrives med
         */
        ArrayList<String> eksempel = new ArrayList<>();
        for(int i = 1; i < eksempel.size(); i++ ){
            //insert eksempel.get(i) ind i en sorted sublist eksempel.get(0...eksempel.size()-1)
            // så det bliver eksempel.get(0...i) er sorted
        }
        /*
        For at indsætte eksempel.get(i) ind i eksempel.get(0....eksempel.size()-1)
        skal man gemme eksempel.get(i) i en temp variable fx currentelement
        så flyt  element.get(i -1) til element.get(i)  hvus
        element.get(i-1) > current element  flyt element(i-2) til element.get(i-1) hvis
        element.get(i-2) > currentElement osv indtil
        element.get(i-k) <= currentElement eller k > i (passerer  første element af den sorted list)
        assign  currentElement til  element.get(i-k+1) fx
        når man skal indsætte 4 ind i (2,5,9) i trin 4 så flytter man
        element.get(2) til element.get(3) siden 9 > 4  og flut element.get(1) til element.get(2)
        siden 5 > 4 og til sidst flytter man current element til element.get(1)


        fx

         0  1  2  3  4  5  6  7  8
        [6][1][7][4][2][9][8][5][3]
        int temp
        []
        Man begynder som sagt ved index 1  tager værdien og flytter til en temp
         0  1  2  3  4  5  6  7  8
        [6][][7][4][2][9][8][5][3]
        int temp
        [1]
        og man undersøger element til venstre for og hvis nogle elementer er større
        end det der er i tempt
        skifter man dem til højre og 6 er større end 1 skifter til højre
         0  1  2  3  4  5  6  7  8
        [][6][7][4][2][9][8][5][3]
        int temp
        [1]
        løbet tør for elementer til venstre for nu sætter man temp tilbage
         0  1  2  3  4  5  6  7  8
        [1][6][][4][2][9][8][5][3]
        int temp
        [7]
         0  1  2  3  4  5  6  7  8
        [1][6][7][][2][9][8][5][3]
        int temp
        [4]
        7 er større end 4 flytter den
         0  1  2  3  4  5  6  7  8
        [1][6][][7][2][9][8][5][3]
        int temp
        [4]
        6 er større end 4
        0  1  2  3  4  5  6  7  8
        [1][][6][7][2][9][8][5][3]
        int temp
        [4]

       1 er ikke større end 4
        0  1  2  3  4  5  6  7  8
        [1][4][6][7][2][9][8][5][3]
        int temp
        []

      forsætter sådan til man løber tør f
         */

        System.out.println("A".compareTo("B"));
    }
    public static void insertionSort(ArrayList<String> list){
        for(int i = 1; i < list.size(); i++){
            String currentElement = list.get(i);
            int k;
            for(k = i -1; k>= 0 && list.get(k).compareTo(currentElement) > 0; k--){
                list.set(k+1,list.get(k));
            }
            list.set(k+1, currentElement);
        }
    }

    public static void insertionSort2(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i); // Flyt værdien til en midlertidig variabel

            int k;
            // Sammenlign med elementerne til venstre
            for (k = i - 1; k >= 0 && list.get(k) > temp; k--) {
                list.set(k + 1, list.get(k)); // Flyt elementet til højre
            }
            list.set(k + 1, temp); // Sæt midlertidig variabel tilbage på plads
        }


        //Både insertion og selections sorts tidskompleksistet er O(n^2)
    }
}
