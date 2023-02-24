package Giris;

import java.util.Scanner;

public class UsHesaplama {
    public UsHesaplama() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 1;
        int i = 1;
        System.out.println("üssü alınacak sayıyı giriniz: ");
        int a = inp.nextInt();
        System.out.println("üs olacak sayı: ");

        for(int b = inp.nextInt(); i <= b; ++i) {
            total *= a;
        }

        System.out.println("Cevap:" + total);
    }
}
