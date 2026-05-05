package lab8;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExcelManager manager = new ExcelManager();
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

            System.out.println("\n  PROCESARE FINALIZATA CU SUCCES!  ");

        } catch (IOException e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}