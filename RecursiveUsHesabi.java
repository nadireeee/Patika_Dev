package Giris;

import java.util.Scanner;

public class RecursiveUsHesabi {
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        if (a == 0 && b == 0) {
            System.out.println("Taban değeri 0 iken üs değeri 0 olamaz!");
        } else {
            System.out.println("Sonuç : " + result);
        }
        return result;

    }


    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true) {
            System.out.println("Taban değerini giriniz :");
            int a = n.nextInt();
            System.out.println("Üs değerini giriniz : ");
            int b = n.nextInt();
            power(a,b);
        }

    }
}