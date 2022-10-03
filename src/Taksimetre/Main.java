package Taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mesafe, kmtutar, acilis, ucret;

        kmtutar = 2.2;
        acilis = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi kilometre cinsinden giriniz: ");
        mesafe = inp.nextDouble();

        ucret = acilis + (kmtutar * mesafe);

        String ucretlimit = ucret > 20? mesafe + " kilometre için ödeyeceğiniz ücret " + ucret + "Tl'dir" : mesafe + " kilometre için ödeyeceğiniz ücret 20 Tl'dir";
        System.out.println(ucretlimit);


    }
}
