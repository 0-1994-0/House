package arrays;

public class Uebung1 {
    public static void main(String[] args) {
//        int [] ganzeZahlen  = {10,5,4,8,2,3,7,4};
//        for (int i = 0; i<ganzeZahlen.length;i++){
//            System.out.println(ganzeZahlen[i]);
//        }
//
//        int[] ganzeZahlen = new int[8];
//        ganzeZahlen[0] = 4;
//        ganzeZahlen[1] = 1;
//        ganzeZahlen[2] = 5;
//        ganzeZahlen[3] = 6;
//        ganzeZahlen[4] = 7;
//        ganzeZahlen[5] = 4;
//        ganzeZahlen[6] = 9;
//        ganzeZahlen[7] = 8;
//        for (int i = 0; i < ganzeZahlen.length; i++) {
//            System.out.println(ganzeZahlen[i]);
//        }
//
//
//        double[] gleitkommazahlen = {1.5, 4.7, 9.4, 74.7, 8.9};
//        double max = 0;
//        for (int i = 0; i < gleitkommazahlen.length; i++) {
//            if (gleitkommazahlen[i] > max)
//                max = gleitkommazahlen[i];
//        }
//        System.out.println(max);
//
//
//        String[] laengeString = {"salut", "hallo", "bonjour", "Ca va", "bonsoir", "servus", "guten Abend", "guten Tag"};
//        for (int i = 0; i < laengeString.length; i++) {
//            System.out.println(laengeString[i] + " enthält " + laengeString[i].length());

//        int sum = 0;
//        int[] ganzeZahlen12 = {4, 9, 7, 5, 8, 1, 3, 7, 8, 8, 7, 4};
//        for (int j = 0; j < ganzeZahlen12.length; j++) {
//            sum = sum + ganzeZahlen12[j];
//
//        }
//        System.out.println(sum);
//        int[] randomNumbers = new int[15];
//        Random zufallszahlen = new Random();
//
//        for (int i = 0; i < randomNumbers.length; i++) {
//            randomNumbers[i] = zufallszahlen.nextInt(1, 100);
//            System.out.println(randomNumbers[i]);
//        }


//        int[] ganzeZahlen20 = {4, 7, 9, 6, 3, 1, 4, 7, 10, 36, 45, 74, 12, 78, 17, 78, 85, 92, 14, 82};
//        for (int i = 0; i < ganzeZahlen20.length; i++) {
//            if (ganzeZahlen20[i] % 2 == 0) {
//                System.out.println(ganzeZahlen20[i]);
//            }
//        }

        String[] strings10 = {"geht", "so", "salut", "hey", "roxy", "fuchs", "warum", "grrr", "ok", "waouh"};
        char variable = 'b';

        for (int i = 0; i < strings10.length; i++) {
            if (strings10[i].charAt(0) == variable) {
                System.out.println(strings10[i]);
            } else {
                System.out.println("nicht enthalten");
            }

        }
    }
}



