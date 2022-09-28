package bootcamp.ejercicios;

public class Ejercicio02 {

    public static void main(String[] args) {
        double price = 135;
        double iva = 21;
        double calIva = (price * iva) / 100;
        double precioFinal = price + calIva;

        System.out.println("El objeto tiene un valor de: " + price + "€" + "\npor lo tanto, el precio final con un 21% de IVA es de: " + precioFinal + "€");



    }
}
