package org.example;

import BD.AccionesBD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccionesBD accionesBD = new AccionesBD();
        int opcion;

        while(true) {
            System.out.println("Bienvenido a la mayor biblioteca digital, elija entre las siguientes opciones para interactuar.");
            System.out.println("1. Listar todos los libros.");
            System.out.println("2. Listar libros por autor.");
            System.out.println("3. Actualizar libro por id.");
            System.out.println("4. Eliminar libro por id.");
            System.out.println("5. Salir del programa.");

            opcion = sc.nextInt();

            if(opcion == 1){
                System.out.println("La información será mostrada en el siguiente orden: titulo, autor, precio\n");
                accionesBD.leerTodosLosDatos();
                System.out.println("\n");

            } else if(opcion == 2){
                System.out.println("La información será mostrada en el siguiente orden: titulo, autor, precio\n");
                accionesBD.leerLibrosPorAutor();
                System.out.println("\n");
            } else if(opcion == 3){
                accionesBD.actualizarLibroPorId();
            } else if(opcion == 4){
                accionesBD.eliminarLibroPorId();
            } else if(opcion == 5) {
                System.out.println("\n");
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción incorrecta. Inténtalo de nuevo.");
            }
        }
    }
}