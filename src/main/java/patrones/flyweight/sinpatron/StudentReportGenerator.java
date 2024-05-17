package patrones.flyweight.sinpatron;

import java.util.ArrayList;

public class StudentReportGenerator {

    public void generateStudentReport(ArrayList<String> studentNames) {
        for (String name : studentNames) {
            // Lógica para generar el reporte de cada estudiante
            System.out.println("Reporte del estudiante: " + name);
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
