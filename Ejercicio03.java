package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 1 de octubre de 2022
 */

public class Ejercicio03 {

    public static void main(String[] args) {

        String frase = "Los nombre son: ";
        String[] names = {"Marta", "Juan", "Dulce", "Ivan"};
        for (String name : names) {
            frase += name + " ";
            System.out.println(frase);
        }
    }
}
