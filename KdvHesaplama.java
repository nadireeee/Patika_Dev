package Giris;

import java.util.Scanner;

public class KdvHesaplama {
    public KdvHesaplama() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.println("ürünün tutarını giriniz");
                int tutar = inp.nextInt();
                if (tutar < 0) {
                    System.out.println("Geçersiz Tutar Girdiniz");
                } else {
                    double kdvtutar;
                    double kdvlitutar;
                    double kdvoran;
                    if (tutar > 0 && tutar < 1000) {
                        kdvoran = 0.18;
                        kdvtutar = (double) tutar * kdvoran;
                        kdvlitutar = kdvtutar + (double) tutar;
                        System.out.println("KDV'siz tutar: " + tutar);
                        System.out.println("KDV oran: " + kdvoran);
                        System.out.println("KDV'li tutar " + kdvlitutar);
                    } else {
                        kdvoran = 0.08;
                        kdvtutar = (double) tutar * kdvoran;
                        kdvlitutar = kdvtutar + (double) tutar;
                        System.out.println("KDV'siz tutar: " + tutar);
                        System.out.println("KDV oran: " + kdvoran);
                        System.out.println("KDV'li tutar " + kdvlitutar);
                    }
                }
            }
        }
    }
}

