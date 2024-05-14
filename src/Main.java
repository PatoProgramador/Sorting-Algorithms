import com.SortingAlgorithms.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortingHandler sortingHandler = new SortingHandler();
        System.out.println("--------------------------------------------------------------EJERCICIO 1--------------------------------------------------------");
        int[] array1 = {40, 21, 4, 9, 10, 35};
        String message2 = "Array desordenado: ";
        for (int num: array1) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);
        // metodos de ordenamiento
        sortingHandler.setArray(array1);
        sortingHandler.printSorts();
        System.out.println("--------------------------------------------------------------EJERCICIO 2---------------------------------------------------------");
        int[] array2 = {47, 1, 5, 3, 7, 13, 25, 60, 0};
        message2 = "Array desordenado: ";
        for (int num: array2) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);
        // metodos de ordenamiento
        sortingHandler.setArray(array2);
        sortingHandler.printSorts();
        System.out.println("--------------------------------------------------------------EJERCICIO 3---------------------------------------------------------");
        int[] array3 = {5, 2, 7, 3, 1, 8, 2, 6, 9};
        message2 = "Array desordenado: ";
        for (int num: array3) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);
        // metodos de ordenamiento
        sortingHandler.setArray(array3);
        sortingHandler.printSorts();
        System.out.println("--------------------------------------------------------------EJERCICIO 4---------------------------------------------------------");
        int[] array4 = {3, 5, 33, 1, 8, 1, 24, 23, 8};
        message2 = "Array desordenado: ";
        for (int num: array4) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);
        // metodos de ordenamiento
        sortingHandler.setArray(array4);
        sortingHandler.printSorts();
    }
}