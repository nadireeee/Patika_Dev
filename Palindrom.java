package Giris;

public class Palindrom {
    static boolean isPalindrom(int number) {
        int temp = number, reversenumber = 0, lastnumber;
        while (number != 0) {
            lastnumber = temp % 10;
            reversenumber = (reversenumber * 10) + lastnumber;
            temp /= 10;
        }
        if (number == reversenumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        isPalindrom(4004);
    }
}
