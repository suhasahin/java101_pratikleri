package Pratikler;
import java.util.Scanner;

public class Fibonacci_Recursive {
    static int fib(int n) {
        if (n == 1 ||n == 2) {
            return 1;
        }
        return fib(n-1) + fib (n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci serisi : " + fib(n));
    }
}
