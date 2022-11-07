package Pratikler;
import java.util.Scanner;

public class Recursive_Uslusayi {

    static int us(int a, int b) {
        if (b == 0)
            return 1;
        if (a == 0)
            return 0;
        return a * us(a, b-1);
    }

    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int a = n.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = n.nextInt();

        System.out.println("Sonuç: " + us(a,b));
    }
}
