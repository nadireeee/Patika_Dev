package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    static int sum(int x,int y) {
        int result = x + y;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int minus(int x,int y) {
        int result = x - y;
        System.out.println("Çıkarma : " + result);
        return result;
    }

    static int times(int x,int y) {
        int result = x * y;
        System.out.println("Çarpım : " + result);
        return result;
    }
    static int divided(int x,int y) {
        if (y == 0) {
            return 0;
        }
        int result = x / y;
        System.out.println("Bölüm : " + result);
        return result;
    }
    static int power(int x,int y) {
        int result = 1;
        for (int i = 1; i <=y; i++) {
            result *= x;
        }
        return result;
    }
    static int mod(int x, int y) {
        int result = x % y;
        System.out.println("Mod : " + result);
        return result;
    }
    static void calc(int x,int y) {
        System.out.println("Çevresi : " + (2 * (x + y)));
        System.out.println("Alan : " + (x * y));
    }


    public static void main(String[]args){
        Scanner a = new Scanner(System.in);
        int select;
        String menu = "1-Toplama İşlemi\n"
                +"2-Çıkarma İşlemi\n"
                +"3-Çarpma İşlemi\n"
                +"4-Bölme İşemi\n"
                +"5-Üslü Sayı Hesaplama\n"
                +"6-Mod Alma\n"
                +"7-Dikdörtgen Alan Çevre Hesaplama\n "
                +"0-Çıkış Yap";
        while(true){
            System.out.println(menu);
            System.out.println("Lütfen Bir İşlem Seçiniz : ");
            select = a.nextInt();

            if(select==0) {
                break;
            }

        System.out.println("Lütfen ilk sayıyı giriniz : ");
            int x = a.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz : ");
        int y = a.nextInt();
            switch(select) {
                case 1:
                    sum(x, y);
                    break;
                case 2:
                    minus(x, y);
                    break;
                case 3:
                    times(x, y);
                    break;
                case 4:
                    divided(x, y);
                    break;
                case 5:
                    System.out.println("Üs hesabı : " + power(x, y));
                    break;
                case 6:
                    mod(x, y);
                    break;
                case 7:
                    calc(x, y);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }



            }
        }

    }


