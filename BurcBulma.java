package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BurcBulma {

    public static void main(String[] args) {
        int month, day;
        Scanner a = new Scanner(System.in);
        System.out.println("Doğduğunuz ay : ");
        month = a.nextInt();

        System.out.println("Doğduğunuz gün : ");
        day = a.nextInt();

        if (month == 1) {
            if (day >= 22) {
                System.out.println("Kova burcu");
            } else

                System.out.println("Oğlak burcu");
        }

        if (month == 2) {
            if (day >= 20) {
                System.out.println("Balık burcu");
            } else
                System.out.println("Kova burcu");
        }
        if (month == 3) {
            if (day >= 21) {
                System.out.println("Koç burcu");
            } else
                System.out.println("Balık burcu");
        }
        if (month == 4) {
            if (day >= 21) {
                System.out.println("Boğa burcu");
            } else
                System.out.println("Koç burcu");
        }
        if (month == 5) {
            if (day >= 22) {
                System.out.println("İkizler burcu");
            } else
                System.out.println("Boğa burcu");
        }
        if (month == 6) {
            if (day >= 23) {
                System.out.println("Yengeç burcu");
            } else
                System.out.println("İkizler burcu");
        }
        if (month == 7) {
            if (day >= 23) {
                System.out.println("Aslan burcu");
            } else
                System.out.println("Yengeç burcu");
        }
        if (month == 8) {
            if (day >= 23) {
                System.out.println("Başak burcu");
            } else
                System.out.println("Aslan burcu");
        }
        if (month == 9) {
            if (day >= 23) {
                System.out.println("Akrep burcu");
            } else
                System.out.println("Başak burcu");
        }
        if (month == 10) {
            if (day >= 23) {
                System.out.println("Akrep burcu");
            } else
                System.out.println("Terazi burcu");
        }

        if (month == 11) {
            if (day >= 22) {
                System.out.println("Yay Burcu");
            } else
                System.out.println("Akrep Burcu");

        }

        if (month == 12) {
            if (day >= 22) {
                System.out.println("Oğlak Burcu");
            } else
                System.out.println("Yay Burcu");
        }
    }
}
