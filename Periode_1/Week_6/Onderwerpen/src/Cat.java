public class Cat extends Pet {
    private String name;

    public Cat(String name) {
        super(name);
    }

    public String isHungry(){
        return "Meoweoweowoeoeoew!!!";
    }

    public static void main(String[] args) {
        Pet poema = new Cat("Poema");
        System.out.println(poema.isHungry());
        System.out.println(poema.sleep());
    }
}
