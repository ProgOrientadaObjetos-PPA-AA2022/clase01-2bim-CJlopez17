package herencia02;

import herencia01.EstudianteDistancia;
import herencia01.EstudiantePresencial;
import java.util.Scanner;

public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 1 (Estudiante precencial), ingrese 2 "
                + "(Estudiante distancia)");
        byte eg = sc.nextByte();
        if (eg > 2 || eg < 1) {
            System.out.println("Solo hay opccion 1 y 2");
        } else {
            sc.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String ape = sc.nextLine();
            System.out.println("Ingrese el numero de cedula del estudiante: ");
            String ced = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();

            if (eg == 1) {
                System.out.println("Ingrese el numero de creaditos: ");
                int numCred = sc.nextInt();
                System.out.println("Ingrese el costo de creditos: ");
                double costCr = sc.nextDouble();

                EstudiantePresencial e1 = new EstudiantePresencial();
                e1.establecerNombresEstudiante(nom);
                e1.establecerApellidoEstudiante(ape);
                e1.establecerIdentificacionEstudiante(ced);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroCreditos(numCred);
                e1.establecerCostoCredito(costCr);

                e1.calcularMatriculaPresencial();

                System.out.printf("%s\n", e1);
            } else if (eg == 2) {
                System.out.println("Ingrese el numero de asignatura: ");
                int numA = sc.nextInt();
                System.out.println("Ingrese el costo de la asignatura: ");
                double cost = sc.nextDouble();
                EstudianteDistancia e2 = new EstudianteDistancia();
                e2.establecerNombresEstudiante(nom);
                e2.establecerApellidoEstudiante(ape);
                e2.establecerIdentificacionEstudiante(ced);
                e2.establecerEdadEstudiante(edad);
                e2.establecerNumeroAsginaturas(numA);
                e2.establecerCostoAsignatura(cost);

                e2.calcularMatriculaDistancia();

                System.out.printf("%s\n", e2);
            } else {
                System.out.println("Solo hay opcion 1 y 2");
            }
        }
    }
}
