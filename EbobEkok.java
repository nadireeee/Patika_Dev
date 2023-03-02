package Giris;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[]args){
        Scanner n = new Scanner(System.in);
        int buyuk,kucuk, ekok=1,ebob=1;
        System.out.println("a sayısını giriniz : ");
        int a = n.nextInt();
        System.out.println("b sayısını giriniz : ");
        int b = n.nextInt();

        if(a>b)
        {
            buyuk=a;
            kucuk=b;
        }
        else
            buyuk=b;
            kucuk=a;

            int i = 1;
            while(i<=kucuk)
            {
                if(a%i==0 && b%i==0)
                    ebob = i;
                     i++;
            }
        System.out.println("Ebob : " + ebob);
            ekok = (a*b)/ebob;
        System.out.println("Ekok : " + ekok);





    }
}
