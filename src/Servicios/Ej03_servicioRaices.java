package Servicios;

import Entidades.Ej03_Raices;

import java.util.Scanner;

public class Ej03_servicioRaices {

    Ej03_Raices raices = new Ej03_Raices();

    public void crearRaices() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingresa los coeficientes de la ecuación");

        System.out.print("a: ");
        this.raices.setA(Integer.parseInt(sc.nextLine()));

        System.out.print("b: ");
        this.raices.setB(Integer.parseInt(sc.nextLine()));

        System.out.print("c: ");
        this.raices.setC(Integer.parseInt(sc.nextLine()));
    }

    private double getDiscriminante() {
        return (double)Math.pow(this.raices.getB(),2) - (4 * this.raices.getA() * this.raices.getC());
    }

    private boolean tieneRaices() {
        return this.getDiscriminante() > 0;
    }

    private boolean tieneRaiz() {
        return this.getDiscriminante() == 0;
    }

    private void obtenerRaices() {
        if (this.tieneRaices()) {
            double raiz1 = (- this.raices.getB() + Math.sqrt(this.getDiscriminante())) / (2 * this.raices.getA());
            double raiz2 = (- this.raices.getB() - Math.sqrt(this.getDiscriminante())) / (2 * this.raices.getA());
            System.out.println("La ecuación tiene las soluciones 1: " + raiz1 + " y 2: " + raiz2);
        }
    }

    private void obtenerRaiz() {
        if (this.tieneRaiz()) {
            double raiz = (double)(- this.raices.getB()) / (2 * this.raices.getA());
            System.out.println("La ecuación tiene la solución: " + raiz);
        }
    }

    public void calcular() {
        this.obtenerRaices();
        this.obtenerRaiz();
        if (!this.tieneRaices() && !this.tieneRaiz()) {
            System.out.println("La ecuación no tiene solución");
        }
    }
}
