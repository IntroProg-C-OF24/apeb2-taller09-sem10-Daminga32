package deber;
public class Ejercicio3 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = generarPromediosCualitativos(promedios);
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i] + " promedio: " + promedios[i] + " promedio cualitativo: " + promediosCualitativos[i]);
        }
    }
    private static String[] generarPromediosCualitativos(double[] promedios) {
        String[] promediosCualitativos = new String[promedios.length];
        for (int i = 0; i < promedios.length; i++) {
            if (promedios[i] >= 0 && promedios[i] <= 5.9) {
                promediosCualitativos[i] = "Promedio Regular";
            } else if (promedios[i] >= 6 && promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Promedio Bueno";
            } else if (promedios[i] >= 9 && promedios[i] <= 10) {
                promediosCualitativos[i] = "Promedio Sobresaliente";
            } else {
                promediosCualitativos[i] = "Error: Promedio fuera de rango";
            }
        }
    
 

