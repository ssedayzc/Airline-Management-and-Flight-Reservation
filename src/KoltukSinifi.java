public enum KoltukSinifi {
    ECONOMY,
    BUSİNESS
}
class koltukSec{

    public static void main(String[] args) {
        Yolcu yolcu = new Yolcu();
        KoltukSinifi koltuk = KoltukSinifi.ECONOMY;
        KoltukSinifi koltuk2= KoltukSinifi.BUSİNESS;


        switch(koltuk){
            case  ECONOMY:
                System.out.println("Ekonomi koltuk seçildi");
                break;
            case BUSİNESS:
                System.out.println("Business koltuk seçildi");
                break;

        }
    }





}