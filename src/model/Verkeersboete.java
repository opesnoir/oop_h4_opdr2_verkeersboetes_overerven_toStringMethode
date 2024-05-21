package model;

public class Verkeersboete {
    //attribute
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;
    private final static double DEFAULT_BEDRAG = 0.0;

    //constructor
    // goed
    private Verkeersboete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public Verkeersboete(String naamDader, String kentekenAuto) {
        this(naamDader, kentekenAuto, DEFAULT_BEDRAG);
    }

    public Verkeersboete() {
        this("onbekend", "onbekend");
    }

    //toString
    public String toString(){
        return String.format("Verkeersboete voor %s, kenteken %s, %.2f euro", this.naamDader, this.kentekenAuto, this.bedrag);
    } // inclusief this uitleg: het is een verwijzing naar de huidige instantie.

    // TODO: waarom zetten we hier uitsluitend bedrag? het is toch logischer om alles behalve bedrag te kunnen zetten, gezien je niet wil dat mensen dit zomaar kunnen aanpassen?
    //getters/setters
    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }
}
