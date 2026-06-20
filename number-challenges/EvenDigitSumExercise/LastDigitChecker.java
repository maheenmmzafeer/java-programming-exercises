public class LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(152, 56, 21));
        System.out.println(hasSameLastDigit(152, 58, 22));
        System.out.println(hasSameLastDigit(11111, 252, 4242));
        System.out.println(hasSameLastDigit(48, 68, 978));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {

        int a = x % 10;
        int b = y % 10;
        int c = z % 10;

        if (isValid(x) && isValid(y) && isValid(z)) {
            if ((a == b || b == c || a == c)) {
                return true;
            }
        } return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else return true;
    }
}
