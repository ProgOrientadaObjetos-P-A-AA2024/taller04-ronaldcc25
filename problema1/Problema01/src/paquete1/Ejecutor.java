package paquete1;

import paquete2.LibretaNotas;

public class Ejecutor {

    public static void main(String[] args) {

        /* 
        Cuando tengamos que calcular algo tenemos que llamar al metodo donde 
        calculamos dicho valor para poder presentarlo
         */
        LibretaNotas libreta1 = new LibretaNotas("Ronald", 10, 8, 9);
        libreta1.calcularPromedio();

        LibretaNotas libreta2 = new LibretaNotas("Andres", 8.26, 9);
        libreta2.calcularPromedio();

        System.out.printf("%s\n", libreta1);
        System.out.printf("%s\n", libreta2);
    }

}
