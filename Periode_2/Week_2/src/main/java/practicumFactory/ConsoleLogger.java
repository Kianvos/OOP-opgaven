package practicumFactory;

import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " " + message);
    }
}
