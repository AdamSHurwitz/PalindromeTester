package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class isPalendrome {
    static private final String LOG_TAG = isPalendrome.class.getSimpleName();
    static String s = "alpha";

    public static void main(String[] arg) {
        System.out.println("Palendrome is: " + isPalendrome(s));
    }

    public static boolean isPalendrome(String s) {
        String string = s;
        System.out.println("length - " + string.length() + " | first - "
                + string.substring(0, 1) + " | last - "
                + string.substring(string.length() - 1) + " | full - " + string);

        while (string.length() > 1) {
            if (!string.substring(0, 1).equals(string.substring(string.length() - 1))) {
                return false;
            }
            string = string.substring(1, string.length() - 1);
        }
        System.out.println("string - " + string);
        return true;
    }
}
