import java.util.Arrays;
import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000};

        System.out.println("Tiempos de ejecución para diferentes tamaños de arreglos:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Tamaño del arreglo | Burbuja | Inserción | Selección | Mergesort");
        System.out.println("-----------------------------------------------------");

        for (int size : sizes) {
            double[] randomArray = generateRandomArray(size);

            double[] bubbleSortedArray = Arrays.copyOf(randomArray, randomArray.length);
            long startTime = System.nanoTime();
            bubbleSort(bubbleSortedArray);
            long endTime = System.nanoTime();
            long bubbleSortTime = endTime - startTime;

            double[] insertionSortedArray = Arrays.copyOf(randomArray, randomArray.length);
            startTime = System.nanoTime();
            insertionSort(insertionSortedArray);
            endTime = System.nanoTime();
            long insertionSortTime = endTime - startTime;

            double[] selectionSortedArray = Arrays.copyOf(randomArray, randomArray.length);
            startTime = System.nanoTime();
            selectionSort(selectionSortedArray);
            endTime = System.nanoTime();
            long selectionSortTime = endTime - startTime;

            double[] mergeSortedArray = Arrays.copyOf(randomArray, randomArray.length);
            startTime = System.nanoTime();
            mergeSort(mergeSortedArray);
            endTime = System.nanoTime();
            long mergeSortTime = endTime - startTime;

            System.out.printf("%-18d | %-7d | %-9d | %-9d | %-9d%n", size, bubbleSortTime, insertionSortTime, selectionSortTime, mergeSortTime);
        }
    }

    // Función para generar un arreglo de números double aleatorios
    public static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    // Implementación del método de ordenamiento burbuja
    public static void bubbleSort(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Implementación del método de ordenamiento por inserción
    public static void insertionSort(double[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            double key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

