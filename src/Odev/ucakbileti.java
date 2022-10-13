package Odev;
import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {

        double yas, yTip, mesafe, sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi km türünden giriniz: ");
        mesafe = inp.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        yas = inp.nextDouble();

        System.out.println("Yolculuk tipini giriniz (1 tek yön, 2 çift yön): ");
        yTip = inp.nextDouble();

        if (yas < 12 && yTip == 2) {
            sonuc = (((mesafe * 0.1) * 0.5) * 0.8);
            System.out.println("Ucretiniz : " + sonuc*2);
        } else if (yas < 12 && yTip == 1) {
            sonuc = (((mesafe * 0.1) * 0.5));
            System.out.println("Ucretiniz : " + sonuc);
        } else if (yas >= 12 && yas <= 24 && yTip == 2) {
            sonuc = (((mesafe * 0.1) * 0.9) * 0.8);
            System.out.println("Ucretiniz : " + sonuc*2);
        } else if (yas >= 12 && yas <= 24 && yTip == 1) {
            sonuc = (((mesafe * 0.1) * 0.9));
            System.out.println("Ucretiniz : " + sonuc);
        } else if (yas >= 65 && yTip == 2) {
            sonuc = (((mesafe * 0.1) * 0.7) * 0.8);
            System.out.println("Ucretiniz : " + sonuc*2);
        } else if (yas >= 65 && yTip == 1) {
            sonuc = (((mesafe * 0.1) * 0.7));
            System.out.println("Ucretiniz : " + sonuc);
        } else if (yas > 24 && yas <= 64 && yTip == 2) {
            sonuc = (((mesafe * 0.1) * 0.8));
            System.out.println("Ucretiniz : " + sonuc*2);
        } else if (yas > 24 && yas <= 64 && yTip == 1) {
            sonuc = (mesafe * 0.1);
            System.out.println("Ucretiniz : " + sonuc);
        } else if (yTip > 2 || yTip < 1) {
            System.out.println("Hatalı veri girdiniz!");
        } else if (mesafe < 1) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

        if (yTip > 2 || yTip < 1) {
            System.out.println("Hatalı gidiş tipi girdiniz!");
        } else if (mesafe < 1) {
            System.out.println("Hatalı mesafe girdiniz!");
    }
}
}


