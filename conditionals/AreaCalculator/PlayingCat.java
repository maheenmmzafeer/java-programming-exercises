public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true,10);
        isCatPlaying(false, 36);
        isCatPlaying(true, 38);
        isCatPlaying(false, 36);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && temperature >=25 && temperature <= 45) {
            return true;
        } else if (!summer && temperature >=25 & temperature <=35) {
            return true;
        } else return false;
    }
}
