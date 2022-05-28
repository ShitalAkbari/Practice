import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class primeTest {
    @Test
    public void primenumber1() {
        boolean p1 = prime.isprime(-1);
        System.out.println("-1 is a prime number; " + p1);
    }
    @Test
    public void primenumber2() {
        boolean p1 = prime.isprime(0);
        System.out.println("0 is a prime number; " + p1);
    }
    @Test
    public void primenumber3() {
        boolean p1 = prime.isprime(3);
        System.out.println("3 is a prime number; " + p1);
    }
    @Test
    public void primenumber4() {
        boolean p1 = prime.isprime(7);
        System.out.println("7 is a prime number; " + p1);
    }
}