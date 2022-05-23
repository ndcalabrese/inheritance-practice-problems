package person_and_subclasses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Part 1: Person
        System.out.println();
        Person nick = new Person("Nick Calabrese", "100 W Chatham St. Cary, NC 27513");
        Person fang = new Person("Fang Lu", "302 N West St. Raleigh, NC 27606");
        System.out.println(nick);
        System.out.println(fang);

        //Part 2: Student
        System.out.println();
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());

        //Part 3: Student's toString
        System.out.println();
        Student cameron = new Student("Cameron", "5601 W Morehead St. Charlotte NC, 28204");
        System.out.println(cameron);
        cameron.study();
        System.out.println(cameron);

        //Part 4: Teacher
        System.out.println();
        Teacher ada = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);

        Student patrick = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            patrick.study();
            i += 1;
        }

        System.out.println(patrick);

        // Part 5: List all Persons
        System.out.println();
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);

    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

}
