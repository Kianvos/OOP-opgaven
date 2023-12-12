import java.util.Arrays;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class Profile {

    public static void main(String[] args) {
        String[] table = readLines(args[0]);
        String[] dna = readLines(args[1]);
        String [] names = getNames(table);
        String [] strs = getStrs(table);
        int[][] values = getValues(table);
        int[] value = new int[strs.length];

        int index = -1;
        for (int i = 0; i < strs.length; i++) {
            int repeat = maxStrRepeat(strs[i], dna[0]);
            value[i] = repeat;
        }
        for (int i = 0; i < values.length; i++) {
            if ( Arrays.equals(values[i], value)){
                index = i;
            }
        }
        if (index == -1){
            System.out.println("No match");
        }else{
            System.out.println(names[index]);
        }
    }

    /**
     * Read a file and return an array of lines
     *
     * @param filename The filename (path) to read
     * @return         An array of lines reads
     */
    public static String[] readLines(String filename) {
        String[] data;

        try {
            Path path = Paths.get(filename);
            data = Files.readString(path).strip().split("\n");
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
            data = new String[0];
        }

        return data;
    }

    public static String[] getNames(String[] lines){
        String[] names = new String[lines.length-1];
        for (int i = 0; i < lines.length; i++) {
            if (i != 0){
                String[] name = lines[i].split(",");
                names[i-1] = name[0];
            }
        }
        return names;
    }

    public static int[][] getValues(String[] lines){
        String[] column = lines[0].split(",");

        int[][] values = new int[lines.length-1][column.length-1];

        for (int i = 0; i < lines.length; i++) {
            if (i != 0) {
                column = lines[i].split(",");
                for (int j = 0; j < column.length; j++) {
                    if (j != 0) {
                        int valueInt = Integer.parseInt(column[j]);
                        values[i-1][j-1] = valueInt;
                    }
                }
            }
        }
        return values;
    }

    public static String[] getStrs(String[] lines){
        String[] str = lines[0].split(",");
        String[] strs = new String[str.length-1];
        for (int i = 0; i < str.length; i++) {
            if (i != 0){
                strs[i-1] = str[i];
            }
        }
        return strs;
    }

    public static int maxStrRepeat(String str, String sequence){
        int count = 0;
        String strT = "";
        while(true){
            strT = strT+str;
            if (sequence.contains(strT)){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
