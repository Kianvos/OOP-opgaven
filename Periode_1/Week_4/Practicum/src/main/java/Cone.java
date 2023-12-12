public class Cone {
    private double height; // height of the cone
    private double radius; // radius of the circular base

    public static void main(String[] args) {
        Cone c = new Cone(5.0, 10.0);
        System.out.println(c.getRadius());
    }

    public Cone(double radius, double height) {
        if (radius < 0){
            radius = radius*-1;
        }
        if (height < 0){
            height = height*-1;
        }
        this.radius = radius;
        this.height = height;
    }
    public double area() {   // calculate and return the area of the cone
        return Math.PI*this.radius*(this.radius+Math.sqrt((Math.pow(this.height,2)+Math.pow(this.radius,2))));
    }
    public double volume() { // calculate and return the volume of the cone
        double bovenkant = Math.PI*Math.pow(this.radius, 2)*this.height;
        return bovenkant/3;
    }

    public void setHeight(double height) { // changes the height of a cone
        if (height > 0){
            this.height = height;
        }
    }

    public void setRadius(double radius) { // changes the radius of a cone
        if (radius > 0){
            this.radius = radius;
        }
    }

    public double getHeight() {// returns the height of a cone
        return this.height;
    }

    public double getRadius() { // returns the radius of a cone
        return this.radius;
    }

}
