package Practicum;

import java.util.Objects;

public class MulTable {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Sample usage: \njava Multable.java 10 [-html]");
            return;
        }
        int size = Integer.parseInt(args[0]);
        int[][] table = createTable(size);
        if (args.length > 1){
            if (Objects.equals(args[1], "-html")){
                toHtml(table);
                return;
            }
        }
        toText(table);
    }

    public static int[][] createTable(int size) {
        int[][] table = new int[size + 1][size + 1];
        for (int row = 0; row < size + 1; row++) {
            for (int column = 0; column < size + 1; column++) {
                if (row == 0) {
                    table[row][column] = column;
                } else if (column == 0) {
                    table[row][column] = row;
                } else {
                    int calculation = (row) * (column);
                    table[row][column] = calculation;
                }
            }
        }
        return table;
    }

    public static void toText(int[][] table) {
        for (int row = 0; row < table.length; row++) {
            for (int column = 0; column < table.length; column++) {
                System.out.printf("%5d", table[row][column]);
            }
            System.out.println("");
        }
    }

    public static void toHtml(int[][] table){
        System.out.println("<html> <head> <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"> </head> <body> <table>");
        for (int row = 0; row < table.length; row++) {
            System.out.println("<tr>");
            for (int column = 0; column < table.length; column++) {
                if (column == row){
                    System.out.printf("<td class=\"diagonal\">%d</td>", table[row][column]);
                }else{
                    System.out.printf("<td>%d</td>", table[row][column]);
                }
            }
            System.out.println("</tr>");
        }
        System.out.println(" </table> </body> </html>");
    }
}
