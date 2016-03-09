package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class isPalendrome {
    static private final String LOG_TAG = isPalendrome.class.getSimpleName();
    static String s = "a";

    public static void main(String[] arg) {
        System.out.println("Answer is: " + isPalendrome(s));
    }

    public static boolean isPalendrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        } else {return false;}
    }
}
