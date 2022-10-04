package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 4 de octubre de 2022
 */

public class Ejercicio04Main {

    public static void main(String[] args) {

        Ejercicio04SmartPhone smartPhone = new Ejercicio04SmartPhone("Xiaomi", "Redmi Note 11 Pro", "Verde", "Android", 2022, 202, 48, false,  3);
        System.out.println("--------** Especificaciones del SmartPhone **--------");
        System.out.println("Marca y modelo: " + smartPhone.marca + " " + smartPhone.modelo + ", de color " + smartPhone.color + ", tiene " + smartPhone.numCamaras + " cámaras " + "y un peso de " + smartPhone.peso + "gr" + ". \nUsa como Sistema Operativo: " + smartPhone.os + ". La batería tiene una duración de " + smartPhone.horasBateria + " horas" + ". \n¿Se puede conectar a las redes 5G? = " + smartPhone.tecnologia5g + ". Fue fabricado en el año " + smartPhone.year);
        System.out.println("  ");

        Ejercicio04SmartWatch smartWatch = new Ejercicio04SmartWatch("Garmin", "Vivoactive 4", "negro", "propio de Garmin", 2019, 50, 192,true,true);
        System.out.println("--------** Especificaciones del SmartWatch **--------");
        System.out.println("Marca y modelo: " + smartWatch.marca + " " + smartWatch.modelo + ", de color " + smartWatch.color + ", tiene un peso de " + smartWatch.peso + "gr" + ". \nUsa como Sistema Operativo: " + smartWatch.os + ". La batería tiene una duración de " + smartWatch.horasBateria + " horas" + ". Fue fabricado en el año " + smartWatch.year + ". \n¿Es sumergible? = " + smartWatch.sumergible + "  --  ¿Tiene la función de alarma si pasas muchas horas sentado? = " + smartWatch.alarmaSedentario);

    }

}
