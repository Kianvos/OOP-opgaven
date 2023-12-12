package opgaveSingletonOne;

public class LoggerAlternative {

    private int lineNr;

    public LoggerAlternative() {
        log("Instance of Logger created.");
    }

    public void log(String text) {
        lineNr++;
        System.out.println("LOG "+lineNr+": "+text);
    }

}