import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Ucus {

    private int ucusNo;
    private Havalimani kalkis;
    private Havalimani varis;
    private Ucak ucak;
    private float sure;
    private LocalDateTime kalkisSaat;
    private LocalDateTime varisSaat;
    private UcusDurum ucus;

    Yonetici y = new Yonetici();

    public int getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(int ucusNo) {
        this.ucusNo = ucusNo;
    }

    public Havalimani getKalkis() {
        return kalkis;
    }

    public void setKalkis(Havalimani kalkis) {
        this.kalkis = kalkis;
    }

    public Havalimani getVaris() {
        return varis;
    }

    public void setVaris(Havalimani varis) {
        this.varis = varis;
    }

    public float getSure() {
        return sure;
    }

    public void setSure(float sure) {
        this.sure = sure;
    }

    public LocalDateTime getKalkisSaat() {
        return kalkisSaat;
    }

    public void setKalkisSaat(LocalDateTime kalkisSaat) {
        this.kalkisSaat = kalkisSaat;
    }

    public LocalDateTime getVarisSaat() {
        return varisSaat;
    }

    public void setVarisSaat(LocalDateTime varisSaat) {
        this.varisSaat = varisSaat;
    }

    public UcusDurum getUcus() {
        return ucus;
    }

    public void setUcus(UcusDurum ucus) {
        this.ucus = ucus;
    }


    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("Ucuslar.txt"))) {

            String line = null;

            List<Ucus> ucuslar = new ArrayList<>();

            while ((line = bufferedReader.readLine()) != null) {

                for(Ucus ucus : ucuslar){
                    System.out.println(line);

                }


            }
        }
    }
}
