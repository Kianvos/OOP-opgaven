package opgave_two_state_pattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader("src/opgave_two_state_pattern/statepattern.txt"));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        PrintText printText = new PrintText();
        printText.printText(lines.toArray(new String[0]));
    }
}
