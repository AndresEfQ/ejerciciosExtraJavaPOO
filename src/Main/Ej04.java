package Main;

import Servicios.Ej04_servicioDni;

public class Ej04 {

    public static void main(String[] args) {

        Ej04_servicioDni sd = new Ej04_servicioDni();
        sd.crearNif();
        System.out.println(sd.mostrar());
    }
}
