package lab3;

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

    public String getFormatieDeStudiu() {
        return formatieDeStudiu;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }
}