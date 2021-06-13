import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args){
        int i=1;
        try{
            File f = new File("alumnos.txt");
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                System.out.print("Alumno #"+i+":");
                String line = s.nextLine();
                System.out.println(line);
                i=i+1;
            }
        }catch(FileNotFoundException e){
            System.out.println("El archivo no existe…");
        }
    }
}

