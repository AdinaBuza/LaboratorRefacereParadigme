package laborator6;

import lab5.StudentBursier;
import lab6.AplicatieCuBursa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

class AplicatieCuBursaTest {
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test
    void sortTest1() {
        List<StudentBursier> lista = appCuBursa.genereaza();

        appCuBursa.sorteaza(lista);

        for (int i = 0; i < lista.size() - 1; i++) {
            StudentBursier curent = lista.get(i);
            StudentBursier urmator = lista.get(i + 1);


            int compFormatie = curent.getFormatieDeStudiu().compareTo(urmator.getFormatieDeStudiu());

            Assertions.assertTrue(compFormatie <= 0,
                    "Eroare sortare la indexul " + i + ": Formatia nu este in ordine alfabetica!");


            if (compFormatie == 0) {
                int compNume = curent.getNume().compareTo(urmator.getNume());
                Assertions.assertTrue(compNume <= 0,
                        "Eroare sortare la indexul " + i + ": Numele nu este in ordine in aceeasi grupa!");
            }
        }
    }
}