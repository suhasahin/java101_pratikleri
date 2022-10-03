package Daire_Alan_Cevre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r;
        double pi = 3.14;
        double a;


        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        //dairenin diliminin alanını bulma

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = inp.nextDouble();

        double dilim = (pi * (r*r) * a) / 360;

        System.out.println("Dilim alanı : " + dilim);

    }
}
