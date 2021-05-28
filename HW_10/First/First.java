package HW_10;


import java.util.List;
import java.util.stream.Collectors;

public class First {
    public List<Person> getPersons() {
        return List.of(new Person(1, "Gandalf"),
                new Person(2, "Aragorn"),
                new Person(3, "Gimli"),
                new Person(4, "Legolas"),
                new Person(5, "Sam"),
                new Person(6, "Frodo"),
                new Person(7, "Boromir"),
                new Person(8, "Merry"),
                new Person(9, "Pippin"));
    }

    public static void main(String[] args) {
        First first = new First();
        System.out.println(exercise1(first.getPersons()));
    }

    private static String exercise1(List<Person> persons) {
        String result = persons.stream()
                .filter(person -> person.getId() % 2 != 0)
                .map(Person::toString)
                .collect(Collectors.joining(", "));
        return result;
    }
}
