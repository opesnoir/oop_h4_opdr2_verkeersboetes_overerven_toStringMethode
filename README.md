# oop_les4_opdracht2_verkeersboetes_overerven_toString-
toString: replace iets uit super
@Override
public String toString() {
return super.toString().replace("Verkeersboete", "Parkeerboete") + String.format(" in zone %d", this.zone);
}


switch statement 2 methoden

methode 1
    public void bepaalBedrag() {
        switch (this.zone) {
            case 1:
                super.setBedrag(BOETE_ZONE_1);
                break;
            case 2:
                super.setBedrag(BOETE_ZONE_2);
                break;
            case 3:
                super.setBedrag(BOETE_ZONE_3);
                break;
        }
    }

methode 2 enhanced switch
public void bepaalBedrag() {
switch (this.zone) {
case 1 -> super.setBedrag(BOETE_ZONE_1);
case 2 -> super.setBedrag(BOETE_ZONE_2);
case 3 -> super.setBedrag(BOETE_ZONE_3);
}
}

String snack;
Scanner input = new Scanner(System.in);
System.out.println("kies een snack, appel of chocolade: ");

        snack = input.next();
        switch (snack){
            case "appel" -> System.out.println("lekker fruit");
            case "chocolage" -> System.out.println("lekker chocolade");
            default -> System.out.println("foutieve input: kies appel of chocolade");