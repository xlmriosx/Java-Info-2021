import java.util.Scanner;

public class Ejercicio1_2 {
    
  public class MathMachine {
         
    public static int sum(int num1, int num2){
      return num1 + num2;
    }
    
    public static int factorial(int numero){
      int res = numero;
      if (numero != 1){
        res = res * factorial(numero-1);
      }
      
      return res;
      
    }
  }

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite un numero para sacar su factorial");
    int a = scan.nextInt();
    System.out.println("Factorial: "+MathMachine.factorial(a));
    System.out.println("Digite un numero: ");
    int a1 = scan.nextInt();
    System.out.println("Digite un numero: ");
    int a2 = scan.nextInt();
    System.out.println("Su suma es: "+MathMachine.sum(a1,a2));

  }
       
}
