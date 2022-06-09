
package paquete1;

public class Vehiculo {

    private String tipo; 
    private String matricula; 
    private double costo; 

    public Vehiculo(String tipo, String matricula, double costo) {
        this.tipo = tipo;
        this.matricula = matricula;
        this.costo = costo;
    }
    
    public void establecerTipo(String m){
        tipo = m;
    }
    public void establecerMatricula(String m){
        matricula = m;
    }
    public void establecerCosto(double m){
        costo = m;
    }
    public String obtenerTipo(){
        return tipo;
    }
    public String obtenerMatricula(){
        return matricula;
    }
    public double obtenerCosto(){
        return costo;
    }
    @Override
    public String toString(){
        String cadena = String.format("Tipo del vehiculo: %s\n Matricula: %s\n"
                + "Costo del Vehiculo: %.2f\n",tipo, matricula, costo);
        return cadena; 
    }
}
