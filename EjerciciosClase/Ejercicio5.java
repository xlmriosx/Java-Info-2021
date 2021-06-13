import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        crearEmpleado();
        System.out.print("Digite la letra del appelido con la que desea empezar: ");
        Scanner s = new Scanner(System.in);
        String letra = s.next();

        System.out.println("Empleados que apellidos comienza con " + letra);
        Persona.empiezaCon(letra);
        
        Persona.mayorEdad();
        
        Persona.menorEdad();
        
        Persona.menorSueldo();
        
        Persona.mayorSueldo();
        
        Persona.ordenEmpleado();
    }
    
    
    static void crearEmpleado() {
        
        try (Stream<String> stream = Files.lines(Paths.get("EmpleadosEj5.txt"))){
            stream.forEach((e) -> {
                String[] lista = e.split(",");
                String nombre = lista[0];
                String apellido = lista[1];
                String fechaNacimiento = lista[2];
                String sueldo = lista[3];
                Persona persona = new Persona(nombre, apellido, fechaNacimiento, sueldo);
                // System.out.println(persona);
            });
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    static class Persona {
        static List<Persona> listEmpleado = new ArrayList<>();
        String nombre;
        String apellido;
        LocalDate fechaNacimiento;
        BigDecimal sueldo;

        public Persona(String nombre, String apellido, String fechaNacimiento, String sueldo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fechaNacimiento = toFecha(fechaNacimiento);
            this.sueldo = toSueldo(sueldo);
            listar();
        }

        static LocalDate toFecha(String fechaNacimiento) {
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fecha = LocalDate.parse(fechaNacimiento, formato);
            return fecha;
        }

        static BigDecimal toSueldo(String sueldo) {
            BigDecimal monto = new BigDecimal(sueldo);
            return monto;
        }

        
        private void listar() {
            listEmpleado.add(this);
        }

        
        public static void empiezaCon(String letra) {
            listEmpleado.forEach((e) -> {
                if (e.apellido.startsWith(letra)) {
                    System.out.println(e);
                }
            });
        }

        private int edad() {
            int edad = LocalDate.now().getYear() - this.fechaNacimiento.getYear();
            return edad;
        }

        
        public static void mayorEdad() {
            System.out.print("El mas viejo es: ");

            if (listEmpleado.size() != 0) {
                int comp = 0;
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (comp < listEmpleado.get(i).edad()) {
                        comp = listEmpleado.get(i).edad();
                    }
                }
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (listEmpleado.get(i).edad() == comp) {
                        System.out.println(listEmpleado.get(i));
                    }
                }
            }
            else {
                System.out.println("Archivo vacío.!!");
            }
            
        }

        
        public static void menorEdad() {
            System.out.print("El mas joven es: ");
            if (listEmpleado.size() != 0) {
                int comp = listEmpleado.get(0).edad();
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (comp > listEmpleado.get(i).edad()) {
                        comp = listEmpleado.get(i).edad();
                    }
                }
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (listEmpleado.get(i).edad() == comp) {
                        System.out.println(listEmpleado.get(i));
                    }
                }
            }
            else {
                System.out.println("Archivo vacío.!!");
            }
            
        }

        
        public static void mayorSueldo() {
            System.out.print("El que mas gana es: ");
            if (listEmpleado.size() != 0) {
                BigDecimal comp = listEmpleado.get(0).sueldo;
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (comp.compareTo(listEmpleado.get(i).sueldo) == -1 ) {
                        comp = listEmpleado.get(i).sueldo;
                    }
                }
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (listEmpleado.get(i).sueldo == comp) {
                        System.out.println(listEmpleado.get(i));
                    }
                }
            }
            else {
                System.out.println("Archivo vacío.!!");
            }
            
        }
        
        
        public static void menorSueldo() {
            System.out.print("El que menos gana es: ");
            if (listEmpleado.size() != 0) {
                BigDecimal comp = listEmpleado.get(0).sueldo;
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (comp.compareTo(listEmpleado.get(i).sueldo) == 1 ) {
                        comp = listEmpleado.get(i).sueldo;
                    }
                }
                for (int i = 0; i < listEmpleado.size(); i++) {
                    if (listEmpleado.get(i).sueldo == comp) {
                        System.out.println(listEmpleado.get(i));
                    }
                }
            }
            else {
                System.out.println("Archivo vacío.!!");
            }
            
        }

        
        public static void ordenEmpleado() {
            System.out.println("Empleados ordenados alfab por apellido: ");
            listEmpleado.sort((o1, o2) -> o1.nombre.compareTo(o2.nombre));
            System.out.println(listEmpleado);
        }

        @Override
        public String toString() {
            return this.nombre + " " + this.apellido + ": $" + this.sueldo;
        }
    }
}