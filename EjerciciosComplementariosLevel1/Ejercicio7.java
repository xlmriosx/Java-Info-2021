import java.util.Scanner;



public class Ejercicio7 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la palabra sin tildes: "); 
        String palabra = scan.next();
        
        int resultado=0;
        int longpal = palabra.length();

        char [] pal = palabra.toCharArray();
        System.out.println("El resultado en mayuscula es:");

        for (int i=0; i< longpal; i++){
            
            switch(pal[i]){
                case 'a':
                    System.out.print("A");
                    break;
               
                case 'b':
                    System.out.print("B");
                    break;
                case 'c':
                    System.out.print("C");
                    break;
                case 'd':
                    System.out.print("D");
                    break;
                case 'e':
                    System.out.print("E");
                    break;
                
                case 'f':
                    System.out.print("F");
                    break;
                case 'g':
                    System.out.print("G");
                    break;
                case 'h':
                    System.out.print("H");
                    break;
                case 'i':
                    System.out.print("I");
                    break;
                
                case 'j':
                    System.out.print("J");
                    break;
                case 'k':
                    System.out.print("K");
                    break;
                case 'l':
                    System.out.print("L");
                    break;
                case 'm':
                    System.out.print("M");
                    break;
                case 'n':
                    System.out.print("N");
                    break;
                case 'o':
                    System.out.print("O");
                    break;
                
                case 'p':
                    System.out.print("P");
                    break;
                case 'q':
                    System.out.print("Q");
                    break;
                case 'r':
                    System.out.print("R");
                    break;
                case 's':
                    System.out.print("S");
                    break;
                case 't':
                    System.out.print("T");
                    break;
                case 'u':
                    System.out.print("U");
                    break;
               
                case 'v':
                    System.out.print("V");
                    break;
                case 'w':
                    System.out.print("W");
                    break;
                case 'x':
                    System.out.print("X");
                    break;
                case 'y':
                    System.out.print("Y");
                    break;
                case 'z':
                    System.out.print("Z");
                    break;
                default:
                    System.out.print(pal[i]);
                    break;
            }
        }
         
    }
}
