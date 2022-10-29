package Pratikler;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k,j=0;
        double ortalama = 0;
        int toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        k = inp.nextInt();

        for (int i=1; i<=k; i++){
            if ((i % 3== 0) & (i %4 == 0)){
                System.out.println(i);
                toplam+=i;
                j++;
            }
        }
        System.out.println("toplam : " +toplam);
        System.out.println("ortalama : "+ toplam/j);
    }
}