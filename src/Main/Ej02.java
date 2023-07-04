package Main;

import Servicios.Ej02_servicioPuntos;

public class Ej02 {

    public static void main(String[] args) {

        Ej02_servicioPuntos sp = new Ej02_servicioPuntos();
        sp.crearPuntos();
        System.out.println("La distancia entre los puntos ingresados es: " + sp.calcularDistancia());
    }
}
