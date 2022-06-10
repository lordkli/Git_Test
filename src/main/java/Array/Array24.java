package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array24 {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> aOlmayanIsimler = new ArrayList<String>();

        for (String w : isimler){
            if (!w.toLowerCase().contains("a")){
                aOlmayanIsimler.add(w);
            }
        }
        System.out.println("a olmayan isimler : " + aOlmayanIsimler);
        isimler.clear();
        isimler.addAll(aOlmayanIsimler);
        System.out.println(isimler);

    }
}
