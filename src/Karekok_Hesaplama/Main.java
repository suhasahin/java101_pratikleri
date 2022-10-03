package Karekok_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a, b, c, alan;


        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen birinci kenar uzunluğunu giriniz: ");
        a = inp.nextDouble();

        System.out.println("Lütfen ikinci kenar uzunluğunu giriniz: ");
        b = inp.nextDouble();

        c = (Math.pow(a, 2)) + (Math.pow(b, 2));



        System.out.println("Hipotenüs: " + Math.sqrt(c));

        //alan hesaplama

        double cevre = a + b + Math.sqrt(c);
        double u = cevre/2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-(Math.sqrt(c))));
        System.out.print("Üçgenin alanı: " + alan);

    }
}
