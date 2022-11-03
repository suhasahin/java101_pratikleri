package Pratikler;

import java.util.Scanner;

public class PalindromSayilar {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0){
            System.out.println("=============");
            System.out.println("Sayı = " + temp);
            lastNumber = temp % 10;
            System.out.println("Son basamak: " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println("Yeni sayı : " + reverseNumber);

        }
        if (number == reverseNumber) {
            System.out.println("Palindrom sayıdır.");
            return true;
        }else {
            System.out.println("Palindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int a = sc.nextInt();
        System.out.println(isPalindrom(a));


}


}
