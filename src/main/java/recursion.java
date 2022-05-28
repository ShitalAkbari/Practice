public class recursion {

    public static String rec(String str) {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return rec(str.substring(1)) + str.charAt(0);
    }

    public static String rec1(String str1) {
        if (str1.isEmpty())
            return str1;
        //Calling Function Recursively
        return rec(str1.substring(1)) + str1.charAt(0);


    }

    public static void main(String[] args) {
        String str = "Good";
        String reversed = rec(str);
        System.out.println("The reversed string is: " + reversed);
        String str1 = "Test";
        String reversed1 = rec(str1);
        System.out.println("The reversed string is: " + reversed1);
    }
}
