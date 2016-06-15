import com.sun.prism.impl.FactoryResetException;
import org.junit.Test;
import static org.junit.Assert.*;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));

    }

    @Test
    public void differentNumberAndDenominator() throws Exception {
        assertNotEquals(new Fraction(2, 54), new Fraction(31, 35));



    }

    @Test
    public void differentDominators() throws Exception {
        assertNotEquals(new Fraction(3,4), new Fraction(3,555));

    }
}
