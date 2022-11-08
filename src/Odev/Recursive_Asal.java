package Odev;

import java.util.Scanner;

public class Recursive_Asal {
    static void asal(int sayi, int i) {
        if (sayi == i){
            System.out.println(sayi + " asal sayıdır.");
            return;
        }else if(sayi % i == 0){
            System.out.println(sayi + " asal sayı değildir.");
            return;
        }
        asal(sayi, i+1);
    }
    public static void main(String[] args) {
        System.out.print("Sayıyı giriniz: ");
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        asal(sayi,2);
    }
}

