package PR2.TUT8.Person;

import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return Double.compare(s1.gpa,s2.gpa);
    }
}
