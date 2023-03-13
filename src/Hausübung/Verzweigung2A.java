package Hausübung;

import java.util.Scanner;

public class Verzweigung2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Monat ein : ");
        String monat = scanner.next();
        monat = monat.toLowerCase();



if (monat.equals("februar")){
        }

//        switch (monat) { // (monat.toLowerCase())
//            case "februar":
//                System.out.println("Februar hat 28");
//                break;
//            case "maerz":
//            case "jaenner":
//            case "mai":
//            case "juli":
//            case "december":
//                System.out.println(monat +" hat 31 Tag");
//                break;
//            case "april":
//            case "juni":
//            case "september":
//            case "november":
//                System.out.println(monat+ " hat 30 Tag");
//            default: //Break nicht notwendig bei letzter Schleife & Default auch nicht wahrscheinlich
//        }

    }
}

