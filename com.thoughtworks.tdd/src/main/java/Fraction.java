/**
 * Created by Han on 14/06/16.
 */
public class Fraction {

    private final int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that){
        if (that.integerValue != 0)
            return that;
        return this;
    }

    public int intValue(){
        return integerValue;
    }
}
