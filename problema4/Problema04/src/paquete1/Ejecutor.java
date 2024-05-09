package paquete1;

import paquete2.Banco;

public class Ejecutor {

    public static void main(String[] args) {

        Banco bancoUno = new Banco("Pedro", "Coopmego", 25000);
        bancoUno.calcularComision();

        Banco bancoDos = new Banco("Roberto", 15000);
        bancoDos.calcularComision();

        System.out.printf("%s\n", bancoUno);
        System.out.printf("%s\n", bancoDos);
    }

}
