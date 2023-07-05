package Servicios;

import Entidades.Ej05_JuegoMes;

import java.util.Scanner;

public class Ej05_servicioJuegoMes {

    private final Ej05_JuegoMes juegoMes = new Ej05_JuegoMes();

    private void crearJuego() {
        String[] meses = {
                "enero",
                "febrero",
                "marzo",
                "abril",
                "mayo",
                "junio",
                "julio",
                "agosto",
                "septiembre",
                "octubre",
                "noviembre",
                "diciembre"
        };
        int random = (int)(Math.random()*12);

        this.juegoMes.setMeses(meses);
        this.juegoMes.setMesSecreto(meses[random]);
    }
    public void adivinarMes() {
        Scanner sc = new Scanner(System.in);

        this.crearJuego();
        System.out.print("Introduzca el nombre del mes en minusculas: ");
        String guess = sc.nextLine();

        while (!guess.equalsIgnoreCase(this.juegoMes.getMesSecreto())) {
            System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            guess = sc.nextLine();
        }

        System.out.println("¡Ha acertado!");
    }
}
