import java.util.ArrayList;

public class Ball {
    // position vector r
    private double rx;
    private double ry;

    // velocity vector v
    private double vx;
    private double vy;

    // ball radius
    private double radius;

    public Ball() {
        this.rx = 0;
        this.ry = 0;
        this.vx = 0.015 - Math.random() * 0.03;
        this.vy = 0.015 - Math.random() * 0.03;
        this.radius = 0.025 + Math.random() * 0.05;
    }

    // bounce off vertical wall by reflecting x-velocity
    private void bounceOffVerticalWall(){
        if (rx >= 1 || rx <= -1){
            vx = vx*-1;
        }
    }

    // bounce off horizontal wall by reflecting y-velocity
    private void bounceOffHorizontalWall(){
        if (ry >= 1 || ry <= -1){
            vy = vy*-1;
        }
    }

    // move the ball one step
    public void move(){
        rx = rx + vx;
        ry = ry + vy;
        bounceOffVerticalWall();
        bounceOffHorizontalWall();
    }

    // draw the ball, but not the background
    public void draw() {
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledCircle(rx, ry, radius);
    }

    public String toString() {
        String result = "";
        result += "position: (" + rx + ", " + ry + ") ";
        result += "velocity: (" + vx + ", " + vy + ") ";
        result += "radius: " + radius;

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<Ball>();
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
        balls.add(new Ball());
        // initialize standard drawing
        StdDraw.setXscale(-1.0, +1.0);
        StdDraw.setYscale(-1.0, +1.0);
        StdDraw.enableDoubleBuffering();

        while (true) {
            // clear canvas and set backgound
            StdDraw.clear(StdDraw.GRAY);

            for (int i = 0; i < balls.size(); i++) {
                // move the ball
                balls.get(i).move();
                // draw the ball
                balls.get(i).draw();
            }

            StdDraw.show();     // show the balls on canvas
            StdDraw.pause(20);  // pause before the next cycle

        }
    }
}
