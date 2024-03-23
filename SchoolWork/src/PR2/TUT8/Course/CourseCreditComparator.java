package PR2.TUT8.Course;

import java.util.Comparator;

public class CourseCreditComparator implements Comparator<Course> {
    public int compare(Course c1, Course c2){
        return Integer.compare(c1.credits, c2.credits);
    }
}
