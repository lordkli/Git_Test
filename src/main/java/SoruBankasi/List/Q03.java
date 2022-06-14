package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
//    3) Find the multiplication of all even list elements in an integer list
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,7,10,12,3,4));
    int mult = 1;
    for (Integer w : list ){
        if (w % 2 == 0){
            mult *= w;
        }
    }
    System.out.println(mult);

}
}
