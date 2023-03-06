package recursion;

public class TenTimes {
    public static void main(String[] args) {
        printSentence("Hallo!", 0);


    }

    public static void printSentence(String sentence, int startingNumber) {
        if (startingNumber != 10) {
            System.out.println(sentence);
        startingNumber++;
            printSentence(sentence, startingNumber);
        } else {
            System.out.println("Finished");
        }

    }
}


