public class MinutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        long years = minutes / (60 * 24 * 365);
        long days = minutes / (60 * 24) % 365;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
