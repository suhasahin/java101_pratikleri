package Pratikler;
import java.util.Scanner;


public class ArmstrongToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue = 0;
        int result = 0;

        while(tempNumber != 0){
            tempNumber  /= 10;
            basNumber++;
        }
        System.out.println("Basamak sayısı : " +basNumber);

        tempNumber = number;
        while(tempNumber!=0){
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
            }
        System.out.println(number + " sayısının basamak sayılarının toplamı : " +result);
        }
}

