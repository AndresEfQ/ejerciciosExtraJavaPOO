package Entidades;

public class Ej04_DNI {

    private long dni;
    private char nif;

    public Ej04_DNI() {
    }

    public Ej04_DNI(long dni, char nif) {
        this.dni = dni;
        this.nif = nif;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public char getNif() {
        return nif;
    }

    public void setNif(char nif) {
        this.nif = nif;
    }
}
