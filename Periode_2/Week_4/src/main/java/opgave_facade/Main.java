package opgave_facade;

public class Main {
    public static void main(String[] args) {
        ListMap<Integer, String> listMap = new ListMap<Integer, String>();
        // Leden toevoegen
        listMap.put(232, "Henk");
        listMap.put(184, "Els");
        listMap.put(481, "Joe");
        listMap.put(481, "Jse");
        // Lid opvragen
        listMap.printAll();
        String memberName= listMap.get(481);
        System.out.println(memberName); // Els
    }

}
