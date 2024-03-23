package PR2.TUT7.lms;

import java.util.ArrayList;

public class Course {
    private final int courseID;
    private final String name;
    private final String description;
    private final int credit;
    ArrayList<String> academicTranscript;
    public Course(int courseID,String name,String description,int credit,ArrayList<String> academicTranscript){
        this.name = name;
        this.academicTranscript = academicTranscript;
        this.courseID = courseID;
        this.credit = credit;
        this.description = description;
    }
    public String toString(){
        return name+", "+courseID+", "+description;
    }

}
