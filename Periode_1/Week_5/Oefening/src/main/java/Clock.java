import java.util.concurrent.TimeUnit;

/**
 * Represents a clock.
 */
public class Clock {

    public static void main(String[] args) {
        Clock clock = new Clock();
        while (true){
            try {
                Thread.sleep(1);
                clock.tick();
                System.out.println(clock);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private NumberDisplay hour;
    private NumberDisplay minute;
    private NumberDisplay second;

    /**
     * Construct a Clock object with default values.
     */
    public Clock() {
        this.hour = new NumberDisplay(0);
        this.minute = new NumberDisplay(60, 0);
        this.second = new NumberDisplay(60, 0);
    }

    /**
     * Construct a Clock object with given values.
     *
     * @param hour   The current hour
     * @param minute The current minute
     */
    public Clock(int hour, int minute, int second) {
        this.hour = new NumberDisplay(hour);
        this.minute = new NumberDisplay(60, minute);
        this.second = new NumberDisplay(60, second);
    }

    /**
     * Returns the hour.
     *
     * @return The current hour
     */
    public int getHour() {
        return this.hour.getValue();
    }

    /**
     * Returns the minute.
     *
     * @return The current minute
     */
    public int getMinute() {
        return this.minute.getValue();
    }

    public int getSecond(){
        return this.second.getValue();
    }

    /**
     * Sets the hour.
     *
     * @param hour The new hour
     */
    public void setHour(int hour) {
        this.hour.setValue(hour);
    }

    /**
     * Sets the minute.
     *
     * @param minute The new minute
     */
    public void setMinute(int minute) {
        this.minute.setValue(minute);
    }


    public void setSecond(int minute) {
        this.second.setValue(minute);
    }

    /**
     * Prints the time in a simple format.
     *
     * @param c The Clock object
     */
    public static void printTime(Clock c) {
        System.out.print(c.hour);
        System.out.print(":");
        System.out.println(c.minute);
        System.out.print(":");
        System.out.println(c.second);
    }

    /**
     * Returns a String representation of the time.
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", hour.getValue(), minute.getValue(), second.getValue());
    }

    /**
     * Tests whether two times are equivalent.
     *
     * @param that The other Clock object
     * @return True if equal else false
     */
    public boolean equals(Clock that) {
        return this.hour == that.hour && this.minute == that.minute;
    }

    /**
     * Adds 1 minute to the clock
     */
    public void tick() {
        System.out.println(!second.increment());
        if (!second.increment()) {
            int secondValue = second.getValue();
            int newSecondValue = secondValue + 1;
            second.setValue(newSecondValue);
        } else {
            second.setValue(0);
            if (!minute.increment()) {
                int minuteValue = minute.getValue();
                minute.setValue(minuteValue + 1);
            } else {
                minute.setValue(0);
                if (!hour.increment()) {
                    int hourValue = hour.getValue();
                    hour.setValue(hourValue + 1);
                } else {
                    hour.setValue(0);
                }
            }
        }
    }
}