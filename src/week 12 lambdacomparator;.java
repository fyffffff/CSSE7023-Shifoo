package lambdacomparator;

import java.util.List;
import java.util.*;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    @Override
    public String toString() { return name + ": " + age; }

    /**
     * Sorts the given list of people alphabetically (lexicographically) by
     * their name.
     *
     * @param people list of people to sort
     * @return sorted list of people
     */
    public static List<Person> sortByName(List<Person> people) {
        // write your code here
        people.sort((Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));
        return people;
    }

    /**
     * Sorts the given list of people in ascending order by age.
     *
     * @param people list of people to sort
     * @return sorted list of people
     */
    public static List<Person> sortByAge(List<Person> people) {
        // write your code here
        people.sort((Person p1, Person p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        return people;
    }

    /**
     * Sorts the given list of people in ascending order by age, then
     * secondarily in alphabetical order by name if two people have the same
     * age.
     *
     * @param people list of people to sort
     * @return sorted list of people
     */
    public static List<Person> sortByAgeThenName(List<Person> people) {
        // write your code here
        people.sort((Person p1, Person p2) -> p1.getAge() == p2.getAge() ? p1.getName().compareTo(p2.getName()) : Integer.compare(p1.getAge(), p2.getAge()));
        return people;
    }
}
