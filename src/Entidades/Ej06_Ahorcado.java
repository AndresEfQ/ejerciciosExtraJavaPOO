package Entidades;

public class Ej06_Ahorcado {

    private char[] palabra;
    private int letrasEncontradas;
    private int maximoJugadas;
    private char[] mostrarPalabra;
    private boolean[] fueEncontrada;

    public Ej06_Ahorcado() {
    }

    public Ej06_Ahorcado(char[] palabra, int letrasEncontradas, int maximoJugadas, char[] mostrarPalabra, boolean[] fueEncontrada) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.maximoJugadas = maximoJugadas;
        this.mostrarPalabra = mostrarPalabra;
        this.fueEncontrada = fueEncontrada;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public char[] getMostrarPalabra() {
        return mostrarPalabra;
    }

    public void setMostrarPalabra(char[] mostrarPalabra) {
        this.mostrarPalabra = mostrarPalabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaximoJugadas() {
        return maximoJugadas;
    }

    public void setMaximoJugadas(int maximoJugadas) {
        this.maximoJugadas = maximoJugadas;
    }

    public boolean[] getFueEncontrada() {
        return fueEncontrada;
    }

    public void setFueEncontrada(boolean[] fueEncontrada) {
        this.fueEncontrada = fueEncontrada;
    }
}
