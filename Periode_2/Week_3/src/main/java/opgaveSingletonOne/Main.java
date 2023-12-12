package opgaveSingletonOne;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Start program");
        ReadFile readFile = new ReadFile("test.txt");
        String[] lines= new String[0];
        try {
            lines = readFile.readLines();
            if (lines!=null) {
                for(String line : lines) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.log("Eind of program");

        LoggerAlternative loggerAlternative = new LoggerAlternative();
        ReadFileAlternative readFileAlternative = new ReadFileAlternative("test.txt", loggerAlternative);
        loggerAlternative.log("Start program");

        try {
            lines = readFileAlternative.readLines();
            if (lines!=null) {
                for(String line : lines) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        loggerAlternative.log("Eind of program");
    }
}
