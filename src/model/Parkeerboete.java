package model;

public class Parkeerboete extends Verkeersboete {
    private int zone;
    private final static int ZONE_1_INPUT = 1;
    private final static int ZONE_2_INPUT = 2;
    private final static int ZONE_3_INPUT = 3;
    private final static String ZONE_1 = "zone 1";
    private final static String ZONE_2 = "zone 2";
    private final static String ZONE_3 = "zone 3";
    private final static double BOETE_ZONE_1 = 60.00;
    private final static double BOETE_ZONE_2 = 100.00;
    private final static double BOETE_ZONE_3 = 180.00;


    //getters setters
    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    //constructor
    public Parkeerboete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
    }

    //methode
    public void bepaalBedrag() {
        switch (this.zone) {
            case 1 -> super.setBedrag(BOETE_ZONE_1);
            case 2 -> super.setBedrag(BOETE_ZONE_2);
            case 3 -> super.setBedrag(BOETE_ZONE_3);
        }
    }


    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "Parkeerboete") + String.format(" in zone %d", this.zone);
    }

}