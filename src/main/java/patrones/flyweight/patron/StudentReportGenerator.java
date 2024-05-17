package patrones.flyweight.patron;

import java.util.ArrayList;

public class StudentReportGenerator {

    public void generateStudentReport(ArrayList<String> studentNames) {
        for (String name : studentNames) {
            Student student = StudentFactory.getStudent(name);
            student.generateReport();
        }
    }

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Juan");
        students.add("María");
        students.add("Pedro");

        StudentReportGenerator generator = new StudentReportGenerator();
        generator.generateStudentReport(students);
    }
}
