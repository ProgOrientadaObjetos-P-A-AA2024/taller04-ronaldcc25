package paquete1;

import paquete2.Profesores;

public class Ejecutor {

    public static void main(String[] args) {
        Profesores profUno = new Profesores(
                "Edwin", "Loyola", 1100, "1103689520");
        profUno.calcularSueldoTotal();
        
        Profesores profDos = new Profesores(
                "Isaac", "Cartuche", "1102365874");
        profDos.calcularSueldoTotal();
        
        System.out.printf("%s", profUno);
        System.out.printf("%s", profDos);
    }

}
