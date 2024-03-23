package PR2.TUT8.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.dateOfBirth.compareTo(p2.dateOfBirth);
    }
}
