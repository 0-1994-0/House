package Hausübung;

public class RectangleAgain {
    public static void main(String[] args) {

        int width = 2;
        int length = 3;
        int circumference = (length + width) * 2;

        System.out.println(circumference);

        int area = width * length;

        System.out.println(area);

        calculateCircumference(width, length);
        calculateArea(10, 50);
        calculateArea(width, length);
        calculateArea(80,90);
    }

    public static void calculateCircumference(int width, int length) {
        int circumference = (width + length) * 2;
        System.out.println(circumference);
    }

    public static void calculateArea(int width, int length) {
        int area = width * length;
        System.out.println(area);
    }
}
