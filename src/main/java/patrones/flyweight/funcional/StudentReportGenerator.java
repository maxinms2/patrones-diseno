package patrones.flyweight.funcional;

import java.util.ArrayList;
import java.util.List;

import patrones.flyweight.patron.Student;

public class StudentReportGenerator {

    private final StudentFactory studentFactory;

    public StudentReportGenerator(StudentFactory studentFactory) {
        this.studentFactory = studentFactory;
    }

    public void generateStudentReport(List<String> studentNames) {
        studentNames.stream()
                    .map(studentFactory::getStudent)
                    .forEach(Student::generateReport);
    }
}
