package opgaver;

import java.util.ArrayList;
import java.util.List;

public class Opgave10Rekursiv {
    public static void main(String[] args) {
        //Opgave 11
        List<Integer> list = new ArrayList<>(List.of(10,10,10));
        int n = 10;
        System.out.println(rekursivBeregning(n));

    }

//    private static int rekursivBeregning(List<Integer> list,int first) {
//        if(first == list.size()-1){
//            return list.get(first);
//        }
//        if(list.get(first) % 2 == 0) {
//            list.set(first,2*list.get(first)-3-list.get(first)-1);
//            return list.get(first) + rekursivBeregning(list, first + 1);
//        }
//        else {
//            list.set(first,list.get(first)-1+list.get(first)-2+3*list.get(first)-3);
//            return list.get(first) + rekursivBeregning(list, first + 1);
//
//        }
//
//    }

//    private static int rekursivBeregning(int n) {
//
//        if (n == 0) {
//            return 2;
//        }
//        else if (n == 1) {
//            return 1;
//        }
//        else if (n == 2) {
//            return 5;
//        }
//        else {
//            if (n % 2 == 0) {
//                return 2 * rekursivBeregning(n - 3) * rekursivBeregning(n - 1);
//            }
//            else {
//                return rekursivBeregning(n - 1) + rekursivBeregning(n - 2) + 3 * rekursivBeregning(n - 3);
//            }
//        }
//    }



    private static int rekursivBeregning(int n) {
        int result = 0;
        if (n == 0) {
            result += 2;
        }
        else if (n == 1) {
            result += 1;
        }
        else if (n == 2) {
            result += 5;
        }
        else {
            if (n % 2 == 0) {
               result += 2 * rekursivBeregning(n - 3) - rekursivBeregning(n - 1);
            }
            else {
              result += rekursivBeregning(n - 1) + rekursivBeregning(n - 2) + 3 * rekursivBeregning(n - 3);
            }
        }
        return result;
    }

}
