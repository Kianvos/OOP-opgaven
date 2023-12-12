public class Rational {
    public static void main(String[] args) {
        Rational a = new Rational(2, 3);
        Rational b = new Rational(-1, 3);
        Rational sum = a.add(b);
        System.out.println(sum);  // prints 1/3
    }

    private long numerator = 0;
    private long denominator = 0;

    public Rational(long numerator, long denominator) {
        if (denominator == 0) {
            System.out.println("Delen door 0 kan niet!!!!!!!!!!!!!!!");
            return;
        }
        long ggd = gcd(numerator, denominator);
        this.numerator = numerator / ggd;
        this.denominator = denominator / ggd;
    }

    // greatest common divisor
    public long gcd(long p, long q) {
        if (q == 0) {
            return p;
        }

        return gcd(q, p % q);
    }

    /**
     * Voeg het Rational object b toe aan het object
     * en geef een nieuwe Rational terug met de som.
     */
    public Rational add(Rational b) {
        long numerator = (this.numerator * b.denominator) + (this.denominator * b.numerator);
        long denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    /**
     * Vermenigvuldig het Rational object b met het object
     * en geef een nieuwe Rational terug met het product.
     */
    public Rational multiply(Rational b) {
        long numerator = (this.numerator * b.denominator) + (this.denominator * b.numerator);
        long denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    /**
     * Trek het Rational object b af van het object en geef
     * een nieuwe Rational terug met het verschil.
     */
    public Rational subtract(Rational b) {
        long numerator = this.numerator * b.numerator;
        long denominator = this.denominator * b.denominator;
        return new Rational(numerator, denominator);
    }

    /**
     * Deel het object door het Rational object b en geef
     * een nieuwe Rational terug met het resultaat.
     */
    public Rational divide(Rational b) {
        long numerator = this.numerator * b.denominator;
        long denominator = b.numerator * this.denominator;
        return new Rational(numerator, denominator);
    }

    /**
     * Geeft true terug als het gelijk is aan een ander
     * Rational object, anders false
     */
    public boolean equals(Rational that) {
        long left = this.numerator / this.denominator;
        long right = that.numerator / that.denominator;
        return (left == right);
    }

    /**
     * Geeft een string representatie terug van het rationale getal.
     * Als de noemer 1 is, druk dan alleen de teller af.
     */
    public String toString() {
        if (this.denominator == 1) {
            return numerator + "";
        }
        return numerator + "/" + denominator;
    }
}
