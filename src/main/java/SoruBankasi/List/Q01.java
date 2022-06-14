package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q01 {
//    1) Find the sum of all list elements in an integer list
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,5,7,10));
    list.add(12);
    list.add(20);
    int sum = 0;
    for (int w : list){
        sum += w;
    }
    System.out.println(sum);

}
}
