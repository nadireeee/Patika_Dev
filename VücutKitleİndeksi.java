package Giris;

import java.util.Scanner;

public class VücutKitleİndeksi {
    public VücutKitleİndeksi() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu metre cinsinden giriniz");
        double boy = inp.nextDouble();
        System.out.println("Kilonuzu giriniz");
        double kilo = inp.nextDouble();
        double indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz " + indeks);
    }
}
