package SoruBankasi.ArraysSoruBankasi;

public class Q08 {
    //8) Type code to find array elements whose first and last characters are same
    public static void main(String[] args) {

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        for (String w : arr){
            if (w.toLowerCase().charAt(0) == w.toLowerCase().charAt(w.length()-1)){
                System.out.println(w);

            }
        }
    }
}
