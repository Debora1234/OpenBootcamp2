package Clases;

import Herencia.SmartPhone;
import Herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

    // clase identificador = new clase(), aca llamamos al constructor

    SmartDevice smartDevice = new SmartDevice();
    SmartPhone smartPhone = new SmartPhone();
    SmartWatch smartWatch = new SmartWatch();

    SmartDevice smartDevice1 = new SmartDevice("lg", "hm2", 2022);
    SmartPhone smartPhone1 = new SmartPhone("lg", "hm2", 2023, true, "sd", 3);
    SmartWatch smartWatch1 = new SmartWatch("lg", "md", 2010, false, false, false);


//imprimimos los constructores vacios, por eso nos tira nullo
        System.out.println ("CONSTRUCTORES VACIOS ");
        System.out.println (smartDevice);
        System.out.println (smartWatch);
        System.out.println (smartPhone);
        //imprimimos los constructores cargados
        System.out.println ("CONSTRUCTORES CARGADOS ");
        System.out.println (smartDevice1);
        System.out.println (smartWatch1);
        System.out.println (smartPhone1);



    }
}
