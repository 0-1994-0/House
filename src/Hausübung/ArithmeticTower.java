package Hausübung;

public class ArithmeticTower {
    public static void main(String[] args) {
        long start = 202103;

        System.out.println(start);

        for (int i = 2; i < 10; i++) {
            System.out.println(start + "*" + i);
            start = start * i;
        }


            for (int j = 2; j < 10; j++) {
                System.out.println(start + "/" + j);
                start = start / j;

            }
        System.out.println(start);

        }
    }



