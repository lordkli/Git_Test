package SoruBankasi.Variable;

import java.util.Scanner;

public class Variable {
    static Scanner scanner = new Scanner(System.in);

    public static void practice01(String[] args) {
        double a = 12.02;
        double b = 7.0;
        double c = -123.7;
        System.out.println("Total price = " + (a+ b+c));
    }

    public static void practice02(String[] args) {
        float a = 9.99F;
        long b = 123L;
        int z = 12;
        System.out.println("");

    }

    public static void practice03 (String[] args) {
        //Note: Simple interest formula = principal * rate * numberOfYear / 100
        System.out.println("Please enter the total amount you will deposit: ");
        double principal = scanner.nextDouble();
        float rate = 0.30F;
        System.out.println("how many years will you invest: ");
        int numberOfYear = scanner.nextInt();
        double simpleInterest = principal * rate * (numberOfYear / 100);
        System.out.println(("The simple interest is : " + simpleInterest));


    }

    public static void practice04(String[] args) {
         String str = "Ali dayi";
         long num1 = 102L;
         long num2 = 202L;
        System.out.println(str + (num1 + num2));
        System.out.println(str +num1 * num2);

    }

    public static void practice05(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a + " " + b);
    }

    public static void practice06(String[] args) {
        float priceBook = 10.25F;
        float priceNotebook = 1099.5F;
        float priceLeptop = 2070;

        System.out.println("How many books do you want to buy : ");
        int bookNumber = scanner.nextInt();
        System.out.println("How many Notebook do you want to buy : ");
        int notebookNummer = scanner.nextInt();
        System.out.println("How many leptop do you want to buy : ");
        int leptopNummer = scanner.nextInt();

        float totalPrice = bookNumber * priceBook + notebookNummer * priceNotebook + priceLeptop * leptopNummer;
        System.out.println("The total price is : " + totalPrice);

    }

    public static void practice07(String[] args) {
        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();
        int num3 ;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

    }

    public static void practice08(String[] args) {
        System.out.println("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter num2 : ");
        int num2 = scanner.nextInt();
        int num3 ;
        num3 = num1 + num2;
        num2 = num3 - num1;
        num1 = num3 - num2;

    }

    public static void practice09(String[] args) {
        short a = 12;
        int b =a;
    }

    public static void practice10(String[] args) {

        long l = 123;
        int a = (int)l;
    }

    public static void practice11(String[] args) {
        double a  = 12.32;
        float b = (float) a;
    }

    public static void practice12(String[] args) {
        double a = 12.12;
        short b = (short)a;
        System.out.println(b);
    }

    public static void practice13(String[] args) {
        byte a = 8;
        double b = (double) a;
        System.out.println(b);

    }

    public static void practice14(String[] args) {
        byte min = Byte.MIN_VALUE;
        System.out.println(min);
        short max = Short.MAX_VALUE;
        System.out.println(max);
    }







}
