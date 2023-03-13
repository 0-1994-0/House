package Hausübung;

import java.util.Scanner;

public class UebungNeu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String vorname = "Aurelie";
        //System.out.println(vorname);

        System.out.println("Bitte geben Sie Ihren Vorname ein: ");
        String vorname = scanner.next();

        // String nachname = "Zouaoui";
        //System.out.println(nachname);

        System.out.println("Bitte geben Sie Ihren Nachname ein: ");
        String nachname = scanner.next();

        System.out.println("Geben Sie ihr Alter ein: ");
        int alter = scanner.nextInt();

        String name = vorname.concat(" " + nachname);
        System.out.println(name);

        System.out.println("Contains Aurelie - ie?:" + name.contains("ie"));

        boolean bool;
        bool = name.length() > 10;
        //int nameLange = name.length();
        System.out.println("Die Laenge ist groesser 10: " + bool + " und die exakte Laenge ist " + name.length());
        System.out.println("Willkommen " + name.toUpperCase() +" "+ alter + " Jahre alt");

    }
}


//for (int i = 0; i < name.length(); i++) {
//System.out.print(i);
// if (name.length() > 10) {
//    System.out.println(true + " und die exakte Laenge ist : 13");
//  }

//     }






