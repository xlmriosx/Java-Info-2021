//Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga 
//de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el 
//total final a cobrar.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        List<Integer> horas_trabajadas =   new ArrayList<Integer>();
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);
        List<Integer> valor_hora = new ArrayList<Integer>();
        valor_hora.add(350);
        valor_hora.add(345);
        valor_hora.add(550);
        valor_hora.add(600);
        valor_hora.add(320);

        List<Integer> cobrar = new ArrayList<Integer>();
        for (int i=0; i<5; i++){

            cobrar.add(horas_trabajadas.get(i)*valor_hora.get(i));

        }
        System.out.println("Cobro por dia: "+cobrar);
        
        int total=0;

        for (int i=0; i<5; i++){
            total=total+cobrar.get(i);
        }
        System.out.print("Total final: $"+total);
    }
}
