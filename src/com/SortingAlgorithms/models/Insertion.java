package com.SortingAlgorithms.models;

public class Insertion extends SortAlgoritms {

    public int[] insertionSort() {
        int[] array = this.getUnSortArray();
        int i, j, aux;
        // Dar valores a los elementos del array
        for (i = 1; i < array.length; i++) // i contiene el número de elementos de la sublista.
        {
            // Se intenta añadir el elemento i.
            aux = array[i];
            for (j = i - 1; j >= 0; j--) // Se recorre la sublista de atrás a adelante para buscar
            { // la nueva posición del elemento i.
                if (aux > array[j]) // Si se encuentra la posición:
                {
                    System.out.println("El número " + aux + " se quedó en su posicion");
                    array[j + 1] = aux; // Ponerlo
                    break; // y colocar el siguiente número.
                } else // si no, sigue buscándola.
                    System.out.println("Se intercambio el número " + array[j] + " por el número " + array[j+1]);
                    array[j + 1] = array[j];
            }
            if (j == -1) // si se ha mirado todas las posiciones y no se ha encontrado la correcta
                array[0] = aux; // es que la posición es al principio del todo.
        }
        return array;
    }
}
