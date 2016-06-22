
public class Fraction {

    private final int numerator;
    private int denominator;

    public Fraction(int integerValue) {
        this.numerator = integerValue;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        final int signOfDenominator = denominator < 0 ? -1 : 1;
        final int gcd =NumberTheory.gcd(numerator,denominator) * signOfDenominator;
        this.denominator = denominator/gcd;
        this.numerator = numerator/gcd;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator){
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator, this.denominator * that.denominator);

        }
        return new Fraction(this.numerator + that.numerator, denominator);
    }

    public String toString() {

        return String.format("%d/%d", numerator, denominator);
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return super.equals(other);
    }

    @Override
    public int hashCode(){ return numerator * 19 + denominator;}

    public int gcd (int a,int b){
        while(b != 0){
            int t = b;
            b = a % t;
            a = t;
        }
        return Math.abs(a);
    }

}


