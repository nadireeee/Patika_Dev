package Giris;
import java.util.Scanner;

public class CiftVeDortSayilarininOrt {
    public  CiftVeDortSayilarininOrt() {
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total = 0;

        int s;
        do {
            System.out.println("Sayınızı Giriniz: ");
            s = inp.nextInt();
            if (s % 4 == 0) {
                total += s;
            }
        } while(s % 2 == 0);

        System.out.println("toplam: " + total);
    }
}
