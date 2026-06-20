import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minValue = 0;
        int maxValue = 0;
        int count = 0;

        while (count >= 0) {
            System.out.println("Enter a number or any character to exit:");
            String nextNumber = scanner.nextLine();

            try {
                int number = Integer.parseInt(nextNumber);
                if (count == 0 || number < minValue) {
                    minValue = number;
                }
                if (count == 0 || number > maxValue) {
                    maxValue = number;
                }
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }

        if (count > 0) {
            System.out.println("min = " + minValue + ", max = " + maxValue);
        } else {
            System.out.println("No valid data entered");
        }
    }
}
