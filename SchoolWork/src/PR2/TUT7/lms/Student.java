package PR2.TUT7.lms;

import java.util.ArrayList;

public class Student{
    private int studentID;
    private String name;
    private String dateOfBirth;
    private double gpa;
    private ArrayList<Course> enrolledCourses;

    public Student(int studentID, String name, String dateOfBirth){
        this.enrolledCourses = new ArrayList<>();
        if(validateStudentID(studentID)){
            this.studentID = studentID;
        }else{
            throw new RuntimeException("Invalid parameter");
        }

        if(validateName(name)){
            this.name = name;
        }else{
            throw new RuntimeException("Invalid parameter");
        }

        if(validateDateOfBirth(dateOfBirth)){
            this.dateOfBirth = dateOfBirth;
        }else{
            throw new RuntimeException("Invalid parameter");
        }
    }
    private boolean validateStudentID(int StudentID){
        return StudentID >= 1;
    }
    private boolean validateName(String name){
        return name.length() <= 50;
    }
    private boolean validateDateOfBirth(String dateOfBirth){
        return dateOfBirth.length() <= 10;
    }
    private boolean validateGpa(double gpa){
        return gpa>=0.0&&gpa<=10.0;
    }
    public boolean setGpa(double gpa) {
        if(validateGpa(gpa)) {
            this.gpa = gpa;
            return true;
        }else {
            return false;
        }
    }
    public void setCourse(ArrayList<Course> a){
        if(a.isEmpty()){
            throw new RuntimeException("Invalid parameter");
        }
        enrolledCourses = a;
    }
    public String getCourse(){
        return enrolledCourses.toString();
    }
    public int getStudentID(){
        return studentID;
    }
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public double getGpa(){
        return gpa;
    }
}
