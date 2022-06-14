package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q08 {
//    8) Increase the value of every element except 7 and 10 by 2 in a List
//    Example: (12, 31, 7, 13, 10) ==> Output is (14, 33, 7, 15, 10)
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(12,31,7,13,10));
    for (Integer w : list){
        if (w ==7 || w ==10){
            continue;
        }
        else {
           list.set(list.indexOf(w),w+2);
        }
    }
    System.out.println(list);
}
}
