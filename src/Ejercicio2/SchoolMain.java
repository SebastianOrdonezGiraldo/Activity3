package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolMain {
    public static void main(String[] args) {
        List<String> contacNumbersStudent2 = new ArrayList<>();
        contacNumbersStudent2.add("3186160639");
        List<String> contactNumbersStudent3 = new ArrayList<>();
        contactNumbersStudent3.add("318616063");
        contactNumbersStudent3.add("3168729701");
        School student1 = new School("Jose","Perez",10,14,3.9,"Ana Maria","Cesar");
        School student2 = new School("Jose","Perez",10,14,3.9,"Ana Maria","Cesar",contacNumbersStudent2);
        School student3 = new School("Jose","Perez",10,14,3.9,"Ana Maria","Cesar",contactNumbersStudent3);

        JOptionPane.showMessageDialog(null,"Student 1 data:" + "\nName: " + student1.studentName +  "\nLastname:" + student1.studentLastname + "\nGrade: " + student1.grade + "\nAge:" + student1.age + "\nGpa:"+
                student1.gpa + "\nMother Name: " + student1.motherName + "\nFathers name: " + student1.fatherName);

        JOptionPane.showMessageDialog(null,"Student 2 data:" + "\nName: " + student2.studentName +  "\nLastname:" + student2.studentLastname + "\nGrade: " + student2.grade + "\nAge:" + student2.age + "\nGpa:"+
                student2.gpa + "\nMother Name: " + student2.motherName + "\nFathers name: " + student2.fatherName + "\n Contact number:" + contacNumbersStudent2);

        JOptionPane.showMessageDialog(null,"Student 3 data:" + "\nName: " + student3.studentName +  "\nLastname:" + student3.studentLastname + "\nGrade: " + student3.grade + "\nAge:" + student3.age + "\nGpa:"+
                student3.gpa + "\nMother Name: " + student3.motherName + "\nFathers name: " + student3.fatherName + "\n Contact numbers:" + contactNumbersStudent3);
    }

}
