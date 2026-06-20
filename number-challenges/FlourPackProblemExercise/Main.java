public class Main {
    public static void main(String[] args) {

        System.out.println(canPack(66, 45, 60));
        System.out.println(canPack(2, 2, 60));
        System.out.println(canPack(5, 10, 60));
        System.out.println(canPack(4, 40, 60));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigBags = goal % 5;
        int noOfBags = goal / 5;
        int noOfBigBags = bigCount * 5;

        if (bigBags == 0 && bigCount >= noOfBags) {
            return true;
        } else if (smallCount >= goal && goal > 0) {
            return true;
        } else if ((noOfBigBags + smallCount >= goal) && goal > 0) {
            return bigBags <= smallCount;
        }
        return false;
    }
}