import org.junit.Test;
import sun.security.util.Length;

import static org.junit.Assert.*;

public class lengthofstringTest {

    @Test
    public void lofs() {
       String sInput = "Good";
        System.out.println("Length of the string -" + sInput + "is" +lengthofstring.getLengthOfString(sInput));

       }
       @Test
       public void lofs1() {
           String sInput1 = "G";
           System.out.println("Length of the string -" + sInput1 + "is" +lengthofstring.getLengthOfString(sInput1));

       }
    @Test
    public void lofs2() {
        String sInput2 = "Test200";
        System.out.println("Length of the string -" + sInput2 + "is" +lengthofstring.getLengthOfString(sInput2));

    }
}




