package Odev;


import java.util.Scanner;

public class zodiak {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int sayi = inp.nextInt();
        int zodiak = sayi % 12;

        if (zodiak == 0) {
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (zodiak == 1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (zodiak == 2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        } else if (zodiak == 3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } else if (zodiak == 4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (zodiak == 5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        } else if (zodiak == 6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } else if (zodiak == 7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        } else if (zodiak == 8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        } else if (zodiak == 9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan");
        } else if (zodiak == 10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        } else if (zodiak == 11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}