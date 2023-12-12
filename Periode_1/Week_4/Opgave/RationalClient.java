public class RationalClient {
    private long numerator = 0;
    private long denominator = 0;

    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        approxE(count);
//        value += 1/factorial(1);
//        System.out.println(value);
    }

    public static int factorial(int n){
        if (n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static Rational approxE(int n){
        Rational rational = new Rational(0,factorial(0));
        for (int i = 0; i < n; i++) {
            Rational tmp = new Rational(1,factorial(i));
            rational = rational.add(tmp);
            System.out.print(rational.toString() +" ");
        }
        return rational;
    }
}
