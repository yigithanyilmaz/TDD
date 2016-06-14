import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Han on 14/06/16.
 */
public class AddFracrionsTest {
    @Test
    public void zeroPlusZero() throws Exception {
       final Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0,sum.intValue());

    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(0));

        assertEquals(3, sum.intValue());

    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        final Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(5, sum.intValue());

    }

    @Test
    public void nonNegativeNonZeroOperands() throws Exception {
        final Fraction sum = new Fraction(3).plus(new Fraction(4));
        assertEquals(7, sum.intValue());

    }
    @Test
    public void negativePlusPositive() throws Exception {
        final Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(-2, sum.intValue());

    }
}
