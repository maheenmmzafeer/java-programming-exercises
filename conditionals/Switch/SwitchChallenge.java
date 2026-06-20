public class SwitchChallenge {
    public static void main(String[] args) {

        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + letter + " was not found in the switch");
                break;
        }
    }
}
