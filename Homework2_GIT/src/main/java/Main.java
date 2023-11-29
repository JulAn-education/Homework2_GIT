import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        

        Student student1 = new Student("Tom",5,  17, 2100, 40, 80, "m");
        Student student2 = new Student("Bill",4.9F,  20, 2500, 45, 45, "f");
        Student student3 = new Student("Mark",4.3F,  21, 2300, 30, 60, "f");
        Student student4 = new Student("Tim",4.6F,  25, 2700, 20, 90, "m");
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);


        student1.percentageOfAttendance();

        Scanner sc = new Scanner(System.in);
        while(true){

            System.out.println("Выберете действие: ");
            System.out.println("1 - Список студентов");
            System.out.println("2 - Добавить студента");
            System.out.println("3 - Удалить студента");
            System.out.println("4 - Изменить оценку");
            System.out.println("5 - Изменить степендию");
            System.out.println("6 - Отсортированный список");
            System.out.println("7 - Выход");

            int data = sc.nextInt();
            switch (data){
                case 1:
                    System.out.println(listStudent);
                    break;
                case 2:
                    System.out.println("Введите имя: ");
                    String name = sc.next();
                    System.out.println("Введите среднюю оценку: ");
                    float averageMark = sc.nextFloat();
                    System.out.println("Введите возраст: ");
                    int age = sc.nextInt();
                    System.out.println("Введите степендию: ");
                    int scholarship = sc.nextInt();
                    System.out.println("Введите процент посещаемости: ");
                    double classesAttended = sc.nextDouble();
                    System.out.println("Введите процент непосещаемости: ");
                    double missedClasses = sc.nextDouble();
                    System.out.println("Введите пол: ");
                    String gender = sc.next();
                    Student student = new Student(name, averageMark, age, scholarship, classesAttended, missedClasses, gender);
                    listStudent.add(student);
//                    setAge.add(student);
//                    setStudent.add(student);
//                    setScholarship.add(student);
                    break;
                case 3:

                    System.out.println("Введите имя: ");
                    name = sc.next();
                    for (int i = 0; i < listStudent.size(); i++){
                        if(listStudent.get(i).getName().equals(name)){
                            listStudent.remove(listStudent.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Введите имя: ");
                    name = sc.next();
                    System.out.println("Новая оценка: ");
                    float newAverageMark = sc.nextFloat();
                    for (int i = 0; i < listStudent.size(); i++){
                        if(listStudent.get(i).getName().equals(name)){
                            listStudent.get(i).setAverageMark(newAverageMark);
                        }
                    }

                    break;
                case 5:
                    System.out.println("Введите имя: ");
                    name = sc.next();
                    System.out.println("Степендия: ");
                    int newScholarship = sc.nextInt();
                    for(int i = 0; i < listStudent.size(); i++){
                        if(listStudent.get(i).getName().equals(name)){
                            listStudent.get(i).setScholarship(newScholarship);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Выберете список: ");
                    System.out.println("1 - По средней оценке");
                    System.out.println("2 - По степендии");
                    System.out.println("3 - По возрасту");
                    System.out.println("4 - По заполнению");
                    System.out.println("5 - По посещаемости");
                    int num = sc.nextInt();
                    if (num == 1){
                        listStudent.stream().sorted(new averageMarkComparator()).forEach(System.out::println);

                    } else if (num == 2){
                        listStudent.stream().sorted(new scholarshipComparator()).forEach(System.out::println);

                    } else if(num == 3){
                        listStudent.stream().sorted(new ageComparator()).forEach(System.out::println);

                    } else if (num == 4){

                        System.out.println(listStudent);
                    } else if(num == 5)
                        listStudent.stream().sorted(new percent()).forEach(System.out::println);

                    break;



                case 7:
                    System.exit(0);
            }


        }
    }
    
}
