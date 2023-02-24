package Giris;
import java.util.Scanner;

public interface Faktoriyel {
    static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Faktöriyel Sayısını Giriniz");
        int n = inp.nextInt();
        int total = 1;

        for(int i = 1; i <= n; ++i) {
            total *= i;
        }

        System.out.println("" + n + ".Faktoriyel: " + total);
    }
}