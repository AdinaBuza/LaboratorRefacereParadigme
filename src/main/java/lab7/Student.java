package lab7;

import java.util.Objects;

public final class Student {
    private final Integer numarMatricol;
    private final String prenume;
    private final String nume;
    private final String formatieDeStudiu;
    private final float nota;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu, float nota) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
        this.nota = nota;
    }

    public Integer getNumarMatricol() {
        return numarMatricol;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(numarMatricol, student.numarMatricol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numarMatricol);
    }

    @Override
    public String toString() {
        return "Student{ID=" + numarMatricol +
                ", nume='" + prenume + " " + nume +
                "', grupa='" + formatieDeStudiu +
                "', nota=" + nota + "}";
    }
}