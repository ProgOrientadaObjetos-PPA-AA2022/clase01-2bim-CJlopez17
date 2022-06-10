
package herencia01;

public class EstudianteDistancia extends Estudiante{
    /*1.  Declarar
        numeroAsignaturas: Entero 
        costoAsginatura: Real 
        matriculaDistancia: Real*/ 
    //  Métodos establecer y calcular para los datos o atributos de la clase
    int numeroAsignaturas;
    double costoAsginatura;
    double matriculaDistancia;
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroAsginaturas(int numero){
        numeroAsignaturas = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoAsignatura(double valor){
        costoAsginatura = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaDistancia(){
        matriculaDistancia = numeroAsignaturas * costoAsginatura;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroAsignaturas(){
        return numeroAsignaturas; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoAsignatura(){
        return costoAsginatura;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaDistancia(){
        return matriculaDistancia;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %s\n"
                + "Numero de Asignarutas: %d\nCosto Asignaturas: %.2f\nCosto: %.2f\n", 
                nombresEstudiante,apellidosEstudiante,identificacionEstudiante,
                edadEstudiante,numeroAsignaturas,costoAsginatura,matriculaDistancia);
        
        return cadena; 
    }
}
