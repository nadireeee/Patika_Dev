package Giris;

import java.util.Scanner;

public class Combination {
    public Combination() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ntotal = 1;
        int rtotal = 1;
        int R = 1;
        System.out.println("n sayısını giriniz");
        int n = inp.nextInt();
        System.out.println("r sayısını giriniz");
        int r = inp.nextInt();

        int k;
        for(k = 1; k <= n; ++k) {
            ntotal *= k;
        }

        for(k = 1; k <= r; ++k) {
            rtotal *= k;
        }

        for(k = 1; k <= n - r; ++k) {
            R *= k;
        }

        int kombinasyon = ntotal / (rtotal * R);
        System.out.println("KOMBİNASYON" + kombinasyon);
    }
}
