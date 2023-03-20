package Hausübung;

public class vierDimensionalen {
    public static void main(String[] args) {
        int[][][][] zahlen = new int[4][3][2][2];
        int counter1 = 0;
        int counter2 = 0;


        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[i].length; j++) {
                for (int k = 0; k < zahlen[i][j].length; k++) {
                    for (int l = 0; l < zahlen[i][j][k].length; l++) {
                        //System.out.println(zahlen[i][j][k][l]);
                        counter1++;
                    }
                }
            }

        }
        for (int[][][] i : zahlen) {
            for (int[][] j : i) {
                for (int[] k : j) {
                    for (int l : k) {
                        counter2++;
                    }
                }
            }

        }

        System.out.println(counter1);
        System.out.println(counter2);
    }
}
