package lab3;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class GestiuneStudenti {
    public static void main(String[] args) {
        Path pathIn = Paths.get("studenti_in.txt");
        Path pathOut = Paths.get("studenti_out_sorted.txt");

        try {
            List<String> linii = Files.readAllLines(pathIn);
            List<Student> listaStudenti = new ArrayList<>();

            for (String linie : linii) {
                String[] bucati = linie.split(",");
                if (bucati.length == 4) {
                    listaStudenti.add(new Student(
                            Integer.parseInt(bucati[0].trim()),
                            bucati[1].trim(),
                            bucati[2].trim(),
                            bucati[3].trim()
                    ));
                }
            }


            listaStudenti.sort(
                    Comparator.comparing(Student::getFormatieDeStudiu)
                            .thenComparing(Student::getNume)
            );

            List<String> deSalvat = new ArrayList<>();
            for (Student s : listaStudenti) {
                deSalvat.add(s.toString());
            }

            Files.write(pathOut, deSalvat);

            System.out.println("Succes! Datele au fost sortate dupa grupa si nume in: studenti_out_sorted.txt");

        } catch (IOException e) {
            System.out.println("Eroare la procesarea fișierelor: " + e.getMessage());
        }
    }
}