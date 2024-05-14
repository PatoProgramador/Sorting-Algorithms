package com.SortingAlgorithms.models;

public class Shell extends SortAlgoritms {
    public void shellSort() {
        int[] array = this.getUnSortArray();
        int i;
        boolean estado;

        for (int s = array.length / 2; s > 0; s = s == 2 ? 1 : s / 2) {
            //{7,2,4,5,1,3,6}(7)/2 = 3; si s(3) es mayor a 0 continua su ejecución, si s == 2 (3 no es igual a 2), si no es igual a 2 entonces s(3) se vuelve a dividir en 2, quedando 1 repitiendo el proceso.
            System.out.println("el número de saltos es: " + s);
            do {
                estado = false;
                for (i = 0; i + s < array.length; i++) { //compara e intercambia elementos
                    //{7,2,4,5,1,3,6}, el bucle continuara siempre y cuando i+s sea menor a la longitud del array
                    if (array[i + s] < array[i]) { //si el elemento de la posición i+s (5) es menor a la posición del elemento i (que se encuentra en posición 0) entonces:
                        System.out.println(array[i + s] + " < " + array[i]);
                        int aux = array[i + s]; //almacena temporalmente el valor de arrar[i+s]
                        array[i + s] = array[i]; //i+s(5) pasa a ser igual a i(7)
                        array[i] = aux; //sobre escribo la variable temporal con el valor del array i siendo ahora 5, es decur, se intercamian.
                        System.out.println("se intecambia el valor: " + array[i + s] + " con el valor: " + array[i]);
                        estado = true;
                    }
                }
            } while (estado); // se evalua la condición estado, ejecutar de nuevo si estado es true, si es false, se termina el bucle. Si no se realizan intercambios, entonces el bucle se detendra.
        }
        this.setUnSortArray(array);
    }
}
