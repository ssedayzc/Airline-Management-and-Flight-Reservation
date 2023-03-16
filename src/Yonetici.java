import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Yonetici extends Kisi {

    private String departman;


    public static void getirHavalimani() throws FileNotFoundException {
        File file = new File("Havalimanlari.txt");
        Scanner scannerComp = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();


        while (scannerComp.hasNextLine()) {

            String nextLine = scannerComp.nextLine();

            String[] kelimeler = nextLine.split(";");
            String Adi = kelimeler[0];
            String Ulke = kelimeler[1];
            String Sehir = kelimeler[2];

            StringBuilder builder = new StringBuilder();

            builder.append(Adi).append(" ").append(Ulke).append(" ").append(Sehir);
            String sonCumle = builder.toString();

            strings.add(sonCumle);


        }
        for (String s : strings
        ) {
            System.out.println(s);

        }

    }

    public static void getirUcus() throws FileNotFoundException {
        File file = new File("Ucuslar.txt");
        Scanner scannerComp = new Scanner(file);
        ArrayList<String> Dest = new ArrayList<>();


        while (scannerComp.hasNextLine()) {

            String nextLine = scannerComp.nextLine();
            String[] ucusBilgileri = nextLine.split(";|,");

            String ucusNo = ucusBilgileri[0];

            String dYil = ucusBilgileri[1];
            String dAy = ucusBilgileri[2];
            String dGun = ucusBilgileri[3];
            String dSaat = ucusBilgileri[4];


            String sure = ucusBilgileri[5];
            String kalkisKonumUlke = ucusBilgileri[6];
            String kalkisKonumSehir = ucusBilgileri[7];
            String kalkisHavalimaniAdi = ucusBilgileri[8];
            String varisKonumUlke = ucusBilgileri[9];
            String varisKonumSehir = ucusBilgileri[10];
            String varisHavalimaniAdi = ucusBilgileri[11];
            String ucakTipi = ucusBilgileri[12];
            String havayoluSirketi = ucusBilgileri[13];
            String durum = ucusBilgileri[14];

            StringBuilder builder = new StringBuilder();
            builder.append(dYil);
            builder.append("-");
            builder.append(dAy);
            builder.append("-");
            builder.append(dGun);
            builder.append("-");
            builder.append(dSaat);



            String d = builder.toString();

            StringBuilder builder11 = new StringBuilder();

            builder11.append(ucusNo + " " + d + " " + sure + " " + kalkisKonumUlke + " " + kalkisKonumSehir + " " + kalkisHavalimaniAdi + " " + varisKonumUlke + " " + varisKonumSehir + " " + varisHavalimaniAdi + " " + ucakTipi + " " + havayoluSirketi + " " + durum);
            String ucuss = builder11.toString();
            Dest.add(ucuss);


        }

        for (String s : Dest
        ) {
            System.out.println(s);

        }

    }

    public static void getirUcak() throws FileNotFoundException {
        File file = new File("Ucaklar.txt");
        Scanner scannerComp = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();


        while (scannerComp.hasNextLine()) {

            String nextLine = scannerComp.nextLine();

            String[] kelimeler = nextLine.split(";");
            String tip = kelimeler[0];
            String kapasite = kelimeler[1];
            String uretimYili = kelimeler[2];

            StringBuilder builder = new StringBuilder();

            builder.append(tip + " " + kapasite + " " + uretimYili);
            String ucak = builder.toString();

            strings.add(ucak);


        }
        for (String s : strings
        ) {
            System.out.println(s);

        }

    }

    public static void getirHavayoluSirket() throws FileNotFoundException {

        File file = new File("HavayoluSirketleri.txt");
        Scanner scannerComp = new Scanner(file);
        ArrayList<String> strings = new ArrayList<>();


        while (scannerComp.hasNextLine()) {

            String nextLine = scannerComp.nextLine();

            String[] kelimeler = nextLine.split(",");
            String kod = kelimeler[0];
            String ad = kelimeler[1];


            StringBuilder builder = new StringBuilder();

            builder.append(kod + " " + ad );
            String sirket = builder.toString();

            strings.add(sirket);


        }
        for (String s : strings
        ) {
            System.out.println(s);

        }
    }

    public boolean ekleUcak() {
        Scanner scan = new Scanner(System.in);
        int ucakKod = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String ucakAdi = scan2.nextLine();
        System.out.println("Ucak eklendi");
        return true;
    }

    public boolean ekleUcus() {
        Scanner scan = new Scanner(System.in);
        int ucusKod = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String ucusAdi = scan2.nextLine();
        System.out.println("Ucus eklendi");
        return true;

    }

    public void ekleHavalimani() {
        Scanner scan = new Scanner(System.in);
        String havalimani = scan.nextLine();
        System.out.println("Havalimani eklendi");

    }

    public void ekleHavayoluSirket() {
        Scanner scan = new Scanner(System.in);
        int havayoluSirketKod = scan.nextInt();
        Scanner scan2 = new Scanner(System.in);
        String havayoluSirketAdi = scan2.nextLine();
        System.out.println("Havayolu sirketi eklendi");

    }
}
