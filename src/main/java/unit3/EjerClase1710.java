/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class EjerClase1710 {

    /**
     * Solicitar números enteros al usuario hasta que ponga 0
     * Mostrar la suma de los números introducidos
     * 
     * 
     * 
     * Solicitar al usuario un número concreto de números que debe introducir. 
     * El programa pedirá al usuario esa cantidad de números, uno a uno, 
     * y dirá si el número introducido es par, impar. 
     * Al terminar debe calcular la media aritmética.
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        //ejer 1
        int num = 1;
        int aux;
        int suma;
        
        do{
            aux = num;
            System.out.println("Introduce un número entero");
            num = teclado.nextInt();
            suma = aux + num;
            
        }while(num != 0);
        
        System.out.println("La suma es: " + (suma-1));
        
    }
    
}
