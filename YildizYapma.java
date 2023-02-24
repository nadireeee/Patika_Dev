package Giris;

import java.util.Scanner;

public class YildizYapma {
    public YildizYapma() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Basamak sayısnı giriniz: ");
        int b = inp.nextInt();

        int i;
        int y;
        for(i = 1; i <= b; ++i) {
            for(y = 1; y <= b - i; ++y) {
                System.out.print(" ");
            }

            for(y = 1; y <= 2 * i - 1; ++y) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(i = 1; i <= b; ++i) {
            for(y = 1; y <= i; ++y) {
                System.out.print(" ");
            }

            for(y = 1; y <= 2 * b - (2 * i + 1); ++y) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
