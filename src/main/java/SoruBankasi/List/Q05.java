package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
//    5) If the list has 15 as element, change all 15s to 51}
//    Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(12, 11, 15, 34, 43));
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i) == 15){
            list.set(i,51) ;
        }
    }
    System.out.println(list);

}

}