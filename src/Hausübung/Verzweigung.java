package Hausübung;

import java.util.Scanner;

public class Verzweigung {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Bitte geben Sie eine Zahl ein: ");
//        int nummer = scanner.nextInt();
//
//        if ( nummer > 5){
//            System.out.println("Nummer ist größer als 5");
//        } else if (nummer < 5){
//            System.out.println("Nummer ist kleiner als 5");
//        } else {
//            System.out.println("nummer = 5");
//        }

        Scanner scanner = new Scanner(System.in);
        //oder Math().random
        System.out.println("Bitte geben Sie die Geschwindigkeit ein :");

        double geschwindigkeit = scanner.nextInt();

        double ueberschreitung = geschwindigkeit - 50;
        System.out.println(" Die Überschreitung ist " + ueberschreitung);
        double geschwindigkeitsStrafe = 0;


        if (ueberschreitung <= 0) {
            System.out.println("keine Strafe");
        } else if (0 < ueberschreitung && ueberschreitung < 10) {
            System.out.println("schriftliche Verwarnung");
        } else if (10 < ueberschreitung && ueberschreitung < 20) {
            System.out.println(" Die Überschreitung beträgt " + ueberschreitung + "es werden 30 EUR fällig");
            //geschwindigkeitsStrafe = +30
            //geschwindigkeitsStrafe ++ --> 1
            geschwindigkeitsStrafe = geschwindigkeitsStrafe + 30;
        } else if (20 < ueberschreitung && ueberschreitung < 30) {
            System.out.println(" Die Überschreitung beträgt " + ueberschreitung + " es werden 50 EUR fällig");
            geschwindigkeitsStrafe = geschwindigkeitsStrafe + 50;
        } else if (30 < ueberschreitung && ueberschreitung < 50) {
            System.out.println(" Die Überschreitung beträgt " + ueberschreitung + " es werden 100 EUR fällig");
            geschwindigkeitsStrafe = geschwindigkeitsStrafe + 100;
        } else if (50 < ueberschreitung && ueberschreitung < 100) {
            System.out.println(" Die Überschreitung beträgt " + ueberschreitung + " es werden 500 EUR fällig");
            geschwindigkeitsStrafe = geschwindigkeitsStrafe + 500;
        } else if (ueberschreitung > 100) {
            System.out.println(" Die Überschreitung beträgt " + ueberschreitung + " es werden 1500 EUR fällig");
            geschwindigkeitsStrafe = geschwindigkeitsStrafe + 1500;
        }

        System.out.println("Bitte geben Sie die Promille ein :");
        double promille = scanner.nextDouble();

        double promilleUeberschreitung = promille - 0.5;
        System.out.println(" Die Promilleüberschreitung ist " + promilleUeberschreitung);
        double strafe = 0;

        if (0 >= promilleUeberschreitung) {
            System.out.println("Keine Straffe");
        } else if (0 < promilleUeberschreitung && promilleUeberschreitung < 1.0) {
            System.out.println("Die Alkoholpegel beträgt " + promilleUeberschreitung + "  und die Strafe 50 EUR");
            strafe = strafe + 50;
        } else if (1.0 < promilleUeberschreitung && promilleUeberschreitung < 2.0) {
            System.out.println("Die Alkoholpegel beträgt " + promilleUeberschreitung + " und die Strafe 100 EUR");
            strafe = strafe + 100;
        } else if (2.0 < promilleUeberschreitung) {
            System.out.println("Die Alkoholpegel beträgt " + promilleUeberschreitung + " und die Strafe 2500 EUR");
            strafe = strafe + 2500;
        }


        double gesamtstrafe = strafe + geschwindigkeitsStrafe;

        System.out.println("die gesamte Strafe beträgt " + (gesamtstrafe));

        System.out.println("Monat angeben");

        String monat = scanner.next();
        System.out.println(monat);
        monat.toLowerCase();

        switch (monat) {
            case "jaenner":
            case "februar":
                System.out.println("Keine Rabatt");
                break;
            case "maerz":
            case "april":
                gesamtstrafe= gesamtstrafe*0.90;
                System.out.println("Die Strafe ist " + gesamtstrafe);
                break;
            case "mai":
            case "juni":

                gesamtstrafe= gesamtstrafe*0.85;
                System.out.println("Die Strafe ist " + gesamtstrafe);
                break;
            case "juli":
            case "august":

                gesamtstrafe= gesamtstrafe*0.80;
                System.out.println("Die Strafe ist " + gesamtstrafe);
                break;
            case "september":
            case "october":

                gesamtstrafe= gesamtstrafe*0.75;
                System.out.println("Die Strafe ist " + gesamtstrafe);
                break;
            case "november":
            case "december":
                gesamtstrafe= gesamtstrafe*0.70;
                System.out.println("Die Strafe ist " + gesamtstrafe);
                break;

            default:
                System.out.println("Hi");
        }

        if (gesamtstrafe>0){
            System.out.println(gesamtstrafe);
        } else if (gesamtstrafe <=0){
            System.out.println("gute Fahrt");

        }

    }

}





