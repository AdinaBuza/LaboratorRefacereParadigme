package lab2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Student> setStudenti = new HashSet<>();

        setStudenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
        setStudenti.add(new Student(101, "Ion", "Ionescu", "TI21/1"));
        setStudenti.add(new Student(105, "Elena", "Vasile", "TI21/2"));

        Student cautatB = new Student(120, "Alis", "Popa", "TI21/2");
        Student cautatC = new Student(112, "Maria", "Popa", "TI21/1");


        System.out.println("b) Studentul Alis este prezent? " + setStudenti.contains(cautatB));
        System.out.println("c) Studentul Maria este prezent? " + setStudenti.contains(cautatC));
    }
}