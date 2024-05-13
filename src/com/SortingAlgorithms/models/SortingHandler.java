package com.SortingAlgorithms.models;

public class SortingHandler {
    private int[] array;
    private Bubble bubble = new Bubble();
    private Insertion insertion = new Insertion();
    private Quick quick = new Quick();
    private Selection selection = new Selection();
    private Shell shell = new Shell();

    public void printSorts() {
        System.out.println("-------------------------------BUBBLE SORT---------------------------------");
        bubble.setUnSortArray(array);
        bubble.bubbleSort();
        System.out.println(bubble);
        // INSERTION SORT
        System.out.println("-------------------------------INSERTION SORT---------------------------------");
        insertion.setUnSortArray(array);
        insertion.insertionSort();
        System.out.println(insertion);
        System.out.println("------------------------------- QUICK SORT---------------------------------");
        quick.quickSort(array, 0, array.length - 1);
        System.out.println(quick);
        System.out.println("------------------------------- SELECTION SORT---------------------------------");
        selection.setUnSortArray(array);
        selection.selectionSort();
        System.out.println(selection);
        System.out.println("------------------------------- SHELL SORT---------------------------------");
        shell.setUnSortArray(array);
        shell.shellSort();
        System.out.println(shell);
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
