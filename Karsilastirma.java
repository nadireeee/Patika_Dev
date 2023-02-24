package Giris;

public class Karsilastirma {
    public Karsilastirma() {
    }

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 10;
        int D = 40;
        System.out.println(A == D);
        System.out.println(A == C);
        System.out.println(C == D);
        System.out.println(A != D);
        System.out.println(A != C);
        System.out.println(C != B);
        System.out.println(A > D);
        System.out.println(D > C);
        System.out.println(C > B);
        System.out.println(A >= D);
        System.out.println(A >= C);
        System.out.println(C >= B);
        System.out.println(A < D);
        System.out.println(D < C);
        System.out.println(C < B);
        System.out.println(A <= D);
        System.out.println(A <= C);
        System.out.println(C <= B);
    }
}

