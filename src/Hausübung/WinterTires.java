package Hausübung;

import java.util.Scanner;

public class WinterTires {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        int temperature = scanner.nextInt();
        System.out.println("Is the road slippery (Answer true or false) ?");
        boolean slipperyRoad = scanner.nextBoolean();

        needWinterTires(temperature, slipperyRoad);
    }

    public static boolean needWinterTires(int temperature, boolean slipperyRoad) {

        if (4 <= temperature && temperature < 10 && slipperyRoad == true) {
            System.out.println("Please use winter tires");

        } else if (4 > temperature) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }
        return slipperyRoad;

    }
}
