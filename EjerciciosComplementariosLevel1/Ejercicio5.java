import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el multiplicador: "); 
        int multiplicador = scan.nextInt();
        System.out.print("Ingrese el multiplicando: "); 
        int multiplicando = scan.nextInt();
        int resultado=0;
        for (int i=1; i<=multiplicador; i++){

            resultado = resultado + multiplicando;
        }
        System.out.println("El resultado de: " + multiplicador + "x" + multiplicando + "=" + resultado); 
    }
}
