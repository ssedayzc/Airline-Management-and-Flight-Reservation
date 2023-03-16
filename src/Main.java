import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String username;

        String yonAd = "1";
        String musAd = "2";


        System.out.println("Lütfen kullanıcı adı ve şifre giriniz(1-Yönetici 2-Müşteri): ");
        Scanner scan = new Scanner(System.in);
        username = scan.nextLine();


        int x = 1;
        while (x != 0) {
            if (username.equals(yonAd)) {
                System.out.println("******************");
                System.out.println("Yönetici olarak giriş yapıyorsunuz.");
                System.out.println("1-Getir uçaklar.\n2-Getir uçuşlar.\n3-Getir havalimanları." +
                                   "\n4-Getir havayolu şirketleri.\n0-Çıkış");
                System.out.println("******************");
                switch (new Scanner(System.in).nextLine()) {
                    case "1" -> Yonetici.getirUcak();
                    case "2" -> Yonetici.getirUcus();
                    case "3" -> Yonetici.getirHavalimani();
                    case "4" -> Yonetici.getirHavayoluSirket();
                    case "0" -> x = 0;
                }
            } else if (username.equals(musAd)) {
                System.out.println("Müşteri olarak giriş yapıyorsunuz.");
                x = 0;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre!");
            }
        }

    }
}