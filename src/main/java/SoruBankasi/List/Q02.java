package SoruBankasi.List;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
//    2) Find the sum of all list elements before the first occurrence of 13 in an integer list
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(12,21,32,13,24,64));

        int sum = 0;
        for (Integer w : list){
            if (w == 13){
                break;
            }sum += w;

        }
        System.out.println(sum);

    }
}
