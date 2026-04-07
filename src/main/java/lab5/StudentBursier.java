package lab5;

import lab4.Student;
import java.util.Objects;

public class StudentBursier extends Student {
    double cuantumBursa;

    public StudentBursier(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu, float nota, double cuantumBursa) {
        super(numarMatricol, prenume, nume, formatieDeStudiu);
        this.setNota(nota);
        this.cuantumBursa = cuantumBursa;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (getClass() != o.getClass()) return false;
        StudentBursier that = (StudentBursier) o;
        return Double.compare(that.cuantumBursa, cuantumBursa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cuantumBursa);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", bursa=" + cuantumBursa + "}";
    }
}