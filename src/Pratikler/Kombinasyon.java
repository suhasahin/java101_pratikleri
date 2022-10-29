package Pratikler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kombinasyon Hesaplama C(n,r): ");

        System.out.print("Birinci sayıyı giriniz (n) : ");
        int n = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz (r) : ");
        int r = scan.nextInt();

        int total = 1;
        int total1 = 1;
        int total2 = 1;
        int combination;

        for (int i = 1; i <= n; i++){
            total = total * i;
        }
        System.out.println("n : " + total);

        for (int i = 1; i<= r; i++){
            total1 = total1 * i;
        }
        System.out.println("r : " + total1);

        for (int i = 1; i<= (n-r); i++) {
            total2 = total2 * i;
        }
        System.out.println("n-r : " + total2);

        combination = total / (total1 * (total2));
        System.out.print("C(n,r) Kombinasyon : " + combination);
    }

}


/*
Ödev

N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü

C(n,r) = n! / (r! * (n-r)!)
 */