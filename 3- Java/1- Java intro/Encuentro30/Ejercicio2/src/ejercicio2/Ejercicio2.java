
package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre a continuacion:");
        String nombre = leer.nextLine();
        
        System.out.println("Bienvenido " + nombre + ", como estas?");
    }
    
}
