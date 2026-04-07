package lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("    EXERCITIUL 5.5.1 (Calculatoare)   ");

        IntCalculator calculator = new IntCalculator(10);
        int result1 = calculator.add(5).subtract(3).multiply(2).result();
        System.out.println("Rezultat IntCalculator (10 + 5 - 3) * 2 = " + result1);

        AdvancedCalculator advCalc = new AdvancedCalculator(10);
        int result2 = advCalc.divide(2).power(3).root(2).result();
        System.out.println("Rezultat AdvancedCalculator = " + result2);

        System.out.println("\n    EXERCITIUL 5.5.3 (Studenti Bursieri)    ");
        List<StudentBursier> bursieri = new ArrayList<>();

        bursieri.add(new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70f, 725.50));
        bursieri.add(new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80f, 801.10));
        bursieri.add(new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90f, 745.50));
        bursieri.add(new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10f, 780.80));

        bursieri.forEach(System.out::println);

        try {
            salveazaInFisier("bursieri_out.txt", bursieri);
            System.out.println("\nSucces! Fisierul bursieri_out.txt a fost generat.");
        } catch (IOException e) {
            System.err.println("\nEROARE: Fisierul nu a putut fi salvat! Detalii: " + e.getMessage());
        }
    }

    public static void salveazaInFisier(String numeFisier, List<StudentBursier> lista) throws IOException {
        List<String> randuri = new ArrayList<>();
        for (StudentBursier b : lista) {
            randuri.add(b.toString());
        }
        Files.write(Paths.get(numeFisier), randuri);
    }
}