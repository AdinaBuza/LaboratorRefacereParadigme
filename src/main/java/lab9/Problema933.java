package lab9;
import lab7.Student;
import java.util.*;
import java.util.stream.Collectors;

public class Problema933 {
    public void executa() {
        System.out.println("  REZOLVARE 9.3.3  ");
        List<Student> studenti = Arrays.asList(
                new Student(1025, "Andrei", "Popa", "ISM141/2", 8.70f),
                new Student(1024, "Ioan", "Mihalcea", "ISM141/1", 10.0f),
                new Student(1026, "Anamaria", "Prodan", "TI131/1", 8.90f),
                new Student(1029, "Bianca", "Popescu", "TI131/1", 10.0f),
                new Student(1029, "Maria", "Pana", "TI131/2", 4.10f),
                new Student(1029, "Gabriela", "Mohanu", "TI131/2", 7.33f),
                new Student(1029, "Marius", "Nasta", "TI131/2", 3.20f),
                new Student(1029, "Marius", "Nasta", "TI131/1", 5.12f),
                new Student(1029, "Andrei", "Dobrescu", "TI131/2", 2.22f)
        );

        System.out.println("a) Nota 10:");
        studenti.stream().filter(s -> s.getNota() == 10).forEach(System.out::println);

        System.out.println("\nb) Nota sub 5:");
        studenti.stream().filter(s -> s.getNota() < 5).forEach(System.out::println);

        System.out.println("\nc) Map (note < 4 devin 4):");
        studenti.stream()
                .map(s -> s.getNota() < 4 ? new Student(s.getNumarMatricol(), s.getPrenume(), s.getNume(), s.getFormatieDeStudiu(), 4.0f) : s)
                .forEach(System.out::println);

        double suma = studenti.stream().map(Student::getNota).reduce(0.0f, Float::sum);
        System.out.println("\nd) Suma notelor: " + suma);
        System.out.println("e) Media: " + (suma / studenti.size()) + "\n");
    }
}