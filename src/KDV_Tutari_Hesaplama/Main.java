package KDV_Tutari_Hesaplama;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvsiz, kdvoranionsekiz, kdvoranisekiz;

        kdvoranionsekiz = 1.18;
        kdvoranisekiz = 1.08;


        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen ürün fiyatını giriniz : ");
        kdvsiz = inp.nextDouble();

        double kdvlisekiz, kdvlionsekiz;

        kdvlisekiz = (kdvsiz * kdvoranisekiz);
        kdvlionsekiz = (kdvsiz * kdvoranionsekiz);

        double kdvtutarisekiz = (kdvlisekiz - kdvsiz);
        double kdvtutarionsekiz = (kdvlionsekiz - kdvsiz);


        String kdvindirim = kdvsiz > 1000 ? "Ürün değeri " + kdvsiz + " TL'dir." + " KDV oranı %8 ve KDV tutarı " + kdvtutarisekiz + "TL'dir." + " Toplam tutar " + kdvlisekiz +" TL'dir." : "Ürün değeri " + kdvsiz +" TL'dir." + " KDV oranı %18 ve KDV tutari " + kdvtutarionsekiz + "Tl'dir." + " Toplam tutar " + kdvlionsekiz +" TL'dir."  ;
        System.out.println(kdvindirim);

    }

}
