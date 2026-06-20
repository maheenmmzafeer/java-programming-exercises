public class Trace {
    static int num = 1;
    public static void main(String[] args) {
        System.out.println( "A. " + num++ );
        int num = 9;
        System.out.println( "B. " + num );
        System.out.println( "C. " + tryIt() );
        System.out.println( "D. " + tryIt(5) );
        System.out.println( "E. " + num );
    } // end main
    public static int tryIt() { return num; }
    public static int tryIt(int num) {
        System.out.println("U. " + num);
        return num;
    } // end tryIt(int)
} // end class