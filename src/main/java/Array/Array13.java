package Array;



public class Array13 {
    public static void main(String[] args) {
        int arr [][] = {{1,2,-3},{41,55},{-61,-17,80}};


        maxDegeriBul(arr);

    }

    private static void maxDegeriBul(int[][] arr) {
        int maxDeger = arr[0][0] ;
        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length;daire++) {
                if (arr[kat][daire] > maxDeger){
                    maxDeger = arr[kat][daire];
                }

            }
        }
        System.out.println(maxDeger);


    }

}
