import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero para determinar el día al que se refiere ese numero: ");
        Scanner scan = new Scanner(System.in);
        int dia = scan.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            
        }
    }

}
