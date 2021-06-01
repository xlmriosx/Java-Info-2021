import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero: "); 
        int no1 = scan.nextInt();
        int i = 0;
       
        while (no1 != i){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            System.out.println();
            i=i+1;
        } 
    }

    
}
