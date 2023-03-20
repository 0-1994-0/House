package Hausübung;

import java.util.Scanner;

public class ticTacToe {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Zeichen eingeben : " );
//        String zeichen  = scanner.next();



        String spiel [][]= new String[3][3];

        for (int i = 0; i < spiel.length; i++){
            spiel [0] [2] = "x";
            System.out.println(spiel);
            for (int j = 0; j< spiel[i].length;j++){
                System.out.print(spiel[i][j]);


            }

        }

    }
}
