import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDividerTest {
    @Test
    public void reflexive() throws Exception {
        assertEquals(1,gcd(1,1));
        assertEquals(2, gcd(2,2));
        assertEquals(-1, gcd(-1,-1)); 

    }

    @Test
    public void relativelyPrime() throws Exception {
        assertEquals(1,gcd(2,3));
        assertEquals(1,gcd(4,7));
        assertEquals(-1,gcd(-1,-1));

    }

    @Test
    public void oneIsMultipleofTheOther() throws Exception {
        assertEquals(3,gcd(3,9));
        assertEquals(5,gcd(5 ,30));

    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, gcd(6,8));
        assertEquals(7, gcd(49,315));
        assertEquals(-4,gcd(-24,-28));
        assertEquals(4,gcd(-24,28));

    }

    private int gcd (int a,int b){
        while(b != 0){
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
