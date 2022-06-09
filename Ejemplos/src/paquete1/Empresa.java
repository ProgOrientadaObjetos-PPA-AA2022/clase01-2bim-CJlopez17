/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo [] vehiculos;
    private double costoBienesInmuebles;
    private double costoVehiculos; 
    private double costoTotalBienes;
    
    
    
    public void establecerNombre(String m){
        nombre = m;
    }
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    public void establecerVehiculo(Vehiculo[] m){
        vehiculos = m;
    }
    public void establecerCostoBienesInmuebles(){
        double suma = 0;
        for(int i = 0; i < edificios.length; i++){
            suma = suma + edificios[i].obtenerCosto();
        }
        costoBienesInmuebles = suma;
    }
    public void establecerCostoVehiculos(){
        double suma = 0;
        for(int i = 0; i < vehiculos.length; i++){
            suma = suma + vehiculos[i].obtenerCosto();
        }
        costoVehiculos = suma;
    }
    public void establecerCostoTotalBienes(){
        costoTotalBienes = costoBienesInmuebles + costoVehiculos;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public double obtenerestablecerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    public Vehiculo[] obtenerVehiculo(){
        return vehiculos;
    }
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    public double obtenerCostoTotalBienes(){
        return costoTotalBienes;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre de la empresa: %s\n",nombre);
        cadena = String.format("%s Lista de eficios: \n", cadena);
        for(int i = 0; i < edificios.length;i++){
            cadena = String.format("%s%d. %s(%.2f)\n",cadena,i++,edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        cadena = String.format("%s Total de inmuebles: %.2f\n", cadena, costoBienesInmuebles);
        
        cadena = String.format("%s Lista vehiculos: ", cadena);
        for(int i = 0; i < vehiculos.length; i++){
            cadena = String.format("%s%d. %s%s(%.2f)\n",cadena, i++, vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula().toUpperCase(),vehiculos[i].obtenerCosto());
        }
        cadena = String.format("Total de inmueble: %.2f\n", cadena,costoVehiculos);
        
        cadena = String.format("%s Total bienes: ",cadena, costoTotalBienes);
        return cadena; 
    }
}
