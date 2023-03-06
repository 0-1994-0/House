package lottery;

public class lottery {
    public static void main(String[] args) {
        int[] myLotteryGuesses = new int[6];
        myLotteryGuesses[0] = 7;
        myLotteryGuesses[1] = 28;
        myLotteryGuesses[2] = 33;
        myLotteryGuesses[3] = 42;
        myLotteryGuesses[4] = 13;
        myLotteryGuesses[5] = 19;


        int[] winningNumbers = getRandomLotteryNumbers();

        int countMatches = 0;
        for (int i = 0; i < myLotteryGuesses.length; i++) {
            if (myLotteryGuesses[i] == winningNumbers[i]) {
                countMatches = countMatches +1;

            }
        }


        if (countMatches == 6) {
            System.out.println("Jackpot!");
        } else if (countMatches == 5) {
            System.out.println("Second price!");
        } else {
            System.out.println("You lost!");
        }

    }


    public static int[] getRandomLotteryNumbers() {
        int[] randomNumbers = new int[6];
        for (int i = 0; i < randomNumbers.length; i++) {
            //dann müssen wir speichern bzw. initialisieren
            int number = (int) (Math.random() * 100);
            while (number > 49 || number == 0) {
                number = (int) (Math.random() * 100);
            }

            randomNumbers[i] = number;
        }
        return randomNumbers;
    }
}

