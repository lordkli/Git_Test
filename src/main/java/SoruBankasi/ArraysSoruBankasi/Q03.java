package SoruBankasi.ArraysSoruBankasi;

public class Q03 {
    //    Find the elements whose length is the smallest in a String array
//    Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
    public static void main(String[] args) {
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        int minLength = b[0].length();

        for (String  w : b){
            minLength = Math.min(minLength,w.length());
        }
        for (String w : b ){
            if (minLength == w.length()){
                System.out.println(w);
            }
        }


    }
}
