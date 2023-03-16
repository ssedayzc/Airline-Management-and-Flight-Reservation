import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HavayoluSirketi {

    private String havayoluSirketAdi;
    private int kod;


    Yonetici y = new Yonetici();

    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("HavayoluSirketleri.txt"))) { // Memoryleak olmaması için try bloğu içinde tanımlıyoruz ve otomatik olarak close çağrılmasını sağlıyoruz.

            String line = null;

            List<HavayoluSirketi> havayoluSirketleri = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {
                // havayoluSirketleri.add(line);

                for(HavayoluSirketi havayolusirketi : havayoluSirketleri){
                    System.out.println(line);

                }


            }
        }


    }

    public  List<Ucus> getirUcuslar(List<Ucus> Ucus) {
        System.out.println("Ucuslar getirildi.");
        return Ucus;
    }

}
