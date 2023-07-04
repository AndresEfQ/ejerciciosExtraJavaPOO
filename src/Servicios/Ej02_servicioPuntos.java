package Servicios;

import Entidades.Ej02_Puntos;

import java.util.Scanner;

public class Ej02_servicioPuntos {

    Ej02_Puntos puntos = new Ej02_Puntos();
    public void crearPuntos() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la aplicación para crear puntos, por favor ingrese");

        System.out.println("Punto 1:");
        System.out.print("X1: ");
        puntos.setX1(Integer.parseInt(sc.nextLine()));

        System.out.print("Y1: ");
        puntos.setY1(Integer.parseInt(sc.nextLine()));

        System.out.println("Punto 2");
        System.out.print("X2: ");
        puntos.setX2(Integer.parseInt(sc.nextLine()));

        System.out.print("Y2: ");
        puntos.setY2(Integer.parseInt(sc.nextLine()));
    }

    public double calcularDistancia() {
        return Math.sqrt(Math.pow((this.puntos.getX2() - this.puntos.getX1()), 2) + Math.pow((this.puntos.getY2() - this.puntos.getY1()), 2));
    }
}
