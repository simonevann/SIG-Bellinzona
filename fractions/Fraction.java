package fraction;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Manipulate a fraction
 * @author simone vannucci
 */
public class Fraction {

    private final int NUM, DEN; //Numerator and denumerator
    public final static int DEFAULTNUMERATOR = 1; //Default numerator if is zero

    /**
     * Get numerator
     *
     * @return numerator
     */
    public int getNumerator() {
        return NUM;
    }

    /**
     * Get denumerator
     *
     * @return
     */
    public int getDenominator() {
        return DEN;
    }

    /**
     * Multiply the object fraction with another given
     *
     * @param frc fraction to multiply
     * @return result of moltiplication
     */
    public Fraction multiply(Fraction frc) throws zeroDenominatorException {
        int newNum = this.getNumerator() * frc.getNumerator();
        int newDen = this.getDenominator() * frc.getDenominator();
        return new Fraction(newNum, newDen);
    }

    /**
     * Divide the object fraction with another given
     *
     * @param frc fraction to divide
     * @return result of division
     */
    public Fraction divide(Fraction frc) throws zeroDenominatorException {
        int newNum = (int) this.getNumerator() * frc.getDenominator();
        int newDen = (int) this.getDenominator() * frc.getNumerator();
        return new Fraction(newNum, newDen);
    }

    /**
     * Add a given fraction to the object fraction
     *
     * @param frc fraction to add
     * @return result of addition
     */
    public Fraction add(Fraction frc) throws zeroDenominatorException {
        int newDen = this.getDenominator() * frc.getDenominator();
        int num1 = this.getNumerator() * frc.getDenominator();
        int num2 = frc.getNumerator() * this.getDenominator();
        int newNum = num1 + num2;
        return new Fraction(newNum, newDen);
    }

    /**
     * Subtract a given fraction to the object fraction
     *
     * @param frc fraction to subtract
     * @return result of subtraction
     */
    public Fraction subtract(Fraction frc) throws zeroDenominatorException {
        int newDen = this.getDenominator() * frc.getDenominator();
        int num1 = this.getNumerator() * frc.getDenominator();
        int num2 = frc.getNumerator() * this.getDenominator();
        int newNum = num1 - num2;
        return new Fraction(newNum, newDen);
    }

    /**
     * Calculate the value of a given fraction
     *
     * @param frc obj fraction
     * @return division of numerator and denumerator
     */
    private static double toDouble(Fraction frc) {
        return (double)frc.getNumerator() / (double)frc.getDenominator();
    }

    /**
     * Calculate the value of this fraction, return a Double
     *
     * @return division of numerator and denumerator
     */
    public double toDouble() {
        return Fraction.toDouble(this);
    }

    /**
     * Calculate the value of this fraction, return a Float
     *
     * @return division of numerator and denumerator
     */
    public float toFloat() {
        return (float) Fraction.toDouble(this);
    }

    /**
     * Determine if this fraction is improper
     *
     * @return true if improper
     */
    private boolean isImproper() {
        return (this.getNumerator() > this.getDenominator());
    }

    /**
     * Calculate remainder of a improper fraction
     *
     * @return reminder of numerator / denominator
     */
    private int getProperNumeratior() {
        return this.getNumerator() % this.getDenominator();
    }

    /**
     * Determine if a fraction is apparent
     *
     * @return true if apparent
     */
    private boolean isApparent() {
        return (this.getProperNumeratior() == 0);
    }

    /**
     * Render a proper or an apparent fraction
     *
     * @return fraction rendering
     */
    private String renderFraction() {
        return this.isApparent()
                ? String.valueOf((int) this.toDouble()) : String.valueOf(this.getNumerator() + "/" + this.getDenominator());
    }

    /**
     * Render an improper fraction as mixes
     *
     * @return mixed fraction
     */
    private String renderAsMixed() throws zeroDenominatorException {
        Fraction mixedFrc = new Fraction(this.getProperNumeratior(), this.getDenominator());
        Fraction apparentFrc = this.subtract(mixedFrc);
        return apparentFrc.renderFraction() + "+" + mixedFrc.renderFraction();
    }

    /**
     * Calculate the Greatest Common Divisor 
     * @param num numerator
     * @param den denominator
     * @return gcd, 1 if numbers are mutualy prime
     */
    private static int GCD(int num, int den) {
        int n1 = Math.abs(num);
        int n2 = Math.abs(den);
        if (n2 > n1) {
            int tmp = n1;
            n1 = n2;
            n2 = tmp;
        }
        int r;
        while ((r = n1 % n2) != 0) {
            n1 = n2;
            n2 = r;
        }
        return n2;
    }

    @Override
    public String toString() {
        if (isImproper()) {
            try {
                return this.renderAsMixed();
            } catch (zeroDenominatorException ex) {
                Logger.getLogger(Fraction.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return this.renderFraction();
        }
        return null;
    }

    public Fraction(int num, int den) throws zeroDenominatorException {
        if (num == 0) den = Fraction.DEFAULTNUMERATOR;
        if (den == 0){
            throw new zeroDenominatorException(); 
        } else if (den < 0) {
            den *= -1;
            num *= -1;
        }
        int gcd = Fraction.GCD(num, den);
        this.DEN = den / gcd;
        this.NUM = num / gcd;
    }

    public Fraction(int num) throws zeroDenominatorException {
        this(num, Fraction.DEFAULTNUMERATOR);
    }

    public Fraction(Fraction fr) {
        this.DEN = fr.getDenominator();
        this.NUM = fr.getNumerator();
    }

}
