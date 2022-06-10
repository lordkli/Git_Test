package Array;

import java.util.ArrayList;
import java.util.List;

public class Array03 {
    public static void main(String[] args) {
        List<Double> sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(2.4);
        sayilar.add(3.0);
        sayilar.add(4.2);
        sayilar.add(5.5);
        sayilar.add(2.0);
        sayilar.add(1.3);
        Integer a = 13;

        double ortalama = 0;
        double toplam = 0;

        //ortalamaBul();asdas

        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }

        //Ortalama
        ortalama = toplam/sayilar.size();
        System.out.println(ortalama);

        //Ortalamanin üstündeki sayilar
        List<Double> ortalamaUstundekiSayilar = new ArrayList<>();
        for (int i = 0; i < sayilar.size();i++){
            if (sayilar.get(i) > ortalama){
                ortalamaUstundekiSayilar.add(sayilar.get(i));

            }
        }
        System.out.println("Ortalamanin uzrindeki sayilar: " + ortalamaUstundekiSayilar);

    }

}
