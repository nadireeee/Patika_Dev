package Giris;

import java.util.Scanner;

public class DaireAlanCevre {
    public DaireAlanCevre() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("dairenin yarıçapını giriniz");
        int r = inp.nextInt();
        double alan = pi * (double)r * (double)r;
        double cevre = 2.0 * pi * (double)r;
        System.out.println("Dairenin alanı " + alan);
        System.out.println("Dairenin cevresi " + cevre);
    }
}
