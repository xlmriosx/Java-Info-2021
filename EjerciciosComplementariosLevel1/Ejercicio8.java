import java.util.Scanner;


public class Ejercicio8 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su nombre: "); 
        String nom = scan.next();
        System.out.println("Ingrese su apellido: "); 
        String ap = scan.next();
        System.out.println("Ingrese su edad: "); 
        int edad = scan.nextInt();
        System.out.println("Ingrese su direccion sin espacios: "); 
        String direccion = scan.next();
        System.out.println("Ingrese su ciudad: "); 
        String ciudad = scan.next();

        System.out.println(ciudad + "-" + direccion + "-" + edad + "-" +  nom + "-" + ap); 
    }
}
