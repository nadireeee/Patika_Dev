package Giris;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[]args) {
        Scanner a = new Scanner(System.in);
        int toplam = 0;
        int n = a.nextInt();
        System.out.println("Bir sayı giriniz : " + n);
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                toplam += i;
            }
        }
        if (toplam == n) {
            System.out.println(n + " Mükemmel sayıdır");
        } else
            System.out.println("Mükemmel sayı değildir");
    }
}
