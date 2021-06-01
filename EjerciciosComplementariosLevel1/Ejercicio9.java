import java.util.Scanner;

public class Ejercicio9 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el string: "); 
        String str = scan.next();
        char [] pal = str.toCharArray();

        System.out.println("Letra que desea contar: ");
        String letra = scan.next();
        char [] let = letra.toCharArray();

        int resultado=0;

        for (int i=0; i < (str.length()); i++){
            if (let[0] == pal[i]){
                resultado=resultado+1;
            }
           
        }
        
        System.out.println("La letra" + letra + "aparece: " + resultado + " veces");
    }
}

