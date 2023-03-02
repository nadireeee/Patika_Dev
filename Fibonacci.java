import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int x=0,y=1,total=0;
        System.out.print("Eleman sayınızı giriniz : ");
        int a=n.nextInt();

        for(int i=1;i<a;i++) {

            total=x+y;
            System.out.println(x+"+"+y+"="+total);
            x=y;
            y=total;

        }
    }

}