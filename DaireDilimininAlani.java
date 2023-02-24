package Giris;

import java.util.Scanner;

public class DaireDilimininAlani {
    public DaireDilimininAlani() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("dairenin yarıçapını giriniz");
        int r = inp.nextInt();
        System.out.println("merkez açısının ölçüsünü giriniz");
        int a = inp.nextInt();
        double alan = pi * (double)(r * r) * (double)a / 360.0;
        System.out.println("Daire Diliminin Alanı " + alan);
    }
}
