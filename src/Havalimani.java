
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class Havalimani {

    private int havalimaniNo;
    private String havalimaniAd;
    private String kod;
    private String sehir;
    private String ulke;


    Yonetici y = new Yonetici();


    public static void main(String[] args) throws IOException {

        List<Havalimani> liste = new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader("Havalimanlari.txt"));

        while(true){
            String line = read.readLine();
            if(line==null){
                break;
            }
            //  liste.add(line);
        }
        read.close();

        for(Havalimani line: liste){
            System.out.println(line);
        }
    }

    public  List<Ucus> getirUcuslar(List<Ucus> Ucus) {
        System.out.println("Ucuslar getirildi.");
        return Ucus;
    }
}
