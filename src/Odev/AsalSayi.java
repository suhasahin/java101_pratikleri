package Odev;
import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asal Sayılar : ");
        int counter = 0;
        for (int s = 2; s <= 100; s++) {
            int check = 0;
            for (int i = 2; i < s; i++) {
                if (s % i == 0) {
                    check = 1;
                }
            }

            if (check == 0) {

                System.out.print(s + " ");
                counter++;
            }
        }
    }
}