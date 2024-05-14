package com.SortingAlgorithms.models;

public class Quick extends SortAlgoritms{
    public void quickSort(int[] array, int low, int high){
        if (low < high){
            // Obtener el índice del pivote
            int pi = partition(array, low, high);
            // Imprimir el pivote en cada iteración
            System.out.println("Pivote: " + array[pi]);
            // Imprimir el array después de cada partición
            System.out.print("Array después de particionar: ");
            for (int i = low; i <= high; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            // Ordenar los elementos antes y después del pivote recursivamente
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        } else {
            this.setUnSortArray(array);
        }
    }

    // Método para realizar la partición del array
    public int partition(int[] array, int low, int high){
        // Seleccionar el pivote como el último elemento del array
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++){
            // Si el elemento actual es menor que el pivote, intercambiarlo con el elemento en i
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Colocar el pivote en su posición correcta
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Retornar el índice del pivote
        return i + 1;
    }
}
