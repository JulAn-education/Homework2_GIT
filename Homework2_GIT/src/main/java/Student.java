import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Student {

    private String name;
    private float averageMark;
    private int age;
    private int scholarship;

    private double classesAttended;
    private double missedClasses;
    private String gender;


    public Student(String name, float averageMark, int age, int scholarship, double classesAttended, double missedClasses, String gender) {

        this.name = name;
        this.averageMark = averageMark;
        this.age = age;
        this.scholarship = scholarship;
        this.classesAttended = classesAttended;
        this.missedClasses = missedClasses;
        this.gender = gender;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    
}
