import java.util.Scanner;


//Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking

public class Ejercicio1 {
    
    public static void main(String[] args){
        String[] ciudades = new String[5];
        Scanner scan = new Scanner(System.in);
        boolean opcion = true;
        int i=0;

        System.out.println("Ingrese su top 5 de ciudades favoritas");

        while( opcion && i != 5 ){
            System.out.println("Ingrese una ciudad: ");
            ciudades[i] = scan.next();
            i=i+1;
            System.out.println("Desea contiunar? true = si -- false = no");
            opcion = scan.nextBoolean();
        }

        int j = ciudades.length;

        for(i=1; i-1< j; i++){
                System.out.println("#"+ i + " - " + ciudades[i]);
        }
       
    }
}
