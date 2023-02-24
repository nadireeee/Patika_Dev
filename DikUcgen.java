package Giris;

import java.util.Scanner;

public class DikUcgen {
    public DikUcgen() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("a kenarini giriniz");
        int a = inp.nextInt();
        System.out.println("b kenarini giriniz");
        int b = inp.nextInt();
        double c = Math.sqrt((double)(a * a + b * b));
        System.out.println("hipotenüs " + c);
    }
}

