public class Time {

    public static void main(String[] args) {
        Time tijd_1 = new Time(20,23);
        Time tijd_2 = new Time(20,23);
        System.out.printf("%d" +"\n", tijd_1.getHour());
        System.out.println(tijd_1.equals(tijd_2));
    }
    private int hour = 0;
    private int minute = 0;
    private double second = 0;

    public void setHour(int hour) {
        this.hour = hour;
        if (this.hour == 24){
            this.hour = 0;
        }
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public double getSecond() {
        return this.second;
    }

    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0.0;
    }

    public boolean equals(Time that){
        final double DELTA = 0.001;
        return this.hour == that.getHour()
                && this.minute == that.getMinute()
                && Math.abs(this.second - that.getSecond()) < DELTA;
    }
}
