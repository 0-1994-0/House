package Hausübung;

import java.util.Scanner;

public class SwitchUbung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein: ");
        int tag = scanner.nextInt();

        switch (tag) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Nummer nicht definiert");
        }
        System.out.println("Gebe eine Zahl ein: ");
        int monat = scanner.nextInt();

        switch (monat){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
        }
    }
}
