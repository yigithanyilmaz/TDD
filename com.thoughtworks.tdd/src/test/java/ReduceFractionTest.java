import org.junit.Test;

import static org.junit.Assert.*;

public class ReduceFractionTest {

    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3,4), new Fraction(3,4));

    }

    @Test
    public void reduceToNotWholeNumber() throws Exception {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }
}