package Giris;

import java.util.Scanner;

public class Kdv {
    public Kdv() {
    }

    public static void main(String[] args) {
        double kdvoran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün Tutarını Giriniz");
        double tutar = input.nextDouble();
        double kdvtutar = tutar * kdvoran;
        double kdvlitutar = tutar + kdvtutar;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV tutarı: " + kdvtutar);
        System.out.println("KDV'li tutar " + kdvlitutar);
    }
}
