public class ArithmeticTower {
    public static void main(String[] args) {
        long start = 202103;
        System.out.println(start);

        for (int i = 2; i <= 9; i++) {
            System.out.println(start + " * " + i);
            start = start * i;
        }

        for (int i = 2; i <= 9; i++) {
            System.out.println(start + " / " + i);
            start = start / i;
        }

        System.out.println(start);
    }


}
