package lab9;

import java.util.*;
import java.util.stream.Collectors;

public class Problema931 {
    public void executa() {
        System.out.println("  REZOLVARE 9.3.1  ");
        Random rand = new Random();
        List<Integer> numere = rand.ints(10, 5, 26).boxed().collect(Collectors.toList());

        System.out.println("Lista: " + numere);

        int suma = numere.stream().mapToInt(Integer::intValue).sum();
        System.out.println("a) Suma: " + suma);

        Optional<Integer> max = numere.stream().max(Integer::compare);
        Optional<Integer> min = numere.stream().min(Integer::compare);
        System.out.println("b) Max: " + max.orElse(0) + ", Min: " + min.orElse(0));

        List<Integer> filtrate = numere.stream()
                .filter(n -> n >= 10 && n <= 20)
                .collect(Collectors.toList());
        System.out.println("c) Intre 10 si 20: " + filtrate);

        List<Double> listaDouble = numere.stream()
                .map(Double::valueOf)
                .collect(Collectors.toList());
        System.out.println("d) Double: " + listaDouble);

        boolean contine12 = numere.stream().anyMatch(n -> n == 12);
        System.out.println("e) Contine 12? " + contine12 + "\n");
    }
}