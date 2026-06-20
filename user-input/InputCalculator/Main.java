import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }

    public static void inputThenPrintSumAndAverage () {

        int number;
        int count = 0, sum = 0;
        long average = 0;
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt()) {
            number = input.nextInt();
            count++;
            sum += number;
        }
        input.nextLine();
        average = Math.round((double) sum / count);

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}