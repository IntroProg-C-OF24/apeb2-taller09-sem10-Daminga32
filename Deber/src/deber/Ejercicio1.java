package deber;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
          Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el número de marcas: ");
        int numElementos = teclado.nextInt();
        String[] marcas = new String[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese la marca #" + (i + 1) + ": ");
            String marca = teclado.nextLine();
            try {      
                if (marca.startsWith("A") || marca.startsWith("C") || marca.startsWith("T")) {
                    System.out.println("Marca no válida. Intente de nuevo.");
                    i--;  
                } else {
                    marcas[i] = marca;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;  
            }
        }
        System.out.println("\nMarcas ingresadas:");
        for (String marca : marcas) {
            System.out.println(marca);
        }
    }
    
}
