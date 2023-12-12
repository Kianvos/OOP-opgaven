package Codingbat_strings;

public class ABC {
    public static void main(String[] args) {
        boolean abecedarian = isAbecedarian(args[0]);
        System.out.println("abecedarian: " + abecedarian);

        boolean doubloon = isDoubloon(args[1]);
        System.out.println("doubloon: " + doubloon);

        schaakstukken();
    }

    private static boolean isAbecedarian(String word) {
        int length = word.length() - 1;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDoubloon(String word) {
        boolean doubloon = true;
        word = word.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count != 2) {
                System.out.println(count + " " + word.charAt(i));
                doubloon = false;
                break;
            }
        }
        return doubloon;
    }

    private static void schaakstukken() {
        for (int i = 9812; i <= 9823; i++) {
            char stuk = (char)i;
            System.out.println(stuk);
        }
    }
}
