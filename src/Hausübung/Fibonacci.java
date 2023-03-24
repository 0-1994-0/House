package Hausübung;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        int start =1; //aktuell
//        int zahl = 0; //davor
//
//        for (int i =0; i <=20; i++){
//            System.out.println(start);
//
//            int sum = start+zahl; // nächste
//            zahl = start;
//            start = sum;
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geben Sie eine Zahl ein: ");
//        int zahl = scanner.nextInt();
//
//        for (int i =1; i <= zahl; i= i+2){
//            System.out.println(i);
//
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Gebe eine Zahl ein: ");
//        int number = scanner.nextInt();

//        for (int i = 2; i <= 9; i++) {
//            int multip = number * i;
//            System.out.println(number + " * " + i + " = " + multip);
//            number = multip;
//        }
//        for (int j = 2; j <= 9; j++) {
//            int div = number / j;
//            System.out.println(number + " / " + j + " = " + div);
//            number = div;
//
//        }
//
//
//        int counter = 2;
//
//        while (counter <= 9) {
//
//            int multi = number * counter;
//            System.out.println(number + " * " + counter + " = " + multi);
//            number = multi;
//            counter++;
//        }
//
//        counter = 2;
//        while (counter <= 9) {
//
//
//            int divi = number / counter;
//            System.out.println(number + " / " + counter + " = " + divi);
//            number = divi;
//            counter++;
//
//        }
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geben Sie einen Benutzername ein: ");
//        String benutzername = scanner.next();
//        System.out.println("Geben Sie einen Passwort ein: ");
//        String passwort = scanner.next();
        int counter = 0;

        String benutzername;
        String passwort;

        do {

            System.out.println("Geben Sie einen Benutzername ein: ");
            benutzername = scanner.next();
            System.out.println("Geben Sie einen Passwort ein: ");
            passwort = scanner.next();
            counter++;

            if (!benutzername.equals("user123") && !passwort.equals("passwort123")) {
                System.out.println("Falscher Benutzername oder falsches Passwort. Bitte versuchen Sie es erneut.");
            }

            if (counter == 3) {
                System.out.println("Programm kaputt");
                System.exit(0);
            }

        }
        while (!benutzername.equals("user123") || !passwort.equals("passwort123"));
        System.out.println("korrekt");

    }
}


