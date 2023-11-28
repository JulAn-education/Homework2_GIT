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

    @Override
    public String toString() {
        return "Student{" +
                "averageMark=" + averageMark +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", scholarship=" + scholarship +
                ", classesAttended=" + classesAttended +
                ", missedClasses=" + missedClasses +
                ", gender='" + gender + '\'' +
                '}';


    
    }

    public double percentageOfAttendance(){

        double c = (classesAttended/(missedClasses + classesAttended)) * 100;
        return c;

    }
}

class ageComparator implements Comparator <Student>{


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() < o2.getAge()){
            return 1;
        } else if(o1.getAge() > o2.getAge()){
            return -1;
        } else {
            return 0;
        }
    }
}

class averageMarkComparator implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAverageMark() < o2.getAverageMark()) {
            return 1;
        } else if (o1.getAverageMark() > o2.getAverageMark()){
            return -1;
        }else {
            return 0;
        }
    }
}

class scholarshipComparator implements Comparator <Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getScholarship() < o2.getScholarship()){
            return 1;
        }else if (o1.getScholarship() > o2.getScholarship()){
            return -1;
        }else{
            return 0;
        }
    }
}




