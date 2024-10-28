package mergeSort;

public class MergeSortRekur {
    public static void main(String[] args) {
        /*
        Merge sort algoritmen kan beskrives rekursivt som følgende:
        Algoritmen deler array i to halve og udføre merge sort på hver halvdel rekursivt
        Efter de halve er sorteteret merger den dem

        man kan se på figur 23. 4
        illustrer en merge sort af 8 elementer (2, 9,5,4,8,1,6,7)

        orginal array splittes op i to dele
        (2,9,5,4) og (8,1,6,7)
        Udføre en merge sort på disse to subarrays rekursivt for at dele:
        (2,9,5,4) til (2,9) og (5,4)
        og (8,1,6,7) ind til (8,1) og (6,7)
        dette forsætter til subarrys kun indeholder 1 element  fx (2,9) bliver (2) og (9)
        siden array (2) kun indeholder 1 element kan det ikke deles yderligere
        og nu merger man (2) med (9) ind til et nyt sorted array (2,9) og (5) med (4) til
        (4,5) osv






        eksempel under
         */
        // en test metode
        int[] list = {2,9,5,4,8,1,6,7};

        mergeSort(list);
        for(int i = 0;  i < list.length; i++){
            System.out.print(list[i] + " ");
        }

    }

    private static void mergeSort(int[] list) {
        if(list.length > 1){
            // merge sort første halv del
            int[] firstHalf = new int[list.length /2 ];
            System.arraycopy(list,0,firstHalf,0,list.length/2);
            mergeSort(firstHalf);

            //merge sort anden del
            int secondHalfLength = list.length - list.length / 2;
            int[]secondHalf = new int[secondHalfLength];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);

            //Merge første del med anden ind til list
            mergeMetode(firstHalf,secondHalf,list);

        }
    }

    private static void mergeMetode(int[] firstHalf, int[] secondHalf, int[] list) {
        int current1 = 0; // curent index firstHalf
        int current2 = 0; // current index secondHalf
        int current3 = 0; // current index in list

        while(current1 < firstHalf.length && current2 < secondHalf.length){
            if(firstHalf[current1] < secondHalf[current2]){
                list[current3++] = firstHalf[current1++];
            }
            else {
                list[current3++] = secondHalf[current2++];
            }
            }

            while (current1 < firstHalf.length){
                list[current3++] = firstHalf[current1++];
            }
            while (current2 < secondHalf.length){
                list[current3++] = secondHalf[current2++];
            }
    }


    /*
    mergeSort metode linje til 40 - 54  laver et nyt array, firstHalf som kopier første halv del
    af list, derefter laver den et rekursivt kald på firstHalf linje 45  mergeSort()
    længde er firstHalf.length = list /2

    Længde for secondHalf = list.length -list.length /2
    og det nye array secondHalf var lavet til at holde anden del af orginal arrayet

    algoritme invoker mergeSort rekursivt på secondHalf (linje 51)

    efter firstHalf og secondHalf er sorteret så bliver de merged til list linje 54

    Merge metode  linje 59 - 79 merger to arrays firstHalf og secondHalf ind i list arrayet

    current1 og current2 pointer til den nuværende element i der skal kigges på i firstHalf
    og secondHalf

    metode gentagende gange sammenligner nuværende element i firstHalf og secondHalf og flytter den
    mindste af elementerne til list

    current1 forøges med 1  hvis den mindste er i firstHalf
    current2 forøges med 1 hvis den mindste er i second half

    tilsidst, er alle elementer i en af de to halve lister flyttet over til list
    og hvis der stadig mangler fra den skal resten overføres fra fx secondHalf til list

    figur 23.5 illustrere det

    The mergeSort method creates two temporary arrays (lines 6 and 12) during the dividing
    process, copies the first half and the second half of the array into the temporary arrays (lines 7
    and 13), sorts the temporary arrays (lines 8 and 15), then merges them into the original array
    (line 18), as shown in Figure 23.6a. You can rewrite the code to recursively sort the first half
    of the array and the second half of the array without creating new temporary arrays, then merge
    the two arrays into a temporary array and copy its contents to the original array, as shown in
    Figure 23.6b. This is left for you to do in Programming Exercise 23.20.


    Hvis man skal analyser runing time for merge sort

    T(n) beskriver tid der skal bruges for at sort n - elementer med merge sort

    Uden tab af generalitet, antag at n er et power af 2
    merge sort algortime splitter aray i to subarray, og sorts subarray ved
    at bruge samme algoritme rekursivt, derefter merger subarrays derfor:

    T(n) = T(n/2) + T(n/2) + mergetime

    første T(n/2) er tiden for at soretere først halvdel af array og anden T(n/2)
    er tiden for at sorting anden halvdel

    For at merge to subarrays, tager det n-1 sammenligninger at sammenligne
    to elementer fra to subarrays, og n antal flytninger for at flytte element til
    sammenlings array (temp array)

    derfor er total time 2n-1  og derfor er formlen

    T(n) = T(n/2)+T(n/2) + 2n-1 = O(nlog(n))

    Kompleksiteten af merge sort er: O(nlog(n))  (BIG O)
    Denne algoritme er bedre en selection sort, insertion sort og bubble sort
    da deres kompleksistet af algoritmen, performance er O(n^2)

    sort metode i java.utill.Arrays class er implementeret ved brug af en række variationer
    af merge sort algoritme



    //Hvis man tegner et rekursion træ vil man i en merge sort elementerne i
    listen til de er helt alene og så begynde at merge/sort dem sammen

    




     */
}
