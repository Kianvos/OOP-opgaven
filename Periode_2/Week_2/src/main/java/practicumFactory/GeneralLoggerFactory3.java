package practicumFactory;

public class GeneralLoggerFactory3 implements LoggerFactory3{

    @Override
    public Logger createConsoleLogger() {
        return new ConsoleLogger();
    }

    @Override
    public Logger createFileLogger() {
        return new FileLogger();
    }
}
