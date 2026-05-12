package lab9;

import java.util.*;
import java.util.stream.Collectors;

public class Problema932 {
    public void executa() {
        System.out.println("  REZOLVARE 9.3.2  ");
        String text = "Acesta este un program scris in java pentru expresii lambda";
        List<String> cuvinte = Arrays.asList(text.split(" "));

        List<String> filtrate = cuvinte.stream()
                .filter(w -> w.length() >= 5)
                .collect(Collectors.toList());
        System.out.println("a) Lungime >= 5: " + filtrate);

        List<String> sortate = filtrate.stream().sorted().collect(Collectors.toList());
        System.out.println("b) Sortate: " + sortate);

        cuvinte.stream()
                .filter(w -> w.startsWith("p"))
                .findFirst()
                .ifPresent(s -> System.out.println("c) Incepe cu 'p': " + s + "\n"));
    }
}