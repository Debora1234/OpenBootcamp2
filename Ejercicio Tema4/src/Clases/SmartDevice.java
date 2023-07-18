package Clases;

public class SmartDevice {

    // 1 atributos:
    public String fabricante;
    public String modelo;
    public int año;

    // 2 constructor vacio:
    public SmartDevice(){

    }
    // 2 constructor con todos los elementos:
    public SmartDevice(String fabricante, String modelo, int año) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año = año;
    }

    //para que nos imprima, escribimos la función
    @Override
    public String toString() {
        return "fabricante = " + fabricante +
                ", modelo = " + modelo +
                ", año = " + año ;
    }
}
