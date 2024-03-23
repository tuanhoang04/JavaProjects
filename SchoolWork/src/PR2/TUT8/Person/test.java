package PR2.TUT8.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import static PR2.TUT8.Person.Person.*;

public class test {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(30,"Tuan", "26112004","Ha Noi"));
        people.add(new Person(12,"Duong","10122003","Hai Phong"));
        people.add(new Person(11,"Dinh","14122004","Ha Noi"));
        people.add(new Person(11,"Dinh","14122009","Ha Noi"));
        people.sort(new NameAndAgeComparator());
        for(Person a: people){
            System.out.println(a);
        }

        System.out.println();


        ArrayList<Student> students = new ArrayList<>();
        Student Dinh = new Student(10,"Dinh","14122004","Hanoi",12);
        Student Tuan = new Student (10,"Tuan","26112004","Ha noi",10);
        Student Duong = new Student (10, "Duong", "10122004","Ha noi",11);
        Dinh.setGPA(3.0);
        Tuan.setGPA(2.5);
        Duong.setGPA(3.5);
        students.add(Dinh);
        students.add(Tuan);
        students.add(Duong);
        students.sort(new GPAComparator());
        for(Student a : students){
            System.out.println(a);
        }

    }
}
