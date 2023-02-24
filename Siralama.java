package Giris;

import java.util.Scanner;

public class Siralama {
    public Siralama() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("a sayısını giriniz");
        int a = s.nextInt();
        System.out.println("b sayisini giriniz");
        int b = s.nextInt();
        System.out.println("c sayisini giriiniz");
        int c = s.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<c<b");
            }
        } else if (b < a && b < c) {
            if (a < c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<c<a");
            }
        } else if (a < b) {
            System.out.println("c<a<b");
        } else {
            System.out.println("c<b<a");
        }

    }
}
