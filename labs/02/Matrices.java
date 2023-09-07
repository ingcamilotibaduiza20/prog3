import java.util.Scanner;
/**
 *
 * @author kmilo
 */
public class Matrices {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de filas de la primera matriz: ");
        int filaMatriz1 = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz: ");
        int columnaMatriz1 = scanner.nextInt();

        double[][] matriz1 = new double[filaMatriz1][columnaMatriz1];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filaMatriz1; i++) {
            for (int j = 0; j < columnaMatriz1; j++) {
                System.out.print("Ingrese el elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz1[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Ingrese el número de filas de la segunda matriz: ");
        int filaMatriz2 = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz: ");
        int columnaMatriz2 = scanner.nextInt();

        double[][] matriz2 = new double[filaMatriz2][columnaMatriz2];

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filaMatriz2; i++) {
            for (int j = 0; j < columnaMatriz2; j++) {
                System.out.print("Ingrese el elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matriz2[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Producto de matrices");
        System.out.println("3. Producto de un escalar con una matriz");
        System.out.println("4. Traspuesta de una matriz");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                if (filaMatriz1 == filaMatriz2 && columnaMatriz1 == columnaMatriz2) {
                    double[][] sumaMatrices = sumarMatrices(matriz1, matriz2);
                    imprimirMatriz(sumaMatrices);
                } else {
                    System.out.println("No se puede realizar la suma de matrices. Las dimensiones no coinciden.");
                }
                break;

            case 2:
                if (columnaMatriz1 == filaMatriz2) {
                    double[][] productoMatrices = multiplicarMatrices(matriz1, matriz2);
                    imprimirMatriz(productoMatrices);
                } else {
                    System.out.println("No se puede realizar el producto de matrices. Las dimensiones no coinciden.");
                }
                break;

            case 3:
                System.out.print("Ingrese el escalar: ");
                double escalar = scanner.nextDouble();
                double[][] productoEscalarMatriz = multiplicarEscalarMatriz(escalar, matriz1);
                imprimirMatriz(productoEscalarMatriz);
                break;

            case 4:
                double[][] matrizTranspuesta = calcularMatrizTranspuesta(matriz1);
                imprimirMatriz(matrizTranspuesta);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

