
public class Fraction {

    private final int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.numerator=integerValue;
        this.denominator=1;
    }

    public Fraction(int numerator,int denominator){
        this.denominator=denominator;
        this.numerator=numerator;
    }

    public Fraction plus(Fraction that){
            return new Fraction(this.numerator + that.numerator, denominator) ;
    }

    public int intValue(){
        return numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
