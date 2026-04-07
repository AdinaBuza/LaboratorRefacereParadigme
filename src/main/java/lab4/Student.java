package lab4;

import java.util.Objects;

public class Student {
    Integer numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;
    float nota;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    public void setNota(float nota) { this.nota = nota; }
    public float getNota() { return nota; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numarMatricol, student.numarMatricol);
    }

    @Override
    public int hashCode() { return Objects.hash(numarMatricol); }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + numarMatricol +
                ", nume='" + prenume + " " + nume + '\'' +
                ", grupa='" + formatieDeStudiu + '\'' + // <-- ACEASTA LIPSIA!
                ", nota=" + nota +
                '}';
    }
}