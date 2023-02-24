package Giris;

import java.util.Scanner;

public class UcakBileti {
    public UcakBileti() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pirkm = 0.1;
        System.out.println("Mesafeyi giriniz");
        int km = inp.nextInt();
        double ut = (double)km * 0.1;
        System.out.println("Bilet tutarınız: " + ut);
        System.out.println("yaşınızı giriniz");
        int yas = inp.nextInt();
        System.out.println("Yolculuk yonunu giriniz : ");
        System.out.println("1 => Tek Yön\n2 => Gidis-Donus");
        int tip = inp.nextInt();
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            if (yas <= 12) {
                ut -= ut * 0.5;
            } else if (yas > 12 && yas <= 24) {
                ut -= ut * 0.1;
            } else if (yas >= 65) {
                ut -= ut * 0.3;
            }

            switch (tip) {
                case 1:
                    System.out.println("Bilet ücretiniz:" + ut);
                    break;
                case 2:
                    ut = (ut - ut * 0.2) * 2.0;
                    System.out.println("Bilet ücretiniz:" + ut);
            }
        } else {
            System.out.println("Hatlı veri girdiniz");
        }

    }
}
