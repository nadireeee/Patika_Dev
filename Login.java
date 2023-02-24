package Giris;

import java.util.Scanner;

public class Login {
    public Login() {
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz");
        String kullaniciadi = inp.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        String password = inp.nextLine();
        if (kullaniciadi.equals("Nadire Yöndem") && password.equals("123456")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("bilgiler yanlış");
        }

    }
}
