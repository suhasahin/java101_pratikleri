package Odev;
import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int k = input.nextInt();
        int toplam = 0;
        int j = 0;


        for (int i = 1; i < k; i++){
            if(k%i == 0) {
                System.out.println(i);
                toplam +=i;
            }
        }
        System.out.println("Çarpanlar toplamı : " + toplam);

        if (toplam == k){
            System.out.println(k+" Mükemmel sayıdır.");
        }else{
            System.out.println(k+" Mükemmel sayı değildir.");
        }
    }
}
