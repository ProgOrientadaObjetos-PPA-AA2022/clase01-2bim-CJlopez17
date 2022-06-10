
package herencia02;

import herencia01.EstudianteDistancia;
import herencia01.EstudiantePresencial;

public class Ejecutor {
    public static void main(String[] args) {
        
        EstudiantePresencial e1 = new EstudiantePresencial();
        e1.establecerNombresEstudiante("Chamelito Chame");
        e1.establecerApellidoEstudiante("Pardo Rosario");
        e1.establecerIdentificacionEstudiante("1150177456");
        e1.establecerEdadEstudiante(19);
        e1.establecerNumeroCreditos(60);
        e1.establecerCostoCredito(50);
        
        e1.calcularMatriculaPresencial();
        
        System.out.printf("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %s\n"
                + "Numero de Creditos: %d\nCosto Credito: %.2f\nCosto: %.2f\n",e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),e1.obtenerCostoCredito(),e1.obtenerMatriculaPresencial());
    }
}
