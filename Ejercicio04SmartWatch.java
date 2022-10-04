package Ejercicios;

public class Ejercicio04SmartWatch extends Ejercicio04SmartDevice{

    boolean alarmaSedentario;
    boolean sumergible;


    public Ejercicio04SmartWatch(){}

    public Ejercicio04SmartWatch(String marca, String modelo, String color, String os, int year, int peso, int horasBateria, boolean alarmaSedentario, boolean sumergible) {
        super(marca, modelo, color, os, year, peso, horasBateria);
        this.alarmaSedentario = alarmaSedentario;
        this.sumergible = sumergible;
    }
}
