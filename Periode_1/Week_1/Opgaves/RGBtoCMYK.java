public class RGBtoCMYK {
    public static void main(String []args){
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);

        System.out.println("Rood: "+ red);
        System.out.println("Groen: " + green);
        System.out.println("Blauw: " + blue);

        double white = Math.max(red, Math.max(green,blue));
        white = white/255;
        System.out.println("Wit: " + white);

        //todo
        double cyan = (white - (red/255)) / white;
        System.out.println("Cyaan: " + cyan);

        //todo
        double magenta = (white - (green/255)) / white;
        System.out.println("Magenta: " + magenta);

        //todo
        double yellow = (white - (blue/255)) / white;
        System.out.println("Geel: " + yellow);

        double black = 1-white;
        System.out.println("Zwart: " + black);
    }
}
