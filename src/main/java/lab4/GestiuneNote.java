package lab4;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class GestiuneNote {
    public static void main(String[] args) throws IOException {

        HashMap<Integer, Student> mapStudenti = new HashMap<>();

        List<String> liniiStud = Files.readAllLines(Paths.get("studenti_in.txt"));
        for (String linie : liniiStud) {
            String[] b = linie.split(",");
            if (b.length == 4) {
                int id = Integer.parseInt(b[0].trim());
                Student s = new Student(id, b[1].trim(), b[2].trim(), b[3].trim());
                mapStudenti.put(id, s);
            }
        }

        List<String> liniiNote = Files.readAllLines(Paths.get("note_anon.txt"));
        for (String linie : liniiNote) {
            String[] b = linie.split(",");
            if (b.length == 2) {
                int id = Integer.parseInt(b[0].trim());
                float nota = Float.parseFloat(b[1].trim());

                if (mapStudenti.containsKey(id)) {
                    mapStudenti.get(id).setNota(nota);
                }
            }
        }

        System.out.println("Studenti cu note alocate (procesare O(1)) ");
        for (Student s : mapStudenti.values()) {
            System.out.println(s);
        }
    }
}