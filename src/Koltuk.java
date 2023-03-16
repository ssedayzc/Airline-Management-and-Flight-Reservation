public class Koltuk {

    private String koltukNo;
    private KoltukSinifi sinif;


    public KoltukSinifi getirKoltukTuru() {
        KoltukSinifi koltuk = KoltukSinifi.ECONOMY;
        System.out.println("Ekonomi koltuk");
        return KoltukSinifi.ECONOMY;

    }
}


