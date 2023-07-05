package Servicios;

import Entidades.Ej06_Ahorcado;

import java.util.Arrays;
import java.util.Scanner;

public class Ej06_servicioAhorcado {

    private final Ej06_Ahorcado ahorcado = new Ej06_Ahorcado();
    private final Scanner sc = new Scanner(System.in);

    private void crearJuego() {

        System.out.println("Bienvenido al juego del Ahorcado");
        System.out.print("Ingrese la palabra: ");
        String palabra = sc.nextLine();

        System.out.println("Seleccione la dificultad:");
        System.out.println("1. Fácil");
        System.out.println("2. Medio");
        System.out.println("3. Difícil");
        System.out.println("4. Extremo");
        int opcion = Integer.parseInt(sc.nextLine());

        while (opcion < 1 || opcion > 4) {
            System.out.print("Opción inválida, intente de nuevo");
            opcion = Integer.parseInt(sc.nextLine());
        }

        int maximoJugadas = 0;

        switch (opcion) {
            case 1 -> {
                maximoJugadas = 10;
                System.out.println("Tiene 10 oportunidades");
            }
            case 2 -> {
                maximoJugadas = 5;
                System.out.println("Tiene 5 oportunidades");
            }
            case 3 -> {
                maximoJugadas = 3;
                System.out.println("Tiene 3 oportunidades");
            }
            case 4 -> {
                maximoJugadas = 1;
                System.out.println("Tiene 1 oportunidad");
            }
        }

        this.ahorcado.setPalabra(palabra.toCharArray());
        this.ahorcado.setMaximoJugadas(maximoJugadas);
        this.ahorcado.setLetrasEncontradas(0);

        char[] mostrarPalabra = new char[this.longitud()];
        Arrays.fill(mostrarPalabra, '_');
        this.ahorcado.setMostrarPalabra(mostrarPalabra);

        boolean[] fueEncontrada = new boolean[this.longitud()];
        Arrays.fill(fueEncontrada, false);
        this.ahorcado.setFueEncontrada(fueEncontrada);
    }

    private int longitud() {
        return this.ahorcado.getPalabra().length;
    }

    private void buscar(char letra) {

        char[] palabra = this.ahorcado.getPalabra();
        boolean[] fueEncontrada = this.ahorcado.getFueEncontrada();

        for (int i = 0; i < this.longitud(); i++) {
            if (palabra[i] == letra) {
                System.out.println("La letra " + letra + " está en la palabra");
                if (fueEncontrada[i]) {
                    System.out.println("La letra " + letra + " ya había sido ingresada");
                }
                return;
            }
        }
        System.out.println("La letra no se encontró en la palabra");
    }

    private boolean encontradas(char letra) {

        char[] palabra = this.ahorcado.getPalabra();
        char[] mostrarPalabra = this.ahorcado.getMostrarPalabra();
        boolean[] fueEncontrada = this.ahorcado.getFueEncontrada();
        int encontradas = this.ahorcado.getLetrasEncontradas();
        boolean result = false;

        for (int i = 0; i < this.longitud(); i++) {
            if (palabra[i] == letra) {
                result = true;

                mostrarPalabra[i] = letra;
                this.ahorcado.setMostrarPalabra(mostrarPalabra);

                if (!fueEncontrada[i]) {
                    encontradas++;
                    this.ahorcado.setLetrasEncontradas(encontradas);
                }

                fueEncontrada[i] = true;
                this.ahorcado.setFueEncontrada(fueEncontrada);
            }
        }
        return result;
    }

    private void intentos() {
        System.out.println("Hasta el momento la palabra descubierta es: " + this.mostrarPalabraEncontrada());
        System.out.println("Letras encontradas: " + this.ahorcado.getLetrasEncontradas());
        System.out.println("Letras faltantes: " + (this.longitud() - this.ahorcado.getLetrasEncontradas()));
        System.out.println("Oportunidades restantes: " + this.ahorcado.getMaximoJugadas());
        System.out.println();
    }

    private void finJuego(boolean esGanador) {
        if (esGanador) {
            System.out.println("!Felicidades¡ encontró la palabra " + this.mostrarPalabraEncontrada());
            System.out.println("Le quedaron " + this.ahorcado.getMaximoJugadas() + " intentos restantes.");
        } else {
            System.out.println("Lo sentimos, ya no hay más intentos");
            System.out.println("Se encontró la palabra " + this.mostrarPalabraEncontrada());
        }
    }

    private String mostrarPalabraEncontrada() {

        StringBuilder result = new StringBuilder();

        for (char letra : this.ahorcado.getMostrarPalabra()) {
            result.append(letra);
        }
        return result.toString();
    }

    public void juego() {
        this.crearJuego();

        while (this.ahorcado.getMaximoJugadas() > 0) {
            System.out.print("Ingrese una letra: ");
            char letra = sc.nextLine().charAt(0);

            this.buscar(letra);

            if (!this.encontradas(letra)) {
                this.ahorcado.setMaximoJugadas(this.ahorcado.getMaximoJugadas() - 1);
            }

            if (this.ahorcado.getMaximoJugadas() == 0) {
                this.finJuego(false);
                break;
            } else if (this.ahorcado.getLetrasEncontradas() == this.longitud()) {
                this.finJuego(true);
                break;
            } else {
                this.intentos();
            }
        }
    }
}
