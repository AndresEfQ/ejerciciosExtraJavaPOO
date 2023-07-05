package Servicios;

import Entidades.Ej04_DNI;

import java.util.Scanner;

public class Ej04_servicioDni {

    private final Ej04_DNI dni = new Ej04_DNI();

    public void crearNif() {
        Scanner sc = new Scanner(System.in);

        char[] tabla = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Por favor ingresa el DNI");
        long dniNum = Long.parseLong(sc.nextLine());
        dni.setDni(dniNum);

        char nifNum = tabla[(int)dniNum % 23];
        dni.setNif(nifNum);
    }

    public String mostrar() {
        return Long.toString(this.dni.getDni()) + '-' + this.dni.getNif();
    }
}
