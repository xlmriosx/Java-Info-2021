import java.util.Scanner;

public class Servicio1 {
    
    
    
    private static String bienvenida ="Bienvenido!!! \n Seleccione 1 para Imprir un texto \n Seleccione 2 para mostrar tres numeros ingreados por consola \n Seleccione 3 para decir cómo es una calificacion \n Seleccione 4 para decir que día es ingresando un numero";
    public static void main(String[] args) {
        System.out.println(bienvenida);

        
        Scanner scan = new Scanner(System.in);
        int opcion = scan.nextInt();
        
        switch (opcion) {
            case 1: 
                imprimirTextoXVeces();
                break;
            case 2: 
                mostrarNum();
                break;
            case 3:
                notCalif();
                break;
            case 4: 
                diaPorNum();
                break;
        }
    }
    
    public static void imprimirTextoXVeces() {
        System.out.println("Ingrese el texto");
        Scanner scan2 = new Scanner(System.in);
        String texto = scan2.next();
        System.out.println("Ingrese la cantidad");
        Scanner scan = new Scanner(System.in);
        int contador = scan.nextInt();
        for (int i = 0; i< contador; i++){
            System.out.println(texto);
        }
    }

    public static void mostrarNum() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int a = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int b = scan.nextInt();
        System.out.println("Ingrese el tercer numero");
        int c = scan.nextInt();

        System.out.println("El primer nro ingresado es: " + a);
        System.out.println("El segundo nro ingresado es: " + b);
        System.out.println("El tercer nro ingresado es: " + c);
        scan.close();
    }

    public static void notCalif() {
        System.out.println("Ingrese la nota en formato 1/100");
        Scanner scan = new Scanner(System.in);
        int nota = scan.nextInt();
        scan.close();
        if (nota > 92) {
            System.out.println("Excelente");
        } else if ( nota > 84) {
            System.out.println("Sobresaliente");
        } else if ( nota > 74) {
            System.out.println("Distinguido");
        } else if ( nota > 59) {
            System.out.println("Bueno");
        } else {
            System.out.println("Desaprobado");
        }
    }

    public static void diaPorNum() {
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