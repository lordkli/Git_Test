package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
//    6) If a list has 15 or 13, remove them.
//    Example: (10, 31, 15, 13, 54) ==> Output is (10, 31, 54)
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(10, 31, 15, 13, 54));
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == 13){
            list.remove(i);
        }
        if (list.get(i) == 31){
            list.remove(i);
        }
    }
    System.out.println(list);
}
}
