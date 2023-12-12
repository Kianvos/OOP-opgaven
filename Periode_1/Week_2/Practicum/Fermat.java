public class Fermat {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[0]);

        double aPow = Math.pow(a,n);
        double bPow = Math.pow(b,n);
        double cPow = Math.pow(c,n);

        if (n > 2 && aPow+bPow == cPow) {
            System.out.println("Potverdorie, Fermat had geen gelijk!");
        }else {
            System.out.println("Nee, dat werkt niet.");
        }
    }
}
