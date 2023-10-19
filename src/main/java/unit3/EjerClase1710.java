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
     * 1.Solicitar números enteros al usuario hasta que ponga 0
     * Mostrar la suma de los números introducidos
     * 
     * 
     * 
     * 2.Solicitar al usuario un número concreto de números que debe introducir. 
     * El programa pedirá al usuario esa cantidad de números, uno a uno, 
     * y dirá si el número introducido es par, impar. 
     * Al terminar debe calcular la media aritmética.
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        
        //ejer 1
//        int num = 1;
//        int suma= 0;
//        
//        do{
//            System.out.println("Introduce un número entero");
//            num = teclado.nextInt();
//            suma += num;
//            
//        }while(num != 0);
//        
//        System.out.println("La suma es: " + suma);
        
        
        
        //ejer 2
        System.out.println("¿Cuántos números quieres introducir?");
        int contador = teclado.nextInt();
        
        int aux = 0;
        
        for (int i = 0; i < contador; i++) {
            System.out.println("Introduce un número");
            int numTeclado = teclado.nextInt();
            
            if(numTeclado%2==0){
                System.out.println("El número " + numTeclado + " es par");
            }else{
                System.out.println("El número " + numTeclado + " es impar");
            }
            aux += numTeclado;
        }
        
        System.out.println("La suma total es " + aux);
        
        
        
    }
    
}
