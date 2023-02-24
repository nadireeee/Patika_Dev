package Giris;

import java.util.Random;

public class Ders {
    public Ders() {
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int deger1 = rnd.nextInt(10);
        System.out.println(deger1);
        int deger2 = rnd.nextInt(10);
        System.out.println(deger2);
        int fark = deger1 - deger2;
        System.out.println("Farkları nedir " + fark);
        String durum = deger1 >= deger2 ? "cevap doğru" : "cevap yanlış";
        System.out.println(durum);
    }
}