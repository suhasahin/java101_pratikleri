package TekSayi;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);

    do {
        System.out.println("sayı giriniz: ");
        n = scan.nextInt();
        if (n % 2 == 1){
            toplam += n;
        }
    }while (n > 0);

        System.out.println("toplam: " + toplam);

    }
}