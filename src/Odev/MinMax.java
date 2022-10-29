package Odev;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = input.nextInt();
        int a;
        int buyuk = 0, kucuk = 0;


        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            a = input.nextInt();

            if (i == 1){
                buyuk = a;
                kucuk = a;
            }else{

            if (a > buyuk){
                buyuk = a;
            }else if (a < kucuk){
                    kucuk = a;
                }
            }

        }
        System.out.println("En büyük sayı : " + buyuk);
        System.out.println("En küçük sayı : " + kucuk);
}
}
