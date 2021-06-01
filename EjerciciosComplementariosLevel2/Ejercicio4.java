//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) 
//e imprimir dichos cursos.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args){
        List<String> alumnos = new ArrayList<String>();
        List<String> cu1_alum = new ArrayList<String>();
        List<String> cu2_alum = new ArrayList<String>();
        List<String> cu3_alum = new ArrayList<String>();

        Scanner scan = new Scanner (System.in);

        for (int i=0; i<12; i++){
            alumnos.add(scan.next());
        }
        System.out.println(alumnos);

        cu1_alum = alumnos.subList(0, (alumnos.size()/3) );
        System.out.println("Alumnos del curso 1");
        System.out.println(cu1_alum);

        cu2_alum = alumnos.subList((alumnos.size()/3), 2*(alumnos.size()/3) );
        System.out.println("Alumnos del curso 2");
        System.out.println(cu2_alum);

        cu3_alum = alumnos.subList(2*(alumnos.size()/3), 3*(alumnos.size()/3) );
        System.out.println("Alumnos del curso 3");
        System.out.println(cu3_alum);


    }
}
