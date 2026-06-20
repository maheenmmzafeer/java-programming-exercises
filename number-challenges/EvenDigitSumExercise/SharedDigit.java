public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 9));
        System.out.println(hasSharedDigit(22, 52));
        System.out.println(hasSharedDigit(14, 75));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        if (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10 || num1 / 10 == num2 % 10 || num1 / 10 == num2 / 10) {
            return true;
        } else return false;
    }
}

