package Odev;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int sayi1 = inp.nextInt();

        if(sayi1 % 4 == 0 && sayi1 % 400 == 0) {
            System.out.println(sayi1 + " bir artık yıldır.");
        }else{
            System.out.println(sayi1 + " bir artık yıl değildir.");
        }
    }
}

