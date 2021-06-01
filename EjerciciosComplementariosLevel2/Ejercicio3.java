//Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
//(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, 
//imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;


public class Ejercicio3 {
    
    public static void main(String[] args){
        List<Integer> naipes = new ArrayList<Integer>(); 

        for(int j=1; j<15; j++){
            naipes.add(j);
        }
        System.out.println("--------------En orden--------------");
       
        System.out.println(naipes);

        System.out.println("--------------En reversa--------------");

        System.out.print("[");
        for(int j=(naipes.size()-1); j>=0; j--){
            
            System.out.print(naipes.get(j)+"  ");

        }
        
        System.out.print("]");
        System.out.println();

        Collections.shuffle(naipes);
        Set<Integer> shuffledSet = new LinkedHashSet<Integer>();
        shuffledSet.addAll(naipes);

        System.out.println("--------------En desorden--------------");
        System.out.println(naipes);
    }
}

