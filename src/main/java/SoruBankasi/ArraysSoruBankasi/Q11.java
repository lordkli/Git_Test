package SoruBankasi.ArraysSoruBankasi;

import java.util.Arrays;

public class Q11 {
//    11) Type code to put all zeros to end in an integer array.
//    Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
public static void main(String[] args) {
    Integer [] arr = new Integer[]{0,0,1,2,3,4,5,6,0};
    Integer[] yeniArr = new Integer[arr.length];
    int firstIdx = 0;
    int lastIdx = arr.length-1;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] != 0){
            yeniArr[firstIdx] = arr[i];
            firstIdx++;
        }
        else {
            yeniArr[lastIdx] = arr[i];
            lastIdx--;
        }

    }
    System.out.println(Arrays.toString(yeniArr));
}
}
