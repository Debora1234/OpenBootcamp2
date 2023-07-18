package Herencia;

import Clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    //1 atributos
    boolean monitor_ritmo_cardiaco;
    boolean notificaciones;
    boolean control_musica;


    //2 constructor vacion

    public SmartWatch() {
        super();
    }

    //2 constructor completo
    public SmartWatch(String fabricante, String modelo, int año, boolean monitor_ritmo_cardiaco, boolean notificaciones, boolean control_musica) {
        super(fabricante, modelo, año);
        this.monitor_ritmo_cardiaco = monitor_ritmo_cardiaco;
        this.notificaciones = notificaciones;
        this.control_musica = control_musica;
    }

    //para que nos imprima, escribimos la función
    @Override
    public String toString() {
        return "fabricante = " + fabricante +
                ", modelo = " + modelo +
                ", año = " + año +
                "monitor_ritmo_cardiaco = " + monitor_ritmo_cardiaco +
                ", notificaciones = " + notificaciones +
                ", control_musica = " + control_musica ;
    }
}