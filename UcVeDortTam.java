package Giris;

import java.util.Scanner;

public class UcVeDortTam {
    public UcVeDortTam() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayac = 0;
        int sum = 0;
        System.out.println("Sayınızı giriniz");
        int k = inp.nextInt();

        for(int i = 1; i <= k; ++i) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println("3 ve 4 bölünen sayılar:" + i);
                sum += i;
                ++sayac;
            }
        }

        double ort = (double)(sum / sayac);
        System.out.println("1 den" + k + "sayısına kadar olan sayıların ortalaması: " + ort);
    }
}
