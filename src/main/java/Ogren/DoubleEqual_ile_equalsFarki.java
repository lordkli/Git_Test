package Ogren;

public class DoubleEqual_ile_equalsFarki {
    public static void main(String[] args) {
        String name1 = "John";
        String name2 = "John";
        String name3 = new String("John");
        String name4 = name1 + "";

        System.out.println("name1 == name2: " + (name1 == name2));//T
        System.out.println("name1 == name3: " + (name1 == name3));//F
        System.out.println("name1 == name4: " + (name1 == name4));//T false
        System.out.println("name1 == \"John\": " + (name1 == "John"));//T
        System.out.println("name2 == \"John\": " + (name2 == "John"));//T
        System.out.println("name3 == \"John\": " + (name3 == "John"));//Tfalse
        System.out.println("name4 == \"John\": " + (name4 == "John"));//Tfalse
        System.out.println("name1.equals(\"John\"): " + name1.equals("John"));//T
        System.out.println("name2.equals(\"John\"): " + name2.equals("John"));//T
        System.out.println("name3.equals(\"John\"): " + name3.equals("John"));//T
        System.out.println("name4.equals(\"John\"): " + name4.equals("John"));//T
    }
}
