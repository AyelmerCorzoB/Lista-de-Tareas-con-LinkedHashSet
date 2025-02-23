package com.listadetareas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> listaTareas = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String menu = """
                \n
                -- Menu --
                1. Ingresar una lista de tareas
                2. Mostrar tareas
                3. Eliminar una tarea
                4. Salir
                """;

        do {
            System.out.println(menu);
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    int cantidadTareas;
                    do {
                        System.out.print("Ingrese la cantidad de tareas (máximo 10): ");
                        while (!sc.hasNextInt()) {
                            System.out.println("Entrada inválida. Por favor, ingrese un número.");
                            sc.next();
                        }
                        cantidadTareas = sc.nextInt();
                        sc.nextLine();

                        if (cantidadTareas > 10 || cantidadTareas <= 0) {
                            System.out.println("La cantidad de tareas debe ser entre 1 y 10.");
                        }
                    } while (cantidadTareas > 10 || cantidadTareas <= 0);

                    Funciones.ingresarTareas(listaTareas, cantidadTareas, sc);
                    break;

                case 2:
                    Funciones.mostrarTareas(listaTareas);
                    break;

                case 3:
                    Funciones.eliminarTarea(listaTareas, sc);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}