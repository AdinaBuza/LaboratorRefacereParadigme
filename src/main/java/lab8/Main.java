package lab8;

import lab7.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExcelManager manager = new ExcelManager();
        StudentExcelManager studentManager = new StudentExcelManager();
        String input = "laborator8_input.xlsx";

        try {
            System.out.println("   EXERCITIUL 8.5.1 (Citire si Afisare)  ");
            manager.citesteSiAfiseaza(input);

            System.out.println("\n EXERCITIUL 8.5.2 (Media calculata manual)  ");
            manager.genereazaFisierMediaManual(input, "laborator8_output2.xlsx");
            System.out.println("Fisierul laborator8_output2.xlsx a fost generat.");

            System.out.println("\n   EXERCITIUL 8.5.3 (Media prin formula Excel)  ");
            manager.genereazaFisierMediaFormula(input, "laborator8_output3.xlsx");
            System.out.println("Fisierul laborator8_output3.xlsx a fost generat.");

            System.out.println("\n   EXERCITIUL 8.5.4 (Export / Import Studenti)  ");
            List<Student> listaInitiala = new ArrayList<>();
            listaInitiala.add(new Student(101, "Andrei", "Popa", "TI", 9.0f));
            listaInitiala.add(new Student(102, "Bianca", "Ionescu", "Calc", 8.5f));

            String fisierStudenti = "laborator8_students.xlsx";
            studentManager.exportaStudenti(listaInitiala, fisierStudenti);
            System.out.println("a) Lista de studenti a fost exportata in " + fisierStudenti);

            List<Student> listaCitita = studentManager.importaStudenti(fisierStudenti);
            System.out.println("b) Studenti cititi inapoi din Excel:");
            for (Student s : listaCitita) {
                System.out.println(s);
            }

            System.out.println("\n  PROCESARE FINALIZATA CU SUCCES!  ");

        } catch (IOException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}