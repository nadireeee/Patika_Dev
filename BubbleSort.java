package Giris;

import java.util.Scanner;
public class BubbleSort {
    public BubbleSort() {
    }

    public static void main(String[] args) {
        int[] dizi = new int[50];

        int temp;
        for(temp = 0; temp < dizi.length; ++temp) {
            dizi[temp] = (int)(Math.random() * 51.0);
        }

        System.out.println("Rastgele sayılarınız:");

        int i;
        for(i = 0; i < dizi.length; ++i) {
            System.out.println(dizi[i]);
        }

        System.out.println();

        for(i = 0; i < dizi.length - 1; ++i) {
            for(int j = 0; j < dizi.length - 1 - i; ++j) {
                if (dizi[j] > dizi[j + 1]) {
                    temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        System.out.print("Sayılarınız Sıralanmış hali ");

        for(i = 0; i < dizi.length; ++i) {
            System.out.println(dizi[i]);
        }

    }
}
