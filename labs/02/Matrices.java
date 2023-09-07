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

