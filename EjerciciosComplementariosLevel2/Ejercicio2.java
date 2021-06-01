//Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y 
//otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la 
//misma (antes y después de agregar a en la primera y última posición).
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    
    public static void main(String[] args){

        List<Integer> numeros = new ArrayList<Integer>(); 
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero por vez");
        for(int i=0; i<5; i++){

            numeros.add(scan.nextInt());
            
        }
        iterarytamanio(numeros);

        System.out.println("Ingrese el numero que se posiciona en la primera pos");
        numeros.set(0, scan.nextInt());
        System.out.println("Ingrese el numero que se posiciona en la ult pos");
        numeros.set(4, scan.nextInt());

        iterarytamanio(numeros);
        
    }

    public static void iterarytamanio(List<Integer> numeros){
        for(int i=1; i-1<numeros.size(); i++){
            System.out.print("#"+i);
            System.out.println(" " + numeros.get(i-1));
        }
        System.out.println("El tamanio es de: "+ numeros.size());
    }
}
