/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerunit4;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        boolean[] arrayBuleanos = Utilidades.arrayBuleanos();
        
//        for (int i = 0; i < arrayBuleanos.length; i++) {
//            System.out.println(arrayBuleanos[i]);
//        }

        String[] arrayCaraCruz = Utilidades.caraCruz(arrayBuleanos);
        
        for (int i = 0; i < arrayCaraCruz.length; i++) {
            System.out.println(arrayCaraCruz[i]);
        }
        
        
        Utilidades.mostrarNumeroCaraCruz(arrayBuleanos);
        
    }
    
}
