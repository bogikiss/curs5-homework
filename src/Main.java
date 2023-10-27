import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] numbers = {3, 6, 11, 40, 5, 9, 15};
        // 1
        System.out.println(sumOfNumbers(numbers));
        // 2
        System.out.println(numOfOdd(numbers));
        // 3
        System.out.println(greaterThanNum(numbers, 10));
        // 4, 5
        donations(800, 4);
        // 6
        String sentences = "This is an exercise. Exercise number six.";
        sentenceInNewLine(sentences);
    }

    private static int sumOfNumbers(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        return sum;
    }

    private static int numOfOdd(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                count += 1;
            }
        }
        return count;
    }

    private static String greaterThanNum(int[] num, int compare) {
        String numGreater = "";
        for (int i = 0; i < num.length; i++) {
            if (compare < num[i]) {
                numGreater = numGreater.concat(String.valueOf(num[i]).concat(" "));
            }
        }
        return numGreater;
    }

    private static void donations(int target, int maxDonations) {
        int current = 0;
        int numOfDonations = 0;
        Random ran = new Random();
        do {
            numOfDonations = numOfDonations + 1;
            current += ran.nextInt(200);
            //System.out.println("Suma actuala: " + current + "$");
            //System.out.println("Numarul de donatii: " + numOfDonations);
        }
        while (current < target && numOfDonations < maxDonations);
        if (current >= target) {
            System.out.println("Success! " + target + "$ reached.");
        } else {
            System.out.println(current + "$ reached. The campaign is over!");
        }
    }

    private static void sentenceInNewLine(String sentences) {
        sentences = sentences.replaceAll("\\.\\s?", "\\.\n");
        System.out.println(sentences);
    }
}