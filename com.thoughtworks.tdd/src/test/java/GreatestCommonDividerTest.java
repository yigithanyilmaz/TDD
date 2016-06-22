import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDividerTest {
    @Test
    public void OneAndOne() throws Exception {
        assertEquals(1,gcd(1,1));


    }

    private int gcd (int a,int b){
        while(a!=b){
            int t = b;
            b = a % t;
            a = t;
        }
        return a;
    }
}
