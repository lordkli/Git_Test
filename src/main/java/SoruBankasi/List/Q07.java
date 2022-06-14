package SoruBankasi.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q07 {
    //    7) Find the closest 2 integers in an Integer List
//    Example: (12, 31, 15, 13, 54) ==> Output is 12 and 13
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(12, 31, 15, 13, 54));
        Collections.sort(list);
        int minDiff = list.get(2) - list.get(1);

        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, list.get(i) - list.get(i - 1));

        }
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) - list.get(i - 1) == minDiff) {
                System.out.println(list.get(i) + " and " + list.get(i - 1));
            }

        }
    }
}