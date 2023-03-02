package Giris;
import javax.swing.*;
import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String username, password;
        int right = 5;  // 5 hakkımız var
        int balance = 5000;
        int select;

        while (right > 0) {
            System.out.println("Kullanıcı Adınız : ");
            username = a.nextLine();
            System.out.println("Şifreniz : ");
            password = a.nextLine();
            if (username.equals("nadire") && password.equals("y2n4")) {
                System.out.println("Bankımıza Hoşgeldiniz");
                System.out.println("1-Para Yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgulama\n" +
                        "4-Çıkış Yap\n");
                System.out.println("Lütfen yapmak istediğiniz işlemi giriniz");
                select = a.nextInt();
                switch (select) {
                    case 1:
                        System.out.println("Para miktarı : ");
                        int price = a.nextInt();
                        balance += price;
                        System.out.println("Son Bakiyeniz : " + balance);
                        break;
                    case 2:
                        System.out.println("Para miktarı : ");
                        int price1 = a.nextInt();
                        if (price1 > balance) {
                            System.out.println("Bakiye yetersiz");
                        } else {
                            balance -= price1;
                            System.out.println("Son Bakiyeniz : " + balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                }
            } else {
                right--;
                System.out.println("Kullanıcı adı veya şifre hatalı.Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Lütfen Bnakanız ile İletiime Geçiniz.");
                } else {
                    System.out.println("kalan hakkınız : " + right);
                }
            }
            break;
        }
        a.close();
    }
}



