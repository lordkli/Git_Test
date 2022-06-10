package Array;

import java.util.ArrayList;
import java.util.List;

public class Array01 {
    public static void main(String[] args) {
        int arr[] = {3,4,2,5,4,3,3,2,2,1};
        int istenmeyenEleman = 4;

        istenmeyenElementiSil(arr, istenmeyenEleman);

    }

    public static void istenmeyenElementiSil(int arr[],int istenmeyenEleman) {

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyenEleman){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);

    }

}
