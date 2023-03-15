package Hausübung;

import java.util.Scanner;

public class Uebung1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name eingeben bitte");
        String name = scanner.next();


        System.out.println("Alter eingeben bitte");
        int alter = scanner.nextInt();

        System.out.println("Hallo " + name + "! Du bist " + alter + "Jahre alt.");

    }
}
