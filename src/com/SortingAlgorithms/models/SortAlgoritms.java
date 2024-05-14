package com.SortingAlgorithms.models;

public class SortAlgoritms {
    private int[] unSortArray;

    public int[] getUnSortArray() {
        return unSortArray;
    }

    public void setUnSortArray(int[] unSortArray) {
        this.unSortArray = unSortArray;
    }

    @Override
    public String toString() {
        String arrayString = "Array ordenado: ";
        int[] arr = this.getUnSortArray();
        for (int num: arr) {
            String temp = String.valueOf(num);
            arrayString = arrayString + temp + " ";
        }
        return arrayString;
    }
}
