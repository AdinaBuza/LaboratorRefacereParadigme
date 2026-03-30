package lab4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu",
                "Maria", "Bucuresti",
                "Victor", "Cluj",
                "Simina", "Alba-Iulia",
                "Marius", "Medias",
                "Mihai", "Cisnadie",
                "Daniela", "Sibiu"
        );

        System.out.println("Varste initiale: " + varste);
        varste.put("Vlad", 19);
        varste.put("Iulia", 19);
        System.out.println("Varste dupa adaugare Vlad si Iulia: " + varste);

        HashMap<String, Tanar> tineri = new HashMap<>();

        for (String nume : varste.keySet()) {
            int varsta = varste.get(nume);

            String adresa = adrese.getOrDefault(nume, "Necunoscuta");

            tineri.put(nume, new Tanar(nume, varsta, adresa));
        }

        System.out.println("\n Continut Map tineri ");
        for (String numeCheie : tineri.keySet()) {
            System.out.println("Cheie (nume): " + numeCheie + " | Valoare: " + tineri.get(numeCheie));
        }
    }
}