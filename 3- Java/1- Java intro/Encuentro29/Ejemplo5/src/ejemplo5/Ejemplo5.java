/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo5;

import java.util.Scanner;

public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
    }
}
