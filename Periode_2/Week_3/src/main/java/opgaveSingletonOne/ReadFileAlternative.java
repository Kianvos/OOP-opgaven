package opgaveSingletonOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAlternative {

    private String filename;
    private LoggerAlternative logger;

    public ReadFileAlternative(String filename, LoggerAlternative logger) {
        this.filename = filename;
        this.logger = logger;
    }

    public String[] readLines() throws IOException {
        try (
                BufferedReader br = new BufferedReader(new FileReader(filename));
        ) {
            String[] lines = (String[]) br.lines().toArray();
            logger.log(lines.length + " lines read succesfully from file " + filename);
            return lines;
        } catch (FileNotFoundException e) {
            logger.log("File " + filename + " not found");
        }
        return null;
    }
}