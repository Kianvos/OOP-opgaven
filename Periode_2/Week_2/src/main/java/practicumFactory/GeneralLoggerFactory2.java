package practicumFactory;

public class GeneralLoggerFactory2 implements LoggerFactory2{
    public static final int CONSOLE_LOGGER = 1;
    public static final int FILE_LOGGER = 2;
    @Override
    public Logger createLogger(int type) {
        if (type == CONSOLE_LOGGER){
            return new ConsoleLogger();
        }
        return new FileLogger();
    }
}
