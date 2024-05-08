import com.SortingAlgorithms.models.Insertion;

public class Main {
    public static void main(String[] args) {
        // arrays a ordenar
        int[] array1 = {40, 21, 4, 9, 10, 35};
        // mensaje para poder mostrar el array: se concatena con la version string de cada numero
        String message2 = "Array desordenado: ";
        for (int num: array1) {
            message2 = message2 + String.valueOf(num) + " ";
        }
        System.out.println(message2);
        // se crea la instancia del algoritmo
        Insertion insertion = new Insertion();
        insertion.setUnSortArray(array1);

        array1 = insertion.insertionSort();

        String message = "Array ordenado: ";
        for (int num: array1) {
            message = message + String.valueOf(num) + " ";
        }
        System.out.println(message);
    }
}