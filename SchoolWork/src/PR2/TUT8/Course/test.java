package PR2.TUT8.Course;

import PR2.TUT8.Person.Student;

import java.util.ArrayList;
import java.util.List;

import static PR2.TUT8.Course.Course.department.*;
import static PR2.TUT8.Course.Course.semester.*;


public class test {
    public static void main(String[] args) {
        Course Math = new Course(1,"Math",12, FIS,FIRST);
        Course History = new Course(6,"History",15,FIT,SECOND);
        Course Arithmetic = new Course(3,"Arithmetic",10,FMT,THIRD);
        Course Literature = new Course(3,"Literature",10,FMT,SECOND);
        List<Course> courses=new ArrayList<>();
        Student a = new Student(10,"Tuan","26112004","Ha noi",10);
        Math.addStudent(a);
        courses.add(Math);
        courses.add(History);
        courses.add(Arithmetic);
        courses.add(Literature);

        Math.getEnrolledStudent();
        Math.removeStudent(a);
        Math.getEnrolledStudent();
        System.out.println();

        courses.sort(new CourseNameComparator());
        printCourses(courses);
        System.out.println();

        courses.sort(new CourseCreditComparator());
        printCourses(courses);
        System.out.println();


        courses.sort(new CourseDepartmentComparator());
        printCourses(courses);


    }
    public static void printCourses(List<Course> courses){
        for(Course a: courses){
            System.out.println(a);
        }
    }
}
