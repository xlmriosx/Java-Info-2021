import java.util.Scanner;



public class Ejercicio2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: "); 
        int no1 = scan.nextInt();
        System.out.print("Ingrese un numero: "); 
        int no2 = scan.nextInt(); 
        suma(no1, no2);
        resta(no1, no2);
        multiplicacion(no1, no2);
        division(no1, no2);
        modulo(no1, no2);
    }

    public static void suma(int no1, int no2){
        int suma = no1+no2;
        System.out.println("La suma de: " + no1 + "+" + no2 + "=" + suma);   
    }

    public static void resta(int no1, int no2){
        int resta = no1-no2;
        System.out.println("La resta de: " + no1 + "-" + no2 + "=" + resta);   
    }
    public static void multiplicacion(int no1, int no2){
        int mult = no1*no2;
        System.out.println("La multiplicacion de: " + no1 + "x" + no2 + "=" + mult);   
    }
    public static void division(int no1, int no2){
        int div = no1/no2;
        System.out.println("La division de: " + no1 + "/" + no2 + "=" + div);   
    }
    public static void modulo(int no1, int no2){
        int mod = no1%no2;
        System.out.println("El modulo de: " + no1 + "%" + no2 + "=" + mod);   
    }
}
