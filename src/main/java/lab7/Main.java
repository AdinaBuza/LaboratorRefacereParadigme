package lab7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studenti = creeazaStudenti();

        List<Student> grupa1 = new ArrayList<>();
        List<Student> grupa2 = new ArrayList<>();

        imparteInGrupe(studenti, grupa1, grupa2);

        mutaStudent(grupa1, grupa2, "TI");

        afiseazaGrupe(grupa1, grupa2);
    }

    public static List<Student> creeazaStudenti() {
        List<Student> studenti = new ArrayList<>();

        studenti.add(new Student(1, "Ion", "Popescu", "Calc", 9.5f));
        studenti.add(new Student(2, "Ana", "Ionescu", "TI", 8.7f));
        studenti.add(new Student(3, "Mihai", "Georgescu", "ISM", 7.8f));
        studenti.add(new Student(4, "Elena", "Dumitrescu", "Calc", 9.1f));
        studenti.add(new Student(5, "Paul", "Stan", "TI", 6.5f));

        return studenti;
    }

    public static void imparteInGrupe(List<Student> studenti, List<Student> grupa1, List<Student> grupa2) {
        int jumatate = (studenti.size() + 1) / 2;

        for (int i = 0; i < studenti.size(); i++) {
            if (i < jumatate) {
                grupa1.add(studenti.get(i));
            } else {
                grupa2.add(studenti.get(i));
            }
        }
    }

    public static void mutaStudent(List<Student> grupa1, List<Student> grupa2, String nouaFormatie) {
        Student deMutat = grupa1.get(0);

        Student studentMutat = schimbaFormatia(deMutat, nouaFormatie);

        grupa1.remove(deMutat);
        grupa2.add(studentMutat);
    }

    public static void afiseazaGrupe(List<Student> grupa1, List<Student> grupa2) {
        System.out.println("Grupa 1:");
        grupa1.forEach(System.out::println);

        System.out.println("\nGrupa 2:");
        grupa2.forEach(System.out::println);
    }

    public static Student schimbaFormatia(Student st, String nouaFormatie) {
        return new Student(
                st.getNumarMatricol(),
                st.getPrenume(),
                st.getNume(),
                nouaFormatie,
                st.getNota()
        );
    }
}