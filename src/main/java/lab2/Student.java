package lab2;

import java.util.Objects;

public class Student {
    Integer numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(prenume, student.prenume) &&
                Objects.equals(nume, student.nume) &&
                Objects.equals(formatieDeStudiu, student.formatieDeStudiu);
    }


    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume, formatieDeStudiu);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + numarMatricol + ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' + ", grupa='" + formatieDeStudiu + '\'' + '}';
    }
}