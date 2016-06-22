import com.sun.prism.impl.FactoryResetException;
import org.junit.Test;
import sun.util.resources.cldr.br.CalendarData_br_FR;

import static org.junit.Assert.*;

public class FractionEqualsTest {
    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));

    }

    @Test
    public void differentNumberAndDenominator() throws Exception {
        assertNotEquals(new Fraction(2, 54), new Fraction(31, 35));


    }

    @Test
    public void differentDenominator() throws Exception {
        assertNotEquals(new Fraction(3, 4), new Fraction(3, 555));

    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {

        assertEquals(new Fraction(5, 1), new Fraction(5));

    }

    @Test
    public void numberNotEqualtoAnotherNumber() throws Exception {
        assertNotEquals(new Fraction(5), new Fraction(6));

    }

//    @Test
//    public void reduce() throws Exception {
//        assertEquals(new Fraction(2,1), new Fraction(4,2));
//
//    }


}
