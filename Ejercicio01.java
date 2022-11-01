package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 26 de septiembre de 2022
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
        System.out.println("byte: \033[96m" + numByte + "\033[39;49m, short: \033[96m" + numShort + "\033[39;49m, int: \033[96m" + numInt + "\033[39;49m, long: \033[96m" + numLong + "\033[39;49m, float: \033[96m" + numFloat + "\033[39;49m, double: \033[96m" + numDoble + "\033[39;49m y Long: \033[96m" + numExtraLong +"\033[39;49m.");
        System.out.println("Otras variables:");
        System.out.println("Podemos poner solo una letra: \033[96m" + letra + "\033[39;49m, una palabra: \033[96m" + nombre + "\033[39;49m, o saber si algo es cierto o falso: \033[96m" + activo + "\033[39;49m.");
        System.out.println("Un posible uso sería para extraer los datos de un cliente ->");
        System.out.println("\033[97mNúmero de socio: \033[35m" + numExtraLong + "\033[97m. Cliente: \033[35m" + nombre + " " + apellidos + "\033[97m, edad: \033[35m" + numInt + "\033[97m. Teléfono: \033[35m" + numLong + "\033[97m. El cliente está activo: \033[35m" + activo + "\033[97m.");


    }
}
