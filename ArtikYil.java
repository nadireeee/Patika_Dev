package Giris;

import java.util.Scanner;

public class ArtikYil {
        public ArtikYil() {
        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.println("Yılı Girini<:");
            int y = inp.nextInt();
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println("" + y + " Artık bir yıldır");
                } else {
                    System.out.println("" + y + " Artık yıl değildir");
                }
            } else if (y % 4 == 0) {
                System.out.println("" + y + "Artık yıldır");
            } else {
                System.out.println("" + y + " Artık yıl değildir");
            }

        }
    }

