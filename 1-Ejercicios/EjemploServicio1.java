import java.util.Scanner;

public class EjemploServicio1 {
    
    private static String bienvenida ="Bienvenido";
    public static void main(String[] args) {
        System.out.println(bienvenida);

        String hola = "hola";
        imprimirTextoXVeces(hola, 3);
    }
    
    public static void imprimirTextoXVeces(String texto, int contador) {
        for (int i = 0; i< contador; i++){
            System.out.println(texto);
        }
    }

    

}
