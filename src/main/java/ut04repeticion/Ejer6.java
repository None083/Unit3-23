/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut04repeticion;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Ejer6 {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner(System.in);
        int n,x;
        System.out.print("Ingrese el valor final:");
        n=teclado.nextInt();
        
        for (x = 1; x<=n; x++) {
            System.out.print(x);
            System.out.print(" - ");
        }
        
    }
    
}
