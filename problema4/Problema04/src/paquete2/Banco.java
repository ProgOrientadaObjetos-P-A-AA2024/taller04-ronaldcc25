package paquete2;

public class Banco {

    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public Banco(String c, String b, double ch) {
        nombreCliente = c;
        nombreBanco = b;
        valorCheque = ch;
    }

    public Banco(String c, double ch) {
        nombreCliente = c;
        nombreBanco = "Banco Pichincha";
        valorCheque = ch;
    }

    public void establecerNombreCliente(String c) {
        nombreCliente = c;
    }

    public void establecerNombreBanco(String b) {
        nombreBanco = b;
    }

    public void establecerValorCheque(double ch) {
        valorCheque = ch;
    }

    public void calcularComision() {
        comision = valorCheque * 0.00003;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nENTIDAD BANCARIA\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del Cheque: %.2f\n"
                + "Comision al banco: %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComision());
        return cadena;
    }
}
