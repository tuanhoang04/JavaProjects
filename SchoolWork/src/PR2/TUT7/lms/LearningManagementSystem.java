package PR2.TUT7.lms;

import java.util.ArrayList;

public class LearningManagementSystem {
    public static void main(String[] args) {
        ArrayList<String> acaTranscript = new ArrayList<>();
        acaTranscript.add("1");
        Course Toan = new Course(12,"Toan","Toan hinh hoc va dai so",12,acaTranscript);
        Course Van = new Course(11,"Van","Van hoc",11,acaTranscript);
        Course Anh = new Course(10, "Anh", "Anh Van",10,acaTranscript);
        ArrayList<Course> arrCourse = new ArrayList<>();
        arrCourse.add(Toan);
        arrCourse.add(Van);
        arrCourse.add(Anh);

        Student Duong = new Student(12, "Duong", "2004");
        Duong.setCourse(arrCourse);
        System.out.println(Duong.getCourse());
        System.out.println(Duong.getDateOfBirth()+" "+Duong.getName());

    }
}
