package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public HesapMakinesi() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        int a = inp.nextInt();
        System.out.println("2.sayıyı giriniz");
        int b = inp.nextInt();
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölüm ");
        System.out.println("Seçiminiz: ");
        int islem = inp.nextInt();
        switch (islem) {
            case 1:
                System.out.println("toplam: " + (a + b));
                break;
            case 2:
                System.out.println("fark: " + (a - b));
                break;
            case 3:
                System.out.println("çarpım: " + a * b);
                break;
            case 4:
                if (b != 0) {
                    System.out.println("bölüm: " + a / b);
                } else {
                    System.out.println("sayı bölünemez");
                }
                break;
            default:
                System.out.println("yanlis secim sectiniz");
        }

    }
}
