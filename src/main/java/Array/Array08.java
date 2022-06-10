package Array;

public class Array08 {
    public static void main(String[] args) {
        int arr [] = {5,7,-6,4,2,15,3,8,1};
        int istenenToplam = 9;
        tpMethod(arr,istenenToplam);


    }

    private static void tpMethod(int[] arr, int istenenToplam) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == istenenToplam){
                    System.out.println("i : " +arr[i] + " j : " + arr[j]);
                }
            }
        }

    }
}
