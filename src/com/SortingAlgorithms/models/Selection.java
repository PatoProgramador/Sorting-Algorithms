package com.SortingAlgorithms.models;

public class Selection extends SortAlgoritms{
    public void selectionSort() {
        int[] array = this.getUnSortArray();
        int arraySize = array.length;
// int array[N];
        int i, j, menor, aux;
// Dar valores a los elementos del array
        for (i = 0; i < arraySize - 1; i++) {
// 40
            for (j = i + 1, menor = i; j < arraySize; j++) {
// 21 40
                if (array[j] < array[menor]) // Si el elemento j es menor que el menor:
                    menor = j; // el menor pasa a ser el elemento j.
            }
            aux = array[i]; // Se intercambian los elementos
            System.out.println("Paso " + (i + 1) + ":" + " Se intercambia el número: " + aux + " con el número: " + array[menor]);
            array[i] = array[menor]; // de las posiciones i y menor
            array[menor] = aux; // usando una variable auxiliar.
        }
        this.setUnSortArray(array);
    }
}
