package practicum_iterator_2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "de Vries");
        Person person2 = new Person("Aukje", "De Jong");
        Person person3 = new Person("Els", "Visser");
        Person person4 = new Person("Hans", "Jansen");
        Person person5 = new Person("Jelmer", "Bakker");
        Team team1 = new Team();
        Team team2 = new Team();
        team1.addMember(person1);
        team1.addMember(person2);
        team1.addMember(person3);
        team1.addMember(person4);
        team2.addMember(person5);
        team2.addMember(person3);

        team1.forEach(System.out::println);
        System.out.println();
        team2.forEach(System.out::println);

//        System.out.println("Leden team 1:");
//
//        Iterator<Person> team1Iterator = team1.iterator();
//        while(team1Iterator.hasNext()) {
//            Person member = team1Iterator.next();
//            System.out.println(member);
//        }
//        System.out.println("Leden team 2:");
//        Iterator<Person> team2Iterator = team2.iterator();
//        while (team2Iterator.hasNext()) {
//            Person member = team2Iterator.next();
//            System.out.println(member);
//        }
    }
}
