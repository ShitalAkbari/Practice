public class lengthofstring {

    public static int getLengthOfString(String str) {
        int count = 0;

        for (char s : str.toCharArray()) {
            count++;
        }
        return count;
    }
}

