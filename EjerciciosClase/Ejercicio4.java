import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args){
        Empleado[] registrados = registrarEmp();
        guardarEmp(registrados);
    }

    public static Empleado[] registrarEmp(){
        
        Empleado e0 = new Empleado();
        Empleado e1 = new Empleado();
        
        
        e0.nombre = "Lucas";
        e0.dni = "42170566";
        e0.ap = "Rios";

        e1.nombre = "Eduardo";
        e1.dni = "41666666";
        e1.ap = "Ortiz";

        //Prueba de entrada por consola
        Scanner s = new Scanner(System.in);
        Empleado en = new Empleado();
        System.out.println("Ingrese un nombre");
        en.nombre = s.next();
        System.out.println("Ingrese un apellido");
        en.ap = s.next();
        System.out.println("Ingrese un dni");
        en.dni = s.next();


        Empleado[] tupl = {e0, e1, en};
        System.out.println("Registro completo");
        return tupl;
    }

    public static void guardarEmp(Empleado[] listEmp){
        String path = "Empleados.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

            for (int i = 0; i <= listEmp.length-1; i++){
                String line = listEmp[i].dni+","+listEmp[i].ap+","+listEmp[i].nombre;
                bw.write(line+"\n");
            }
            
        }catch(IOException ioe){
            System.out.println(ioe);
        }
        System.out.println("Guardado completo");
    }


}
//La clase esta aqui sabiendo que es una mala práctica
public class Empleado {
    
    public String nombre;
    public String ap;
    public String dni;

    public static void main(String[] args){

    }

}

