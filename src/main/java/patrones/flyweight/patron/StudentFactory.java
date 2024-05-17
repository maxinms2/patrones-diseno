package patrones.flyweight.patron;

import java.util.HashMap;
import java.util.Map;

public class StudentFactory {
    private static final Map<String, Student> students = new HashMap<>();

    public static Student getStudent(String name) {
        Student student = students.get(name);

        if (student == null) {
            student = new ConcreteStudent(name);
            students.put(name, student);
        }

        return student;
    }
}
