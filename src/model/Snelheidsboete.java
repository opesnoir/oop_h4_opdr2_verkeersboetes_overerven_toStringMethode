package model;

public class Snelheidsboete extends Verkeersboete {
    private int gemetenSnelheid;
    private int maximumSnelheid;

    //getters/setters
    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }

    //constructor
    public Snelheidsboete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    //methode
    // magic numbers verwijderen
    public void bepaalBedrag() {
        double bedrag;
        if (this.gemetenSnelheid > 0 & this.gemetenSnelheid <= 10) {
            bedrag = (this.gemetenSnelheid - this.maximumSnelheid) * 10;
        } else if (this.gemetenSnelheid > 10 & this.gemetenSnelheid <= 30) {
            bedrag = (this.gemetenSnelheid - this.maximumSnelheid) * 15;
        } else {
            bedrag = (this.gemetenSnelheid - this.maximumSnelheid) * 20;
        }
        if (bedrag > 1000) {
            bedrag = 1000;
        }
        super.setBedrag(bedrag);
    }

    @Override
    public String toString() {
        return super.toString().replace("Verkeersboete", "Snelheidsboete") + String.format(" voor %d km/u waar %d km/u is toegestaan.", this.gemetenSnelheid, this.maximumSnelheid);
    }
}

