import org.junit.Test;
import static org.junit.Assert.*;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));

    }
}
