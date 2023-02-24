package Giris;

import java.util.Scanner;

public class NotOrtalamasi {
    public NotOrtalamasi() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("türkce notunuzu giriniz");
        int türkce = inp.nextInt();
        System.out.println("mat notunuzu giriniz");
        int mat = inp.nextInt();
        System.out.println("fizik notunuzu giriniz");
        int fizik = inp.nextInt();
        System.out.println("tarih notunuzu giriniz");
        int tarih = inp.nextInt();
        System.out.println("müzik notunuzu giriniz");
        int müzik = inp.nextInt();
        System.out.println("kimya notunuzu giriniz");
        int kimya = inp.nextInt();
        int toplam = türkce + mat + fizik + tarih + müzik + kimya;
        double sonuc = (double)(toplam / 6);
        System.out.println("Ortalama: " + sonuc);
        boolean gecti = sonuc > 60.0;
        boolean kaldı = sonuc < 60.0;
        String durum = gecti ? "Sınıfı gecti" : "Sınıfta kaldı";
        System.out.println(durum);
    }
}

