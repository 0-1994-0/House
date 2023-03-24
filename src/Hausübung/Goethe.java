package Hausübung;

import java.nio.file.Paths;
import java.util.Scanner;

public class Goethe {
    public static void main(String[] args) throws Exception {
        String file = "C:\\Users\\s53038\\Downloads\\faust.txt";

        Scanner buchText = new Scanner(Paths.get(file));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte das Wort ein, welches gezaehlt werden soll ");
        String wort = scanner.next();
        //wort = wort.toLowerCase();

        int wordcount =0;

        while (buchText.hasNext()){
            String actualWord = buchText.next();
            if (actualWord.toLowerCase().equals(wort)){
                wordcount = wordcount + 1;

            }

            System.out.print(actualWord + " ");
        }

        System.out.println("Das Wort " +wort+ "kommt " +wordcount+ " oft vor.");
        ;

    }
}
