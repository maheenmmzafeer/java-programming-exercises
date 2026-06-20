public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(7);
    }

    public static void printDayOfWeek (int day) {

        switch(day) {
            case 0 -> System.out.println("0 is Sunday");
            case 1 -> System.out.println("1 is Monday");
            case 2 -> System.out.println("2 is Tuesday");
            case 3 -> System.out.println("3 is Wednesday");
            case 4 -> System.out.println("4 is Thursday");
            case 5 -> System.out.println("5 is Friday");
            case 6 -> System.out.println("6 is Saturday");
            default -> System.out.println("Invalid day");
        };

    }

    public static void printWeekDay (int day) {

        if (day == 0) {
            System.out.println("0 is Sunday");
        } else if (day == 1) {
            System.out.println("1 is Monday");
        } else if (day == 2) {
            System.out.println("2 is Tuesday");
        } else if (day == 3) {
            System.out.println("3 is Wednesday");
        } else if (day == 4) {
            System.out.println("4 is Thursday");
        } else if (day == 5) {
            System.out.println("5 is Friday");
        } else if (day == 6) {
            System.out.println("6 is Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
