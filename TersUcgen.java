package Giris;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int a = inp.nextInt();
            System.out.println("Basamak sayınız : " + a);
            int i,y,j;

            for(i = a; i >= 1; i--) {
                for(y = a-1; y >= 1; y--) {
                    System.out.print(" ");
                }
                for(j=1; j<=2*i-1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }


                }
            }

