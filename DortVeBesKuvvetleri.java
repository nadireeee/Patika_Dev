package Giris;

import java.util.Scanner;

public class DortVeBesKuvvetleri {
    public DortVeBesKuvvetleri() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("sayınız giriniz");
        int s = inp.nextInt();

        int j;
        for(j = 1; j <= s; j *= 4) {
            System.out.println("4'ün kuvvetleri: " + j);
        }

        for(j = 1; j <= s; j *= 5) {
            System.out.println("5'in kuvvetleri " + j);
        }

    }
}
