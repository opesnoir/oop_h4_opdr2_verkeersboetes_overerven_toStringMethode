package controller;

import model.Parkeerboete;
import model.Snelheidsboete;

public class VerkeersBoetesLauncher {
    public static void main(String[] args) {

        // Maak verschillende boetes aan en print hun informatie uit.
        Parkeerboete parkeerboete1 = new Parkeerboete("Peter Pan", "12-ss-12", 2);
        System.out.println(parkeerboete1);
        Snelheidsboete snelheidsboete1 = new Snelheidsboete("Sneeuw Witje", "88-aa-33", 129, 80);
        System.out.println(snelheidsboete1);

    }

}
