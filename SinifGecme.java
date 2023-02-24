package Giris;

import java.util.Scanner;

public class SinifGecme {
    public SinifGecme() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz. ");
        int Mat = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        int Fiz = inp.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz. ");
        int Tur = inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz. ");
        int Kim = inp.nextInt();
        System.out.println("Müzik Notunuzu Giriniz. ");
        int Muz = inp.nextInt();
        if (Mat >= 0 && Mat <= 100 && Fiz >= 0 && Fiz <= 100 && Tur >= 0 && Tur <= 100 && Kim >= 0 && Kim <= 100 && Muz >= 0 && Muz <= 100) {
            double ort = (double)((Mat + Fiz + Tur + Kim + Muz) / 5);
            System.out.println("Ortalamnız: " + ort);
            if (ort >= 55.0) {
                System.out.println("Sınıf geçtiniz");
            } else {
                System.out.println("Kaldınız");
            }
        } else {
            System.out.println("Notunuzu kontrol ediniz");
        }

    }
}
