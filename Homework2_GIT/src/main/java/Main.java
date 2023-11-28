import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        

        Student student1 = new Student("Tom",5,  17, 2100, 40, 60, "m");
        Student student2 = new Student("Bill",4.9F,  20, 2500, 45, 55, "f");
        Student student3 = new Student("Mark",4.3F,  21, 2300, 30, 70, "f");
        Student student4 = new Student("Tim",4.6F,  25, 2700, 20, 80, "m");
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
    }
    
}
