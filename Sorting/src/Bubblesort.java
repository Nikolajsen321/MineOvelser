import java.util.ArrayList;

public class Bubblesort {
    public static void main(String[] args) {
        /*
        Bubble sort sortere fx et array i flere gennemløb
        Hver gennemløb succesfuld swaps hver nabo hvis element ikke er i orden

        Hvis det er i decreasing order swaps de

        små værdier bobler til toppen og de storre synker til bunden

        Efter første gennem løb bliver sidste element er det sidste i arrayet

        fx

        [2][9][5][4][8][1]
        2 9 igen ting

        2 5 4 9 8 1
        9 8  --> ændre
        2 5 4 8 9 1
        9 1  --> ændre
        2 5 4 8 1 9
        igen
        2 5  ingen
       2 5 4 8 9 1
       5 4  ændre
       2 4 5 8 1 9
       8 1 --> ændre
       2 4 5 1 8 9
       osv

       Når den har kørt i gennem første gang er det største tal bleven det sidte og
       det ikke længere nødvendig ikke kigge på det sidste index

       fx



         */

        ArrayList<String> list = new ArrayList<>();

    }
    public static void swap(ArrayList<String> list,int j,int jPlusOne){
        String temp = list.get(j);
        list.set(j,list.get(jPlusOne));
        list.set(jPlusOne,temp);
    }

    public static void bubbleSort(ArrayList<String> list){
        for(int i = list.size()-1; i >= 0; i --){ // dette loop sørger for sidste element ikke tæller med igen
            for(int j = 0; j <= i -1; j++){// den her kør igennem
                if(list.get(j).compareTo(list.get(j+1)) > 0){ // chekker for om der skal swappes
                    swap(list,j,j+1);
                }

            }
        }
    }


}
