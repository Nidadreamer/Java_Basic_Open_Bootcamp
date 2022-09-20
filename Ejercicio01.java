package bootcamp.ejercicios;

/**
 * @author Noa Perona
 * Fecha: 20 de septiembre de 2022
 */

public class Ejercicio01 {

    public static void main(String[] args) {

        byte numByte = 1;
        short numShort = 10;
        int numInt = 58;
        long numLong = 636444777l;
        float numFloat = 6.6f;
        double numDoble = 7.37d;
        Long numExtraLong = 72625209L;
        char letra = 'A';
        String nombre = "Juana";
        String apellidos = "De Luque";
        boolean activo = true;
        boolean baja = false;

        System.out.println("Mis números son:");
        System.out.println("byte: " + numByte + ", short: " + numShort + ", int: " + numInt + ", long: " + numLong + ", float: " + numFloat + ", double: " + numDoble + " y Long: " + numExtraLong +".");
        System.out.println("Otras variables:");
        System.out.println("Podemos poner solo una letra: " + letra + ", una palabra: " + nombre + ", o saber si algo es cierto o falso: " + activo + ".");
        System.out.println("Un posible uso sería para extraer los datos de un cliente ->");
        System.out.println("Número de socio: " + numExtraLong + ". Cliente: " + nombre + " " + apellidos + ", edad: " + numInt + ". Teléfono: " + numLong + ". El cliente está activo:" + activo + ".");


    }
}
