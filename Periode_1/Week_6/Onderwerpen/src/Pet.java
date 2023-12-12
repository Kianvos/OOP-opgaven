abstract public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String sleep() {
        return "Zzzzz";
    }

    abstract public String isHungry();
}
