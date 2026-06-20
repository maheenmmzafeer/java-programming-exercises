public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo) {

        int firstNumber = (int) (numberOne * 1000);
        int secondNumber = (int) (numberTwo * 1000);

        if (firstNumber - secondNumber == 0) {
            return true;
        } else {
            return false;
        }
    }
}
