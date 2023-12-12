public class House {
    public static void main(String[] args) {
        House myHouse = new House(149);
        House yourHouse = new House(150, "blue");
        System.out.println(myHouse);
        System.out.println(yourHouse);
    }
    private int number;
    private String colour;

    public House(int number) {
        this.number = number;
        colour = "red";
    }

    public House(int number, String colour) {
        this.number = number;
        this.colour = colour;
    }

    public String toString() {
        return String.format("House number %d with colour %s", number, colour);
    }
}