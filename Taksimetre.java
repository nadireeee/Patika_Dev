package Giris;

import java.util.Scanner;

public class Taksimetre {
    public Taksimetre() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pirKm = 2.2;
        double total = 10.0;
        System.out.println("Mesafeyi km cinsinden giriniz");
        int km = inp.nextInt();
        total += (double)km * pirKm;
        total = total < 20.0 ? 20.0 : total;
        System.out.println("Toplam tutar: " + total);
    }
}
