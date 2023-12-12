package opgaveSingletonTwo;

public class CounterRunner implements java.lang.Runnable {

    @Override
    public void run() {
        SingletonCounter singletonCounter = SingletonCounter.getInstance();
        singletonCounter.count();
        System.out.println(singletonCounter);
        singletonCounter.count();
        System.out.println(singletonCounter);
        singletonCounter.count();
        System.out.println(singletonCounter);
    }
}
