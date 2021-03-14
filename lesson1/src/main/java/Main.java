public class Main {
    //task_1

    static byte byteValue = 5;
    static short shortValue = 1000;
    static int intValue = 2_000_000_000;
    static long longValue = 2_000_000_000_000l;
    static String str = "example";
    static char charValue = 'c';
    static boolean bool = true;
    static float floatValue = 2.5F;
    static double doubleValue = 2.333333;

    //

    //task_3
    public static float expression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //task_4
    public static boolean isBetweenTenAndTwenty(int a, int b) {
        return ((a + b >= 10) && (a + b <= 20));
    }

    //task_5

    public static void checkPositive(int a) {
        System.out.println(a >= 0 ? "Positive" : "Negative");
    }

    //task_6

    public static boolean isNegative(int a) {
        return a < 0;
    }

    //task_7
    public static void hello(String name) {
        System.out.println("Hello " + name + "!");
    }

    //task_8
    public static void isYearLeap(int year) {
        System.out.println((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? "Leap" : "Not leap");
    }

    public static void main(String[] args) {

    }
}
