package Array;

public class Array18 {
    public static void main(String[] args) {
        int multiArray [][] = {{1,3,6},{2,8},{5,7,9,14}};

        System.out.println(ciftElemanlarinToplami(multiArray));
    }

    private static int ciftElemanlarinToplami(int[][] arr) {
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] % 2 == 0){
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }
}
