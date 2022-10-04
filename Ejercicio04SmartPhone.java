package Ejercicios;

public class Ejercicio04SmartPhone extends Ejercicio04SmartDevice {

    boolean tecnologia5g;
    int numCamaras;

    public Ejercicio04SmartPhone(){}

    public Ejercicio04SmartPhone(String marca, String modelo, String color, String os, int year, int peso, int horasBateria, boolean tecnologia5g, int numCamaras) {
        super(marca, modelo, color, os, year, peso, horasBateria);
        this.tecnologia5g = tecnologia5g;
        this.numCamaras = numCamaras;
    }
}
