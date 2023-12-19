package deber;
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double media = calcularMedia(arreglo);
        int arribaMedia = 0;
        int debajoMedia = 0;

        for (int elemento : arreglo) {
            if (elemento > media) {
                arribaMedia++;
            } else if (elemento < media) {
                debajoMedia++;
            }
        }
        System.out.println("Media aritmética: " + media);
        System.out.println("Elementos arriba de la media: " + arribaMedia);
        System.out.println("Elementos por debajo de la media: " + debajoMedia);
    }
    }

