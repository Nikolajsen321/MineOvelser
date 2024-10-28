package quckSort;

public class QuickSortEksempel {
    public static void main(String[] args) {
        /*
        Quick sort virker på følengde måde:
        algoritmen vælger et element, kaldet pivot, i  arrayet
        Der deles array op i to dele, alle i første del er mindre end eller lig med pivot
        og alle i det andet er større end pivot

        Quick sort algoritme er derefter rekursivt udført til første del og derefter en del

        public static void quickSort(int[] list) {
          if (list.length > 1) {
            select a pivot;
          partition list into list1 and list2 such that
          all elements in list1 <= pivot and
          all elements in list2 > pivot;
           quickSort(list1);
           quickSort(list2);
           }
           }



        Each partition places the pivot in the right place. It divides the list into two sublists as shown
        in the following figure.  i bogen side 919



        The selection of the pivot affects the performance of the algorithm. Ideally, the algorithm
        should choose the pivot that divides the two parts evenly. For simplicity, assume that the first
        element in the array is chosen as the pivot. (Programming Exercise 23.4 proposes an alternative
        strategy for selecting the pivot.)
        Figure 23.7 illustrates how to sort an array (5 2 9 3 8 4 0 1 6 7) using quick sort. Choose
        the first element, 5, as the pivot. The array is partitioned into two parts, as shown in
        Figure 23.7b. The highlighted pivot is placed in the right place in the array. Apply quick sort
        on two subarrays (4 2 1 3 0) then (8 9 6 7). The pivot 4 partitions (4 2 1 3 0) into just one
        subarrays (0 2 1 3), as shown in Figure 23.7c. Apply quick sort on (0 2 1 3). The pivot
        0 partitions
        it into just one subarrays (2 1 3), as shown in Figure 23.7d. Apply quick sort on
        (2 1 3). The pivot 2 partitions it into (1) and (3), as shown in Figure 23.7e. Apply quick sort
        on (1). Since the array contains just one element, no further partition is needed.


        QuickSort er en effektiv sorteringsalgoritme,
        der anvender en strategi kendt som "divide and conquer"
        (del og hersk) for at sortere elementer i en liste eller et array.
        Algoritmen vælger et såkaldt "pivot"-element fra listen og placerer elementer mindre end pivot til
         venstre og elementer større end pivot til højre.
         Denne proces gentages rekursivt for de to resulterende delmængder,
          indtil hele listen er sorteret.

        figur 23.


        benytter to overloaded quickSort metoder første metode brugt til at soretere
        array og anden er en hjælper metode der sortere subarray
        med sepcificeret range

         */

        int [] list = {2,3,2,5,6,1,-2,3,14,13};
        quickSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }



    }

    public static void quickSort(int[] list){ // sort metode
        quickSort(list,0,list.length-1);
    }


    public static void quickSort(int[] list, int first,int last){ // helper method
        if(last > first){
            int provtIndex = partition(list,first,last);
            quickSort(list,first,provtIndex-1); //rekursiv kald
            quickSort(list,provtIndex+1,last);
        }
    }

    private static int partition(int[] list, int first, int last) {
        int pivot = list[first]; // choose the first element as the pivot
        int low = first + 1; // index for forward search
        int high = last; // index for backward search

        /*
          Initialisering:

        pivot: Det første element i arrayet vælges som pivot.
        low: Initialiserer et index for søgning fremad (starter fra elementet efter pivot).
        high: Initialiserer et index for søgning bagud (starter fra det sidste element i arrayet).
         */

        while (high > low) {
            // search forward from left
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // search backward from right
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // swap two elements in the list
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        /*
          Partitionering:
       Metoden bruger en kombination af søgninger fremad (low) og bagud (high) for at finde elementer, der skal byttes.
       Den ydre while-løkke fortsætter så længe high er større end low.
       Den første indre while-løkke søger fremad fra venstre, indtil den finder et element større end pivot.
       Den anden indre while-løkke søger bagud fra højre, indtil den finder et element mindre end eller lig med pivot.
      Hvis high er større end low, byttes elementerne på positionerne high og low.
         */

        // swap pivot with list[high]
        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }

        /*
           Endelig bytning:
      Efter partitioneringen er færdig, byttes pivot med elementet på den endelige position af high.
      Hvis pivot er større end elementet ved high, byttes de, og index high returneres.
      Hvis pivot ikke er større end elementet ved high, returneres den oprindelige pivot-index (first).
      Formålet med denne metode er at partitionere arrayet omkring et pivot-element og returnere pivot-indexet
       efter partitioneringen. Denne index bruges derefter i QuickSort-algoritmen til yderligere rekursiv
       sortering af underarrayerne.

         */


        /*
        Det rekursion så det vil sige man skære listen ud hele tiden:
        Initial State:

        Array: [6, 5, 4, 9, 10, 2, 3, 5, 54, 32]
        Pivot: 6 (chosen as the first element)

       Partitioning:

       Partition the array into two subarrays:
       Elements less than 6: [5, 4, 2, 3, 5]
       Elements greater than 6: [9, 10, 54, 32]
       Recursive Calls:

       Apply QuickSort recursively on both subarrays:
       Subarray with elements less than 6: [5, 4, 2, 3, 5]
       Pivot for this recursive call: 5 (chosen as the first element)
       Subarray with elements greater than 6: [9, 10, 54, 32]
       Pivot for this recursive call: 9 (chosen as the first element)

       Further Recursive Calls:

      Continue the process for each subarray, and in each recursive call,
      a new pivot is chosen based on the selected pivot strategy.

      In summary, each recursive call involves a new pivot selection,
      and the partitioning process is applied to the subarrays.
      The specific pivot chosen in each recursive call may vary based on the chosen strategy
      (e.g., first element, last element, random element).
      This continues until the base case is reached, where the subarrays have one or zero elements,
      making them inherently sorted.
      The sorted subarrays are then combined to produce the final sorted array.


      figur 23.8 illustrere hvordan partiation af array(5,2,9,3,8,4,0,1,6,7)

      For at opdele en række elementer af n elementer ved hjælp af Quicksort kræves n sammenligninger
      og n flytninger i det værste tilfælde.
      Derfor er tiden der kræves for partion O(n)

      I Værste tilfælde deler pivoten rækken hver gang op i en stor del række med den anden række tom
      Størelsen af den store delrække er mindre end den, der blev delt før
      Algoritmen kræver i alt (n-1) +(n-2) + ....2+1 = O(n^2) tid i værste tilfælde,
      da hvert element bliver sammenlignet med hver andet element

      I bedste tilfælde, er pivot deler arrayet hver gang i to dele der har nogenlunde samme størelse
      lad T(n) beskrive tiden det tager for sortering af array a n elementer ved brug af quick sort
      derved
      T(n) = T(n/2) + T(n/2) + n(partition time)  minder om merge sort T(n) = O(n log(n))

      I gennemsnit, vil pivot ikke dividere array ind i dele af samme størelse eller en tom del
      hver gang

      Statistisk, er størrelsen af to dele tæt på hinanden
      derfor er gennemsnit tid der kræves O(n log(n)) hvor denne præcise average er
      uden for scope for bogen

      Both merge and quick sorts employ the divide-and-conquer approach. For merge sort, the bulk
      of the work is to merge two sublists, which takes place after the sublists are sorted.
      For quick sort,
      the bulk of the work is to partition the list into two sublists,
      which takes place before the sublists
      are sorted. Merge sort is more efficient than quick sort in the worst case,
      but the two are equally
      efficient in the average case.
      Merge sort requires a temporary array for sorting two subarrays. Quick
      sort does not need additional array space.
      Thus, quick sort is more space efficient than merge sort.










         */
    }


}
