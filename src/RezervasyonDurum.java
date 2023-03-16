public enum RezervasyonDurum {

    GERCEKLESTIRILDI,
    IPTAL
}
class Duzenle {
    public static void main(String[] args) {
        Yolcu yolcu = new Yolcu();
        RezervasyonDurum durum = RezervasyonDurum.GERCEKLESTIRILDI;
        // RezervasyonDurum durum2 = RezervasyonDurum.IPTAL;

        switch(durum) {
            case GERCEKLESTIRILDI:
                System.out.println("İslem gerceklestirildi");
                break;
            case IPTAL:
                System.out.println("İslem iptal edildi");
                break;

        }
    }
}
