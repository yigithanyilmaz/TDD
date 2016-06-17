import org.junit.Test;

import static org.junit.Assert.*;

public class AddFractionsTest {


    private void checkFractionsAsIntegers(int added, int augend, int expected) {
        assertEquals(expected, new Fraction(added).plus(new Fraction(augend)).intValue());
        assertEquals(new Fraction(expected), new Fraction(added).plus(new Fraction(augend)));


    }

    @Test
    public void zeroPlusZero() throws Exception {
        checkFractionsAsIntegers(0, 0, 0);
    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        checkFractionsAsIntegers(3, 0, 3);

    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        checkFractionsAsIntegers(5, 0, 5);
    }

    @Test
    public void nonNegativePlusNonZero() throws Exception {
        checkFractionsAsIntegers(3, 4, 7);

    }

    @Test
    public void negativePlusPositive() throws Exception {
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());
        checkFractionsAsIntegers(-3,1,-2);

    }

    @Test
    public void nonTrivialDemoniator() throws Exception {

        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(new Fraction(3, 5), sum);


    }

    @Test
    public void negativenumberPlusNegativeNumber() throws Exception {
        assertEquals(new Fraction(-5), new Fraction(-10).plus(new Fraction(5)));

    }
}
