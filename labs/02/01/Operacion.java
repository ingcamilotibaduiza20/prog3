public class Operacion {
     // Función para sumar dos matrices
    public static double[][] sumarMatrices(double[][] matriz1, double[][] matriz2) {
        int fila = matriz1.length;
        int columna = matriz1[0].length;
        double[][] resultado = new double[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    // Función para multiplicar dos matrices
    public static double[][] multiplicarMatrices(double[][] matriz1, double[][] matriz2) {
        int filaMatriz1 = matriz1.length;
        int columnaMatriz1 = matriz1[0].length;
        int filaMatriz2 = matriz2.length;
        int columnaMatriz2 = matriz2[0].length;
        double[][] resultado = new double[filaMatriz1][columnaMatriz2];

        for (int i = 0; i < filaMatriz1; i++) {
            for (int j = 0; j < columnaMatriz2; j++) {
                for (int k = 0; k < columnaMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    // Función para multiplicar un escalar por una matriz
    public static double[][] multiplicarEscalarMatriz(double escalar, double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        double[][] resultado = new double[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                resultado[i][j] = escalar * matriz[i][j];
            }
        }

        return resultado;
    }

    // Función para calcular la traspuesta de una matriz
    public static double[][] calcularMatrizTranspuesta(double[][] matriz) {
        int fila = matriz.length;
        int columna = matriz[0].length;
        double[][] resultado = new double[columna][fila];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }
}
