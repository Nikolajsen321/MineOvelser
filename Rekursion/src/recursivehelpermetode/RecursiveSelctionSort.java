package recursivehelpermetode;

public class RecursiveSelctionSort {
    public static void main(String[] args) {

        /*
        Selection sort was introduced in Section 7.11. Recall that it finds the smallest element in the
        list and swaps it with the first element. It then finds the smallest element remaining and swaps
        it with the first element in the remaining list and so on until the remaining list contains only a
        single element. The problem can be divided into two subproblems:
            ■■ Find the smallest element in the list and swap it with the first element.
            ■■ Ignore the first element and sort the remaining smaller list recursively.
        The base case is that the list contains only one element. Listing 18.5 gives the recursive sort
        method.

         */

    }
    public static void sort(double[] list){
        sort(list,0,list.length-1);
    }

    public static void sort(double[] list,int low,int high){
        if(low < high){
            //find den míndste nummer og dens index i list[low ...high]
            int indexOfMin = low;
            double min = list[low];
            for(int i = low +1; i <=high; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
            //swap det mindste i list[low --- high] med list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            //sort det resternede list elementer
            sort(list,low+1,high);
        }
    }
    /*
    Two overloaded sort methods are defined. The first method sort(double[] list)
    sorts an array in list[0..list.length − 1] and the second method sort(double[]
    list, int low, int high) sorts an array in list[low..high]. The second method
     can be invoked recursively to sort an ever-shrinking subarray.

     Husk overloading er give metoder samme navn men forskellige parameter
     */
}
