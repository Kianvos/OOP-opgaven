package practicumCommandPattern;

public class Radio implements BasicAVdevice{

    int volume=5;
    boolean on = false;

    public static int MAX_VOLUME=20;

    public void turnOn() {
        if (!on) {
            on=true;
            System.out.println("Radio on");
        }
    }

    public void turnOff() {
        if (on) {
            on=false;
            System.out.println("Radio off");
        }
    }

    public void volumeUp() {
        if (on && volume<MAX_VOLUME) {
            volume++;
            System.out.println("Volume up ("+volume+")");
        }
    }

    public void volumeDown() {
        if (on && volume>0) {
            volume--;
            System.out.println("Volume down ("+volume+")");
        }
    }

    public void test() {
        if (on && volume>0) {
            volume--;
            System.out.println("teTst");
        }
    }

}
