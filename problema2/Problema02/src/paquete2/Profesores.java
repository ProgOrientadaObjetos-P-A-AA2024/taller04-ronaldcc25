package paquete2;

public class Profesores {

    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private String cedula;

    public Profesores (String n, String a, double b, String c){
        nombre = n;
        apellido = a;
        sueldoBasico = b;        
        cedula = c;        
    }
    
    public Profesores (String n, String a, String c){
        nombre = n;
        apellido = a;
        sueldoBasico = 1200;        
        cedula = c;        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String a) {
        nombre = a;
    }

    public void establecerSueldoBasico(double b) {
        sueldoBasico = b;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.2);
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    public String obtenerCedula() {
        return cedula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\nDOCENTES\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s\n",obtenerNombre(),obtenerApellido(),
                obtenerSueldoBasico(),obtenerSueldoTotal(),
                obtenerCedula());
        
        return cadena;
    }
}
