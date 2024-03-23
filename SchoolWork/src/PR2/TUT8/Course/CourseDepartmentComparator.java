package PR2.TUT8.Course;

import java.util.Comparator;

public class CourseDepartmentComparator implements Comparator<Course> {
    public int compare(Course c1, Course c2){
        return c1.department.compareTo(c2.department);
    }
}
