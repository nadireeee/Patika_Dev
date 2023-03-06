package Giris;

import java.util.Scanner;

public class DeseneGoreMetot {
    static void figure(int n) {
        System.out.print(n + " ");
        if (n <= 0)
            return;

        figure(n - 5);
        System.out.print(n + " ");
    }
 public static void main(String[]args){
     Scanner n = new Scanner(System.in);
     System.out.print("N sayısı : ");
     int a = n.nextInt();
     System.out.print("Çıktısı : " );
     figure(a);

 }


}
