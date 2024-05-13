package com.SortingAlgorithms.models;

import java.util.ArrayList;
import java.util.List;

public class ListaPersonas {
    private List<Persona> personas = new ArrayList<>();

    public void bubleSortEdad() {
        for (int i = 0; i < personas.size() - 1; i++) {
            for (int j = 0; j < personas.size() - i - 1; j++) {
                if (personas.get(j).getEdad() > personas.get(j + 1).getEdad()) {
                    // Intercambiar elementos si el elemento actual es mayor que el siguiente
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }
    }

    public void bubleSortSalario() {
        for (int i = 0; i < personas.size() - 1; i++) {
            for (int j = 0; j < personas.size() - i - 1; j++) {
                if (personas.get(j).getSalario() > personas.get(j + 1).getSalario()) {
                    // Intercambiar elementos si el elemento actual es mayor que el siguiente
                    Persona temp = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, temp);
                }
            }
        }
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
