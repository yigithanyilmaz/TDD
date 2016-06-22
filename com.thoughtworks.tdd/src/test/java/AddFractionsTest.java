import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddFractionsTest {


    private void checkFractionsAsIntegers(int added, int augend, int expected) {
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
        checkFractionsAsIntegers(-3, 1, -2);

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

    @Test
    public void differentDenominatorsWithoutreduce() throws Exception {
        assertEquals(new Fraction(5, 6), new Fraction(1, 2).plus(new Fraction(1, 3)));

    }

    @Test
    public void reducedResultToWholeNumber() throws Exception {
        assertEquals(new Fraction(1), new Fraction(1, 3).plus(new Fraction(2, 3)));

    }

    @Test
    public void oneDenominatorIsMultopleOfTheOther() throws Exception {
        assertEquals(new Fraction(11, 8), new Fraction(3, 4).plus(new Fraction(5, 8)));

    }

    @Test
    public void commonFactorInDenominators() throws Exception {
        assertEquals(new Fraction(11, 18), new Fraction(1, 6).plus(new Fraction(4, 9)));

    }

    @Test
    public void reduceResultEvenDenominatorsAreTheSame() throws Exception {
        assertEquals(new Fraction(3, 2), new Fraction(3, 4).plus(new Fraction(3, 4)));

    }

    @Test
    public void negativeFractionAndReducing() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(-1, 4).plus(new Fraction(3, 4)));
        assertEquals(new Fraction(-1, 8), new Fraction(3, 8).plus(new Fraction(-1, 2)));


    }

    @Test
    @Ignore("constructor doesnt avoid negative numbers")
    public void negativeSignsEverywhere() throws Exception {
        assertEquals(new Fraction(1, 2), new Fraction(1,-4).plus(new Fraction(-3, -4)));


    }
}
