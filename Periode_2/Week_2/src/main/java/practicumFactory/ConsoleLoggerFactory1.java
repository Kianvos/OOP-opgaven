package practicumFactory;

public class ConsoleLoggerFactory1 implements LoggerFactory1{
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
