
package actividad2pooep22;

//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Definimos variables
        String nombre;
        double salariohora, salariomensual;
        int horas;  
        
        //Título y datos
        System.out.println("Ejercicio propuesto #22");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario  los datos
        System.out.print("Ingrese el nombre del empleado: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada1 = scanner.nextLine();
        nombre = entrada1;
        
        System.out.print("Ingrese el salario básico por hora: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada2 = scanner.nextLine();
        salariohora = Double.parseDouble(entrada2);
        
        System.out.print("Ingrese el número de horas trabajadas: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada3 = scanner.nextLine();
        horas = Integer.parseInt(entrada3);
        
        //Definimos el valor de salario mensual
        
        salariomensual = salariohora * horas;
        
        //Toma de decisiones
        if (salariohora * horas > 450000) {
            System.out.println("Empleado: " + nombre + " tuvo un salario mensual de: $" + salariomensual);
                
        } else{
            System.out.println("Empleado: " + nombre);
        }
    }
    
}
