package Giris;

import java.util.Scanner;

public class ManavProgrami {
    public ManavProgrami() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double akilo = 2.14;
        double ekilo = 3.67;
        double dkilo = 1.11;
        double mkilo = 0.95;
        double pkilo = 5.0;
        System.out.println("armut kaç kilo ?");
        double armut = inp.nextDouble();
        System.out.println("elma kaç kilo ?");
        double elma = inp.nextDouble();
        System.out.println("domates kaç kilo ?");
        double domates = inp.nextDouble();
        System.out.println("muz kaç kilo ?");
        double muz = inp.nextDouble();
        System.out.println("patlıcan kaç kilo");
        double patlican = inp.nextDouble();
        double total = armut * akilo + elma * ekilo + domates * dkilo + muz * mkilo + patlican * pkilo;
        System.out.println("Toplam Tutar " + total);
    }
}



