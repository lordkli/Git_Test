package SoruBankasi.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q12 {
    static Scanner scanner = new Scanner(System.in);
    static int max = 0 ;
//    12) Mountain Array ==> [0, 2, 5, 3, 1] It is constantly increasing to the maximum value,
//    decreasing constantly after the maximum value
//    Not Mountain Array ==> [5, 2, 7, 1, 4] It is decreasing then increasing to the maximum value,
//    decreasing and increasing after the maximum value
//    Type a code to check if any given array is Mountain Array or not.
public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>(List.of(0, 2, 5, 3, 1));

    enBuyukSayiyiBulma(list);

    for (int i= 0; i<list.indexOf(max);i++){
        if (list.get(i + 1) > list.get(i)){
            for (int j = list.indexOf(max); j > list.indexOf(max) && j < list.size(); j++){
                if (list.get(j) > list.get(j + 1)){
                    System.out.println(list + " is Mountain Array");
                }
                else {
                    System.out.println((list + " is not Mountain Array"));
                }

            }

        }
        else System.out.println((list + " is not Mountain Array"));
    }
    System.out.println(list + " is Mountain Array");


}


    public static Integer enBuyukSayiyiBulma(List<Integer> list) {

    for (Integer w : list){
        if ( w > max){
            max = list.get(w);
    }

    }
    return max;
    }


}
