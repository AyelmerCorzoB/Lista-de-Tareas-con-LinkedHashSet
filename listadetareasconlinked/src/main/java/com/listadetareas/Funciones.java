package com.listadetareas;

import java.util.*;

public class Funciones {

    public static void ingresarTareas(Set<String> listaTareas, int cantidadTareas, java.util.Scanner sc) {
        for (int i = 0; i < cantidadTareas; i++) {
            System.out.print("Ingrese la tarea " + (i + 1) + ": ");
            String tarea = sc.nextLine().trim();
            if (tarea.isEmpty()) {
                System.out.println("La tarea no puede estar vacía. Inténtelo de nuevo.");
                i--;
            } else {
                listaTareas.add(tarea);
            }
        }
    }

    public static void mostrarTareas(Set<String> listaTareas) {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para mostrar.");
        } else {
            System.out.println("\nLista de tareas:");
            for (String tarea : listaTareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    public static void eliminarTarea(Set<String> listaTareas, Scanner sc) {
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para eliminar.");
        } else {
            System.out.println("\nTareas disponibles:");
            mostrarTareas(listaTareas);
            System.out.print("Ingrese la tarea que desea eliminar: ");
            String tareaEliminar = sc.nextLine().trim();
            if (listaTareas.remove(tareaEliminar)) {
                System.out.println("Tarea eliminada correctamente.");
            } else {
                System.out.println("La tarea no existe en la lista.");
            }
        }
    }
}