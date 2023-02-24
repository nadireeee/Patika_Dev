package Giris;

import java.util.Scanner;

public class TekSayilarinToplami {
    public TekSayilarinToplami() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;

        int s;
        do {
            System.out.println("Sayınızı Giriniz");
            s = inp.nextInt();
            if (s % 2 == 1) {
                total += s;
            }
        } while(s > 0);

        System.out.println("Tek sayıların toplamı: " + total);
    }
}
