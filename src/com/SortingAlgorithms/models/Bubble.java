package com.SortingAlgorithms.models;

public class Bubble extends SortAlgoritms {

    public int[] bubbleSort() {
        int[] array = this.getUnSortArray();; //llamar al array y almacenarlo en N

        for (int i = 0; i < array.length - 1; i++)//recorrer y no salirse del limite del array, asi como el número de pasadas
        {
            for (int j = 0; j < array.length - i - 1; j++) { //i es el numero de pasadas, j es la posición y N el tamaño del array
                if (array[j + 1] < array[j]) // Si el elemento j+1 es menor que el elemento j:
                {
                    System.out.println("se intercmabian " + array[j + 1] + " con " + array[j]);
                    int aux = array[j + 1]; // Se intercambian los elementos
                    array[j + 1] = array[j]; // de las posiciones j y j+1
                    array[j] = aux; // usando una variable auxiliar.

                }
            }
        }
        return array;
    }
}
