package Giris;
import java.util.Scanner;
public class Asal {
    public Asal() {
    }

    public static void main(String[] args) {
        new Scanner(System.in);
        boolean sayac = true;

        for(int i = 2; i < 100; ++i) {
            sayac = true;

            for(int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    sayac = false;
                    break;
                }
            }

            if (sayac) {
                System.out.println(i);
            }
        }

    }
}
