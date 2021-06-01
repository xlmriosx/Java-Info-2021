import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero para determinar el factorial: "); 
        int num = scan.nextInt();
        int factorial = 1;
        for (int i=1; i<=num; i++){
            factorial=factorial*i;
        }
        System.out.println(factorial); 
    }
}
