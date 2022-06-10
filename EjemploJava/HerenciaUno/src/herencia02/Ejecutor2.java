
package herencia02;

import herencia01.EstudianteDistancia;
import java.util.Scanner;

public class Ejecutor2 {
    public static void main(String[] args) {
        EstudianteDistancia e1 = new EstudianteDistancia();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del estudiante: ");
        String nom = sc.nextLine();
        System.out.println("Ingrese el apellido del estudiante: ");
        String ape = sc.nextLine();
        System.out.println("Ingrese el numero de cedula del estudiante: ");
        String ced = sc.nextLine();
        System.out.println("Ingrese la edad del estudiante: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese el numero de asignatura: ");
        int numA = sc.nextInt();
        System.out.println("Ingrese el costo de la asignatura: ");
        double cost = sc.nextDouble();
        
        e1.establecerNombresEstudiante(nom);
        e1.establecerApellidoEstudiante(ape);
        e1.establecerIdentificacionEstudiante(ced);
        e1.establecerEdadEstudiante(edad);
        e1.establecerNumeroAsginaturas(numA);
        e1.establecerCostoAsignatura(cost);
        
        e1.calcularMatriculaDistancia();
        
        /*System.out.printf("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %s\n"
                + "Numero de Asignarutas: %d\nCosto Asignaturas: %.2f\nCosto: %.2f\n",
                e1.obtenerNombresEstudiante(),e1.obtenerApellidoEstudiante(),
                e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroAsignaturas(),e1.obtenerCostoAsignatura(),
                e1.obtenerMatriculaDistancia());
        */
        System.out.printf("%s\n",e1);
    }
    
}
