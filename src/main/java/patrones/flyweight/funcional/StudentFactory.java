package patrones.flyweight.funcional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import patrones.flyweight.patron.ConcreteStudent;
import patrones.flyweight.patron.Student;

public class StudentFactory {
    private final Map<String, Student> students = new HashMap<>();

    public Student getStudent(String name) {
        return students.computeIfAbsent(name, this::createStudent);
    }

    private Student createStudent(String name) {
        return new ConcreteStudent(name);
    }
}
