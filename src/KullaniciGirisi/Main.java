package KullaniciGirisi;
import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String userName, password, yeniSifre;
        int cevap;


        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz: ");
        password = inp.nextLine();


        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else if (userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Bilgileriniz yanlış!Şifrenizi sıfırlamak ister misiniz? İstiyorsanız 1 istemiyorsanız 2 yazınız");
            cevap = inp.nextInt();
            inp.nextLine();
            if (cevap == 1) {
                System.out.println("Yeni şifrenizi giriniz");
                yeniSifre = inp.next();
                password = yeniSifre;
                if (password.equals("java123")) {
                    System.out.println("Şifre değiştirilmedi! Şifre eskisiyle aynı!");
                } else
                    System.out.println("Yeni şifre oluşturuldu!");
            }
        }
    }
}
