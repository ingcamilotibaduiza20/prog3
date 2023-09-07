
public class Imprimir {
        
    // Función para imprimir una matriz
    public static void imprimirMatriz(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;

        System.out.println("Matriz resultante:");

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
