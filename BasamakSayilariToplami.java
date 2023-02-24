package Giris;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public BasamakSayilariToplami() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;
        System.out.println("sayınızı giriniz");

        int  bs;
        for(int a = inp.nextInt(); a != 0; total += bs) {
            bs = a % 10;
            System.out.println("Basamak sayınız: " + bs);
            a /= 10;
        }

        System.out.println("Basamak Değerlerinin toplamı " + total);
    }
}
