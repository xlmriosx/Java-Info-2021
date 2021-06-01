//Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. 
//Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor 
//“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
//Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar
// (no se incluye en el cálculo)
//Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner.close;




public class Ejercicio7 {

    public static void main(String[] args){
        
        fizzBuzzFuncion(1, 5); ///Prueba predeterminado
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el primer num: ");
        int prim = scan.nextInt();
        System.out.print("Ingrese el limite num: ");
        int lim = scan.nextInt();

        fizzBuzzFuncion(prim, lim);
        
    }
    
    public static void fizzBuzzFuncion(int prim, int lim){
        
        List<String> buzz =   new ArrayList<String>();
        for (int i=prim; i<lim; i++){
            if( ((i % 2) == 0) && ((i%3)== 0) ){
                buzz.add("FizzBuzz");

            }else if ( (i%3)== 0){
                buzz.add("Buzz");

            }else if ( (i % 2) == 0){
                buzz.add("Fizz");
            }else{
                buzz.add(String.valueOf(i));
            }
        }
        System.out.println(buzz);

    }
}
