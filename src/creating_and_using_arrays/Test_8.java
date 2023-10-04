package creating_and_using_arrays;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
}
public class Test_8 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));

        for(Student stud : students) {
            System.out.println(stud);
        }
        // Yaddaşda 5 müxtəlif Student obyekti yaradılıb. 4 add ve 1 remove. Bu o deməkdir ki, 5 Student obyekti müxtəlif -
        // yaddaş ünvanlarda saxlanılacaq.
        // remove methodu`da equals(Object), əslində == opertorundan istifadə edir. Buna görə hər biri fərqli yaddaş ünvanlarında
        // yerləşdiyindən nəticə olaraq false qaytaracaq və heç bir element silinməyəcək.
    }
}
