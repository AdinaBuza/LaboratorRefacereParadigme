package lab4;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu", "Maria", "Bucuresti", "Victor", "Cluj",
                "Simina", "Alba-Iulia", "Marius", "Medias", "Mihai", "Cisnadie", "Daniela", "Sibiu"
        );

        HashMap<String, Tanar> tineri = new HashMap<>();
        for (String nume : varste.keySet()) {
            tineri.put(nume, new Tanar(nume, varste.get(nume), adrese.getOrDefault(nume, "Necunoscuta")));
        }
        System.out.println("--- 4.5.1: Map Tineri ---");
        tineri.values().forEach(System.out::println);

        HashMap<Integer, Student> mapStudenti = new HashMap<>();
        List<String> liniiStud = Files.readAllLines(Paths.get("studenti_in.txt"));
        for (String linie : liniiStud) {
            String[] b = linie.split(",");
            if (b.length == 4) {
                int id = Integer.parseInt(b[0].trim());
                mapStudenti.put(id, new Student(id, b[1].trim(), b[2].trim(), b[3].trim()));
            }
        }

        List<String> liniiNote = Files.readAllLines(Paths.get("note_anon.txt"));
        for (String linie : liniiNote) {
            String[] b = linie.split(",");
            if (b.length == 2) {
                int id = Integer.parseInt(b[0].trim());
                float notaVal = Float.parseFloat(b[1].trim());
                if (mapStudenti.containsKey(id)) {
                    mapStudenti.get(id).setNota(notaVal);
                }
            }
        }
        System.out.println("\n 4.5.2: Studenți cu note ");
        mapStudenti.values().forEach(System.out::println);

        System.out.println("\n 4.5.3: Rezultate cautare O(1) ");
        float notaM = gasesteNota("Bianca", "Popescu", mapStudenti);
        System.out.println("Nota Bianca Popescu: " + notaM);

        float notaN = gasesteNota("Ioan", "Popa", mapStudenti);
        System.out.println("Nota Ioan Popa: " + notaN);
    }

    public static float gasesteNota(String prenume, String nume, HashMap<Integer, Student> map) {
        HashMap<String, Student> mapNume = new HashMap<>();
        for (Student s : map.values()) {
            mapNume.put(s.prenume + "-" + s.nume, s);
        }
        String cheie = prenume + "-" + nume;
        if (mapNume.containsKey(cheie)) {
            return mapNume.get(cheie).getNota();
        }
        return 0.0f;
    }
}