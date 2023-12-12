public class GreatCircle {
    public static void main(String []args){
        double x1 = Double.parseDouble(args[0]);
        x1 = Math.toRadians(x1);
        double sinX1 = Math.sin(x1);
        double cosX1 = Math.cos(x1);

        double x2 = Double.parseDouble(args[2]);
        x2 = Math.toRadians(x2);
        double sinX2 = Math.sin(x2);
        double cosX2 = Math.cos(x2);

        double y1 = Double.parseDouble(args[1]);
        y1 = Math.toRadians(y1);

        double y2 = Double.parseDouble(args[3]);
        y2 = Math.toRadians(y2);

        double cosY = Math.cos(y1-y2);


        double greatCircle = Math.acos(sinX1*sinX2+cosX1*cosX2*cosY);
        double distanceRadialen = greatCircle*60;
        double distance = Math.toDegrees(distanceRadialen);


        System.out.println(distance + "nautical miles");
    }
}
