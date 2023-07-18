package Herencia;

import Clases.SmartDevice;

public class SmartPhone extends SmartDevice {


    //1 atributos
    boolean gps;
    String tipo_memoria_externa;
    int cant_camaras;

    //2 constructor vacion

    public SmartPhone() {
            super();
    }

    //2 constructor completo
    public SmartPhone(String fabricante, String modelo, int año, boolean gps, String tipo_memoria_externa, int cant_camaras) {
        super(fabricante, modelo, año);
        this.gps = gps;
        this.tipo_memoria_externa = tipo_memoria_externa;
        this.cant_camaras = cant_camaras;
    }

    //para que nos imprima, escribimos la función
    @Override
    public String toString() {
        return "fabricante = " + fabricante +
                ", modelo = " + modelo +
                ", año = " + año +
                "gps = " + gps +
                ", tipo_memoria_externa = " + tipo_memoria_externa +
                ", cant_camaras = " + cant_camaras ;
    }





}
