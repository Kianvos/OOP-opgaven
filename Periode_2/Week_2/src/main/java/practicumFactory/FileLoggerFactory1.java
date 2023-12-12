package practicumFactory;

public class FileLoggerFactory1 implements LoggerFactory1{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
