package Array;

public class Array09 {
    public static void main(String[] args) {
        String[][] arr = {{"$12" , "$22" , "0$"}, {"€9" , "€40" , "$1"},{"€12" , "$2" , "$0"}};
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j].contains("$")){
                    toplam += Double.parseDouble(arr[i][j].replace("$","")) * 3.2 ;
                }
                else if(arr[i][j].contains("€")){
                    toplam += Double.parseDouble(arr[i][j].replace("€","")) * 4.2;
                }

            }
        }
        System.out.println("Toplam : " + toplam);
    }
}
