package deber;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();

            // Ciclo para verificar si la letra coincide con alguna inicial de los nombres
            for (String estudiante : estudiantes) {
                if (estudiante.startsWith(inicial)) {
                    System.out.println("Coincidencia encontrada. Saliendo del bucle.");
                    bandera = false;
                    break;  // Salir del bucle for
                }
            }
        }
    }
}
