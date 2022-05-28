import com.sun.javafx.binding.StringFormatter;

public class reverseString {

    public static void revString(String str, String rstr) {

        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        System.out.println("The Original String: " + str);
        System.out.println(("The Original String: " + rstr));
    }
}


