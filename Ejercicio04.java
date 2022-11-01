package Ejercicios;

/**
 * @author Noa Perona
 * Fecha: 4 de octubre de 2022
 */

public class Ejercicio04 {

    public static void main(String[] args) {

        SmartDevice.SmartPhone smartPhone = new SmartDevice.SmartPhone("Xiaomi", "Redmi Note 11 Pro", "Verde", "Android", 2022, 202, 48, false, 3);
        System.out.println("\033[35m--------** Especificaciones del SmartPhone **--------\033[39;49m");
        System.out.println("\033[36mMarca y modelo: \033[39;49m" + smartPhone.marca + " " + smartPhone.modelo + "\033[36m, de color \033[39;49m" + smartPhone.color + "\033[36m, tiene \033[39;49m" + smartPhone.numCamaras + "\033[36m cámaras y un peso de \033[39;49m" + smartPhone.peso + "gr.\033[36m \nUsa como Sistema Operativo: \033[39;49m" + smartPhone.os + "\033[36m.  La batería tiene una duración de \033[39;49m" + smartPhone.horasBateria + "\033[36m horas" + ". \n\033[36m¿Se puede conectar a las redes 5G? = \033[39;49m" + smartPhone.tecnologia5g + "\033[36m. \nFue fabricado en el año \033[39;49m" + smartPhone.year + "\033[36m.");
        System.out.println("  ");

        SmartDevice.SmartWatch smartWatch = new SmartDevice.SmartWatch("Garmin", "Vivoactive 4", "negro", "propio de Garmin", 2019, 50, 192, true, true);
        System.out.println("\033[35m--------** Especificaciones del SmartWatch **--------\033[39;49m");
        System.out.println("\033[36mMarca y modelo: \033[39;49m" + smartWatch.marca + " " + smartWatch.modelo + "\033[36m, de color \033[39;49m" + smartWatch.color + "\033[36m, tiene un peso de \033[39;49m" + smartWatch.peso + "gr\033[36m. \nUsa como Sistema Operativo: \033[39;49m" + smartWatch.os + "\033[36m. La batería tiene una duración de \033[39;49m" + smartWatch.horasBateria + "\033[36m horas. Fue fabricado en el año \033[39;49m" + smartWatch.year + "\033[36m. \n¿Es sumergible? = \033[39;49m" + smartWatch.sumergible + "\n\033[36m¿Tiene la función de alarma si pasas muchas horas sentado? = \033[39;49m" + smartWatch.alarmaSedentario);

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
