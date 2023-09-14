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

