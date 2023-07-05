package Entidades;

public class Ej05_JuegoMes {

    private String[] meses;
    private String mesSecreto;

    public Ej05_JuegoMes() {
    }

    public Ej05_JuegoMes(String[] meses, String mesSecreto) {
        this.meses = meses;
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
}
