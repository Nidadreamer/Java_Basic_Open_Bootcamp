package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 4 de octubre de 2022
 */

public class Ejercicio04 {

    public static void main(String[] args) {

        SmartDevice.SmartPhone smartPhone = new SmartDevice.SmartPhone("Xiaomi", "Redmi Note 11 Pro", "Verde", "Android", 2022, 202, 48, false, 3);
        System.out.println("--------** Especificaciones del SmartPhone **--------");
        System.out.println("Marca y modelo: " + smartPhone.marca + " " + smartPhone.modelo + ", de color " + smartPhone.color + ", tiene " + smartPhone.numCamaras + " cámaras " + "y un peso de " + smartPhone.peso + "gr" + ". \nUsa como Sistema Operativo: " + smartPhone.os + ". La batería tiene una duración de " + smartPhone.horasBateria + " horas" + ". \n¿Se puede conectar a las redes 5G? = " + smartPhone.tecnologia5g + ". Fue fabricado en el año " + smartPhone.year);
        System.out.println("  ");

        SmartDevice.SmartWatch smartWatch = new SmartDevice.SmartWatch("Garmin", "Vivoactive 4", "negro", "propio de Garmin", 2019, 50, 192, true, true);
        System.out.println("--------** Especificaciones del SmartWatch **--------");
        System.out.println("Marca y modelo: " + smartWatch.marca + " " + smartWatch.modelo + ", de color " + smartWatch.color + ", tiene un peso de " + smartWatch.peso + "gr" + ". \nUsa como Sistema Operativo: " + smartWatch.os + ". La batería tiene una duración de " + smartWatch.horasBateria + " horas" + ". Fue fabricado en el año " + smartWatch.year + ". \n¿Es sumergible? = " + smartWatch.sumergible + "  --  ¿Tiene la función de alarma si pasas muchas horas sentado? = " + smartWatch.alarmaSedentario);

    }

    public static class SmartDevice {

        // Atributos comunes
        public String marca;
        public String modelo;
        public String color;
        public String os;
        public int year;
        public int peso;
        public int horasBateria;

        // Constructor
        public SmartDevice() {
        }

        public SmartDevice(String marca, String modelo, String color, String os, int year, int peso, int horasBateria) {
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
            this.os = os;
            this.year = year;
            this.peso = peso;
            this.horasBateria = horasBateria;
        }

        public static class SmartPhone extends SmartDevice {

            boolean tecnologia5g;
            int numCamaras;

            public SmartPhone() {
            }

            public SmartPhone(String marca, String modelo, String color, String os, int year, int peso, int horasBateria, boolean tecnologia5g, int numCamaras) {
                super(marca, modelo, color, os, year, peso, horasBateria);
                this.tecnologia5g = tecnologia5g;
                this.numCamaras = numCamaras;
            }
        }

        public static class SmartWatch extends SmartDevice {

            boolean alarmaSedentario;
            boolean sumergible;


            public SmartWatch() {
            }

            public SmartWatch(String marca, String modelo, String color, String os, int year, int peso, int horasBateria, boolean alarmaSedentario, boolean sumergible) {
                super(marca, modelo, color, os, year, peso, horasBateria);
                this.alarmaSedentario = alarmaSedentario;
                this.sumergible = sumergible;
            }
        }
    }
}
