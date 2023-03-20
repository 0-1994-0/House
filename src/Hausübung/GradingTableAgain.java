package Hausübung;

import java.util.Scanner;

public class GradingTableAgain {
    public static void main(String[] args) {

        int points = 1;
getGrade(points);
    }
    public static String getGrade(int points) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your note");
        points = scanner.nextInt();
        String note = "Fail";

        if (points >= 90) {
            note = "Outstanding";
            System.out.println(note);

        } else if (78 < points && points < 89) {
            System.out.println("Excellent");
        } else if (65 < points && points < 77) {
            System.out.println("Acceptable");
        } else if (51 < points && points < 64) {
            System.out.println("Passing");
        } else {
            System.out.println(note);

        }
        return note;

    }
}