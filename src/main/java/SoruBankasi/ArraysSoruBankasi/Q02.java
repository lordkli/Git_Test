package SoruBankasi.ArraysSoruBankasi;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {
//        Find the smallest positive element and greatest negative element in an integer array
//        Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i=0;i<a.length;i++){
            if (a[i]<0 && a[i+1]>0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i+1]);
            }
        }
        }
    }

