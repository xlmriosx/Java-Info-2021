//Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo 
//(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map (o Diccionario) 
//donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio6 {
    
    public static void main(String[] args){
        Set<Integer> dnis = new HashSet<Integer>(); //version tradicional
        dnis.add(1);
        dnis.add(2);
        dnis.add(3);
        dnis.add(4);

        Set<String> nombres = new HashSet<String>(); //versión abreviada
        nombres.add("Calamardo");
        nombres.add("Esponja");
        nombres.add("Patricio");
        nombres.add("Jose");

        Set<Integer> horast = new HashSet<Integer>(); //version tradicional
        horast.add(214);
        horast.add(981);
        horast.add(213);
        horast.add(987);
        
        int valorhora=5;

        
 
        Map<Integer, Integer> cobra = new HashMap<Integer, Integer>(); //clave (Integer) y valores (String)
        
        cobra.put(1, valorhora*214);
        cobra.put(2, valorhora*981);
        cobra.put(3, valorhora*214);
        cobra.put(4, valorhora*213);

        System.out.println(cobra);

    }
}

    

