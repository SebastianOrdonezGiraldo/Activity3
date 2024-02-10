package Ejercicio2;

import java.util.List;

public class School {
    //ATRIBUTOS
    public String studentName;
    public String studentLastname;
    public int grade;
    public int age;
    public double gpa;
    public String motherName;
    public String fatherName;
    public List<String> parentsContactNumbers;


    // Constructor con la lista de números de teléfono de los padres
    public School(String studentName, String studentLastname, int grade, int age, double gpa, String motherName, String fatherName,List<String> parentsContactNumbers) {
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.grade = grade;
        this.age = age;
        this.gpa = gpa;
        this.motherName = motherName;
        this.fatherName = fatherName;
        this.parentsContactNumbers = parentsContactNumbers;
    }
    //Constructor sin la lista de números de teléfono de los padres
    public School(String studentName, String studentLastname, int grade, int age, double gpa, String motherName, String fatherName) {
        this.studentName = studentName;
        this.studentLastname = studentLastname;
        this.grade = grade;
        this.age = age;
        this.gpa = gpa;
        this.motherName = motherName;
        this.fatherName = fatherName;
}
}
