package Pratikler;
import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz:     ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0;i<=n;i++){
            for (int j=n; j>(n-i);j--){
                System.out.print(" ");
            }
            for (int k=1; k<=(2*(n-i)-1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}