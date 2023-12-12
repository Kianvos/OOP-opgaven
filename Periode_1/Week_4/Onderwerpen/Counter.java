public class Counter implements Runnable {

    public static void main(String[] args) {
        Counter c1 = new Counter("Counter 1", 20, 200);
        Counter c2 = new Counter("Counter 2", 10, 700);
        Counter c3 = new Counter("Counter 3", 10, 340);
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
    private String name;
    private int maxvalue;
    private long pause;

    public Counter(String name, int maxvalue, long pause) {
        this.name = name;
        this.maxvalue = maxvalue;
        this.pause = pause;
    }

    @Override
    public void run() {
        int value=1;
        do {
            System.out.println(name+" - "+value);
            value++;
            try {
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(value<=maxvalue);
    }

}