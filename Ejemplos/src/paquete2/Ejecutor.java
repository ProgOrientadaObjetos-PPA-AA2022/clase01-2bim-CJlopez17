/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(5000);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(0.5);
        
        Edificio [] listaEfidicio = {edf1,edf2,edf3,edf4};
        
        Vehiculo vehs1 = new Vehiculo("Auto", "lbb0011",10000);
        Vehiculo vehs2 = new Vehiculo("Camioneta", "lbc0011",20000);
        Vehiculo vehs3 = new Vehiculo("Auto", "lbd0012",6000);
        Vehiculo vehs4 = new Vehiculo("Camioneta", "lcc0011",10000);
        Vehiculo vehs5 = new Vehiculo("Camioneta", "ldc0011",25000);
        Vehiculo vehs6 = new Vehiculo("Camioneta", "ldc0011",25000);
        
        Vehiculo[] listaVehiculos = {vehs1,vehs2,vehs3,vehs4,vehs5,vehs6};
        
        /*double c = listaEfidicio[1].obtenerCosto();
                
        System.out.println(c);*/
        
        
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        Empresa miEmpresa = new Empresa();
        miEmpresa.establecerNombre("Empresa de Hojas");
        miEmpresa.establecerEdificios(listaEfidicio);
        miEmpresa.establecerCostoBienesInmuebles();
        miEmpresa.establecerEdificios(listaVehiculos);
        miEmpresa.establecerCostoVehiculos();
        
        
        System.out.printf("%s\n", miEmpresa);
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
