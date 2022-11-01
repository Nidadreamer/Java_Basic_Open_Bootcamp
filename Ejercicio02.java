package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 27 de septiembre de 2022
 */

public class Ejercicio02 {

    public static void main(String[] args) {

        double price = 135;
        double iva = 21;
        double calIva = (price * iva) / 100;
        double precioFinal = price + calIva;

        System.out.println("El objeto tiene un valor de: \033[96m" + price + "€" + "\n\033[39;49mpor lo tanto, el precio final con un 21% de IVA es de: \033[96m" + precioFinal + "€");

    }
}
