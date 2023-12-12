package Businesscard;

public class Employee {
    private String name;
    private String job;
    private String phonenumber;

    private BusinessCardStrategy businessCardStrategy;

    public Employee(String name) {
        this.name = name;
    }
}
