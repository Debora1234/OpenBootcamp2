public class Principal {
    public static void main(String[] args) {
        float valorSinIva = 10.0F;
        float valorConIva = Fun_calcular_iva (valorSinIva);
        System.out.println(valorConIva);

    }
    static float Fun_calcular_iva(float valorSinIva){
        float result = valorSinIva * 1.21F;
        return(result);
    }


}
