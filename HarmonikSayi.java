package Giris;

import java.util.Scanner;
public class HarmonikSayi {
    public HarmonikSayi() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double result = 0.0;
        System.out.println("n sayısını giriniz: ");
        int a = inp.nextInt();

        for(double i = 1.0; i <= (double)a; ++i) {
            result += 1.0 / i;
        }

        System.out.println(result);
    }
}

