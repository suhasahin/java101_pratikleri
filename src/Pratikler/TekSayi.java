package Pratikler;
import java.util.Scanner;


public class TekSayi {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("sayı giriniz: ");
            n = scan.nextInt();
            if ((n % 2 == 0) & (n % 4 ==0)){
                toplam += n;
            }
        }while (n > 0);

        System.out.println("toplam: " + toplam);

    }
}