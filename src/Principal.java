import java.util.Scanner;

public class Principal
{
    public static void main(String[] args) {
        String[] VectorFinal = {"Pedro","Juan","Tomi","Marce"};
        String concatenado = "";

        for (String nmb: VectorFinal ) {
            concatenado = concatenado + nmb + ", " ;
        }
        System.out.println("La variable final quedo: " + concatenado);


    }
}
