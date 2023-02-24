package Giris;

import java.util.Scanner;

public class UcgenAlani {
    public UcgenAlani() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1.kenari giriniz");
        int n = inp.nextInt();
        System.out.println("2.kenari giriniz");
        int a = inp.nextInt();
        System.out.println("3.kenari giriniz");
        int d = inp.nextInt();
        int u = (n + a + d) / 2;
        int cevre = 2 * u;
        System.out.println("Çevre Uzunluğu " + cevre);
        double Alan = Math.sqrt((double)(u * (u - n) * (u - a) * (u - d)));
        System.out.println("Alan Uzunluğu " + Alan);
    }
}
