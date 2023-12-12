package practicumFactory;

public class Main {
    public static void main(String[] args) {
//        Logger consoleLogger = new ConsoleLogger();
//        consoleLogger.log("User Henk entered wrong password 3 times");
//
//        Logger fileLogger = new FileLogger();
//        fileLogger.log("User Henk entered wrong password 3 times");

//        // Create factories
//        LoggerFactory1 consoleLoggerFactory1 = new ConsoleLoggerFactory1();
//        LoggerFactory1 fileLoggerFactory1= new FileLoggerFactory1();
//        // Use factories to create loggers
//        Logger consoleLogger=consoleLoggerFactory1.createLogger();
//        Logger fileLogger=fileLoggerFactory1.createLogger();
//        // Test loggers
//        consoleLogger.log("Message to logger made by factory 1");
//        fileLogger.log("Message to logger made by factory 1");

//        // Create factory
//        LoggerFactory2 generalLoggerFactory2 = new GeneralLoggerFactory2();
//        // Use factory to create loggers
//        Logger consoleLogger=generalLoggerFactory2.createLogger(LoggerFactory2.CONSOLE_LOGGER);
//        Logger fileLogger=generalLoggerFactory2.createLogger(LoggerFactory2.FILE_LOGGER);
//        // Test loggers
//        consoleLogger.log("Message to logger made by factory 2");
//        fileLogger.log("Message to logger made by factory 2");

        // Create factory
        LoggerFactory3 generalLoggerFactory3 = new GeneralLoggerFactory3();
        // Use factory to create loggers
        Logger consoleLogger=generalLoggerFactory3.createConsoleLogger();
        Logger fileLogger=generalLoggerFactory3.createFileLogger();
        // Test loggers
        consoleLogger.log("Message to logger made by factory 3");
        fileLogger.log("Message to logger made by factory 3");
    }
}
