package Array;

import java.util.ArrayList;
import java.util.List;

public class Array02 {
    public static void main(String[] args) {
        List<Integer> sayilarList = new ArrayList<>();
        sayilarList.add(1);
        sayilarList.add(3);
        sayilarList.add(5);
        sayilarList.add(7);
        sayilarList.add(5);
        sayilarList.add(1);
        sayilarList.add(7);

        tekrarsizListeOlustur(sayilarList);
        System.out.println(sayilarList);
    }

    public static void tekrarsizListeOlustur(List<Integer> sayilarList) {
        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < sayilarList.size(); i++){
            if (!tekrarsizList.contains(sayilarList.get(i))){
                tekrarsizList.add(sayilarList.get(i));
            }
        }
        System.out.println(tekrarsizList);

    }
}
