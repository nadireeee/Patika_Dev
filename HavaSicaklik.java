package Giris;

import java.util.Scanner;
public class HavaSicaklik {
    public HavaSicaklik() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String et = " ";
        System.out.println("Hava sıcaklığını giriniz: ");
        float hs = sc.nextFloat();
        System.out.println("islemi giriniz");
        int islem = sc.nextInt();
        switch (islem) {
            case 1:
                et = "Kayak";
                break;
            case 2:
                et = "Sinema;";
                break;
            case 3:
                et = "Piknik";
                break;
            case 4:
                et = "Yüzme";
        }

        System.out.println("Gideceğiniz Etkinlik: " + et);
    }
}

