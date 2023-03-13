package Hausübung;

import java.util.Scanner;

public class WhileSchleifen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein : ");
        int zahl = scanner.nextInt();

        int sum = 0;
        int i = 1;


        while (i <= zahl) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}

