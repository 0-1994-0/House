package Hausübung;

import java.util.Scanner;

public class Uebung3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account balance:");
        double kontoStand = scanner.nextDouble();
        int option = 0;

        System.out.println("Der Kontostand beträgt " + kontoStand + " EUR");
//        System.out.println("Menu:");
//        System.out.println("1. Deposit");
//        System.out.println("2. Withdraw");
//        System.out.println("3. Check balance");
//        System.out.println("4. Exit");
//        System.out.print("Enter your choice :");

        while (option != 4) {

            //option = scanner.nextInt();
            System.out.println("Menu:");
            //System.out.println(1);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice :");
            option = scanner.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Betrag Transaktion eingeben");
                    double betragTransaktion = scanner.nextDouble();
                    kontoStand = kontoStand + betragTransaktion;
                    System.out.println("Der Kontostand beträgt: " + kontoStand + "Ihre Transaktion war erfolgreich!");
                    break;
                case 2:
                    System.out.println("Betrag Transaktion eingeben");
                    double kontoAbzug = scanner.nextDouble();
                    kontoStand = kontoStand - kontoAbzug;
                    System.out.println("Der Kontostand beträgt: " + kontoStand + "Ihre Transaktion war erfolgreich!");
                    break;

                case 3:
                    System.out.println(kontoStand);
                    break;
                case 4:
                    System.out.println(4);
                    break;
                default:
            }
        }
    }
}
