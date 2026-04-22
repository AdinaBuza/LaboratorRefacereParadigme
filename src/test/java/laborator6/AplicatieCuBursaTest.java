package laborator6;

import lab5.StudentBursier;
import lab6.AplicatieCuBursa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AplicatieCuBursaTest {
    AplicatieCuBursa appCuBursa = new AplicatieCuBursa();

    @Test


    void sortTest1() {

        List<StudentBursier> lista = new ArrayList<>();
        StudentBursier bursier1 = new StudentBursier(1025, "Andrei", "Popa", "ISM141/2", 8.70f, 725.50);
        lista.add(bursier1);
        StudentBursier bursier2 = new StudentBursier(1024, "Ioan", "Mihalcea", "ISM141/1", 9.80f, 801.10);
        lista.add(bursier2);
        StudentBursier bursier3 = new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10f, 780.80);
        lista.add(bursier3);
        StudentBursier bursier4 = new StudentBursier(1026, "Anamaria", "Prodan", "TI131/1", 8.90f, 745.50);
        lista.add(bursier4);
        StudentBursier bursier5 = new StudentBursier(1029, "Bianca", "Popescu", "TI131/1", 9.10f, 100.00);
        lista.add(bursier5);


        List<StudentBursier> lista_sortata= appCuBursa.sorteaza(lista);

        Assertions.assertEquals(lista_sortata.get(0).getNume(),"Mihalcea");
        Assertions.assertEquals(lista_sortata.get(1).getNume(),"Popa");
        Assertions.assertEquals(lista_sortata.get(2).getNume(),"Popescu");
        Assertions.assertEquals(lista_sortata.get(3),bursier3);
        Assertions.assertEquals(lista_sortata.get(4),bursier4);



    }
}