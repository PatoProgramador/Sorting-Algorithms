import com.SortingAlgorithms.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {40, 21, 4, 9, 10, 35};
        String message2 = "Array desordenado: ";
        for (int num: array1) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);

//        Shell shell = new Shell();
//        shell.setUnSortArray(array1);
//        shell.shellSort();
//        System.out.println(shell);
//        Selection selection = new Selection();
//        selection.setUnSortArray(array1);
//        selection.selectionSort();
//        System.out.println(selection);
//        // arrays a ordenar
//        Bubble bubble = new Bubble();
//        System.out.println("Array original: ");
//        for (int num: array1) {
//            System.out.println(num);
//        }
//        bubble.setUnSortArray(array1);
//        array1 = bubble.bubbleSort();
//        System.out.println("Array organizado: ");
//        for (int num: array1) {
//            System.out.println(num);
//        }
////        // mensaje para poder mostrar el array: se concatena con la version string de cada numero
//
//        System.out.println(message2);
//        // se crea la instancia del algoritmo
//        Insertion insertion = new Insertion();
//        insertion.setUnSortArray(array1);
//
//        array1 = insertion.insertionSort();
//
//        String message = "Array ordenado: ";
//        for (int num: array1) {
//            message = message + String.valueOf(num) + " ";
//        }
//        System.out.println(message);
        Persona person1 = new Persona(1, "Pato", 24, 100);

        // Crear una lista de personas y un generador de números aleatorios
        // [{id, nombre,edad, salario} , {id, nombre,edad, salario}, {id, nombre,edad, salario}]
        List<Persona> personas = new ArrayList<>();
        Random random = new Random();

        // Generar un número aleatorio entre 5 y 10 para determinar el tamaño de la lista
        int numElementos = random.nextInt(6) + 5;
        // Llenar la lista con personas aleatorias
        for (int i = 0; i < numElementos; i++) {
            personas.add(new Persona(i + 1, "Persona " + (i + 1), random.nextInt(50) + 18, random.nextDouble() * 10000));
        }
        // Ordenar la lista por edad usando Bubble Sort
        // [1 , 2 ,5 , 6 ,4 ]
        ListaPersonas personaList = new ListaPersonas();
        personaList.setPersonas(personas);
//        personaList.bubleSortEdad();
        personaList.bubleSortSalario();

        for (Persona per: personaList.getPersonas()) {
            System.out.println(per);
        }
    }
}