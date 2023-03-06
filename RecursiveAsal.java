package Giris;

import java.util.Scanner;

public class RecursiveAsal {
    static void prime(int x) {
        int counter = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0)
                counter++;
        }
        if (counter <= 2 && x >= 2)
            System.out.println(x + " Sayısı ASALDIR !");
        else
            System.out.println(x + " Sayısı ASAL Değildir ! ");
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        while (true) {
            System.out.println("Sayı giriniz : ");
            int number = n.nextInt();
            prime(number);
        }
    }
}