public class Multadd {
    public static void main(String []args){
        double a1 = Math.cos(Math.PI/4); //rechtsboven
        double b1 = 0.5;    //Rechtsonder, keer 0.5 is hetzelfde als delen door 2
        double c1 = Math.sin(Math.PI/4); //links
        double value = multadd(a1,b1,c1);
        System.out.println(value);

        double a2 = 1;
        double b2 = Math.log(10);
        double c2 = Math.log(20);

        value = multadd(a2,b2,c2);
        System.out.println(value);

        value = expSum(2);
        System.out.println(value);
    }

    private static double multadd(double a, double b, double c){
        return a*b+c;
    }

    private static double expSum(double x){
        double exp = Math.exp(-x);
        double sqrt = Math.sqrt(1-exp);
        return multadd(x,exp,sqrt);
    }
}
