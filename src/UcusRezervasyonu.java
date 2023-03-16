import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UcusRezervasyonu {

    private String rezervasyonNo;
    private Ucus ucusNo;
    private UcusKoltugu ucus;
    private Yolcu yolcu;
    private RezervasyonDurum durum;

    public UcusRezervasyonu(String rezervasyonNo, Ucus ucusNo, UcusKoltugu ucus, Yolcu yolcu, RezervasyonDurum durum) {
        this.rezervasyonNo = rezervasyonNo;
        this.ucusNo = ucusNo;
        this.ucus = ucus;
        this.yolcu = yolcu;
        this.durum = durum;
    }

    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public Ucus getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(Ucus ucusNo) {
        this.ucusNo = ucusNo;
    }

    public UcusKoltugu getUcus() {
        return ucus;
    }

    public void setUcus(UcusKoltugu ucus) {
        this.ucus = ucus;
    }

    public Yolcu getYolcu() {
        return yolcu;
    }

    public void setYolcu(Yolcu yolcu) {
        this.yolcu = yolcu;
    }

    public  List<Yolcu> getirYolcu(List<Yolcu> Yolcu) {
        System.out.println("Yolcu listesi getirildi.");
        return Yolcu;
    }
    public  List<UcusRezervasyonu> getirUcusRezervasyonu(List<UcusRezervasyonu> UcusRezervasyonu) {
        System.out.println("Rezervasyonlar getirildi.");
        return UcusRezervasyonu;
    }
    public boolean ekleRezervasyon(){
        RezervasyonDurum gerceklestirildi = RezervasyonDurum.GERCEKLESTIRILDI;
        System.out.println("Rezervasyon eklendi");
        return true;
    }

    public boolean guncelleRezervasyonDurum(){
        RezervasyonDurum ıptal = RezervasyonDurum.IPTAL;
        System.out.println("Rezervasyon güncellendi");
        return true;
    }
}
