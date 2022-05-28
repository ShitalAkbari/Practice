import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class recursionTest {

    @Test
    public void recString() {
        recursion rec = new recursion();
        recursion.rec("Good");
        Assert.assertNotEquals("Good", "dooG");

    }

    @Test
    public void recString1() {
        recursion rec1 = new recursion();
        recursion.rec1("Test");
        Assert.assertNotEquals("Test", "tseT");
    }
}