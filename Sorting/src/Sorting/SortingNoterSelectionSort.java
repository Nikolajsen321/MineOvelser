package Sorting;

import java.util.ArrayList;

public class SortingNoterSelectionSort {
    public static void main(String[] args) {

        /*
        Selection sort
        Finder mindste element i listen og udskifter det med det første element

        så fx

        (2,9,5,4,8,1,6)

        2  - 1
        1,9,5,4,8,2,6
        9 - 2
        1,2,5,4,8,9,6
        5-4
        1,2,4,5,8,9,6
        5 står hvor den skal
        8 -6
        1,2,4,5,6,9,8

        8-9
        1,2,4,5,6,8,9
        og så det sorteret

         */

        /*
        Starter med at skrive koode for første iteration
        for at finde det mindste element i listen fx og skift det med det første element
        og osbsever hvad der så vil være anderledes i næste iteration  3. osv
         */
        ArrayList<String> eksempel = new ArrayList<>();
        for(int i = 0; i <  eksempel.size(); i++){
            // vælg mindste element i eksempel.get(i ... eksempel.size() -1)
            // skift mindste element.get(i) med mindst hvis nødvendig
        }


    }
    // metode for sorting number
    public static void selectionSort(ArrayList<Double> list){
        for(int i = 0; i < list.size(); i++){
            // find mindste element i listen list[i....list.size()-1)
            double currentMin = list.get(i);
            int curentMinIndex = i;

            for(int j = i +1; j < list.size(); j++){
                if(currentMin > list.get(j)){
                    curentMinIndex = j;
                }
            }
            swap(list,i,curentMinIndex);
        }
    }

    public static void swap(ArrayList<Double> list,int i,int j){
        double temp =list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);

    }


    /*



         -
     */
}
