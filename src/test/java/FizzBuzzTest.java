import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {


    @Test
    public void fizzTestMethod3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(15);
        Assert.assertEquals("FIZZ-BUZZ", fizzBuzz.fizzBuzz(15));
    }
    @Test
    public void fizzTestMethod2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(5);
        Assert.assertEquals("BUZZ", fizzBuzz.fizzBuzz(5));
    }
    @Test
    public void fizzTestMethod1() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.fizzBuzz(3);
        Assert.assertEquals("FIZZ", fizzBuzz.fizzBuzz(3));
    }
}
