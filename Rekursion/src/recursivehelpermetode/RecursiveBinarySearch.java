package recursivehelpermetode;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        /*
        For binary search to work, the elements in the
        array must be in increasing order. The binary search first compares the key with the element
        in the middle of the array. Consider the following three cases:
          ■■ Case 1: If the key is less than the middle element, recursively search for the key in
             the first half of the array.
          ■■ Case 2: If the key is equal to the middle element, the search ends with a match.
          ■■ Case 3: If the key is greater than the middle element, recursively search for the key
             in the second half of the array.

      Case 1 and Case 3 reduce the search to a smaller list. Case 2 is a base case when there is a
      match. Another base case is that the search is exhausted without a match. Listing 18.6 gives a
      clear, simple solution for the binary search problem using recursion.


         */

    }

    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        return binarySearch(list,key,low,high);
    }

    public static int binarySearch(int[] list,int key,int low, int high){
        if(low > high){
            return -low -1;
        }
        int mid = (low + high) / 2;
        if(key < list[mid]){
            return binarySearch(list,key,low,mid-1);
        }
        else if(key == list[mid]){
            return mid;
        }
        else {
            return binarySearch(list,key,mid+1,high);

        }

    }
    /*
    The first method finds a key in the whole list. The second method finds a key in the list with
    index from low to high.
    The first binarySearch method passes the initial array with low = 0 and high = list.
    length − 1 to the second binarySearch method. The second method is invoked recursively
    to find the key in an ever-shrinking subarray.
     */
}
