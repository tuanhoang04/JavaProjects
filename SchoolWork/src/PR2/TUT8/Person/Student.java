package PR2.TUT8.Person;

import PR2.TUT8.Course.Course;

import java.util.List;

public class Student extends Person{
    int studentID;
    List<Course> enrolledCourses;
    double gpa;
    public Student(int ID, String name, String dateOfBirth, String address, int studentID) {
        super(ID, name, dateOfBirth, address);
        if(validateStudentID(studentID)){
            this.studentID = studentID;
        }
    }

    public void setGPA(double gpa){
        if(validateGPA(gpa)){
        this.gpa = gpa;}
    }
    private boolean validateGPA(double gpa){
        return gpa>=0.0&&gpa<=4.0;
    }
    private boolean validateStudentID(int studentID){
        return studentID>=1;
    }

    public String toString(){
        return studentID+", "+name+", "+gpa;
    }

    public void setCourses(List<Course> courses) {
        if(!courses.isEmpty()){
            enrolledCourses = courses;
        }else{
            throw new RuntimeException("Courses list given is empty");
        }
    }
}
