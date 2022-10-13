package Hesap_Makinesi;
import java.util.Scanner;

public class Hmswitch {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkartma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch(select) {
            case 1:
            System.out.println("Toplam :" + (n1 + n2));
            break;
            case 2:
            System.out.println("Çıkarna : " + (n1- n2));
            break;
            case 3:
            System.out.println("Çarpma : " + (n1 * n2));
            break;
            case 4:
            System.out.println("Bölme : " + (n1 / n2));
            break;
            default:
                System.out.println("Yanlış seçim yaptınız.");
            }
        }
    }

