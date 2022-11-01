package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 1 de octubre de 2022
 */

public class Ejercicio03 {

    public static void main(String[] args) {

        String frase = "\033[31m Los nombres son: ";
        String[] names = {"\033[33m Marta", "\033[32m Juan", "\033[34m Dulce", "\033[35m Ivan"};
        for (String name : names) {
            frase += name + " ";
            System.out.println(frase);
        }
    }
}
