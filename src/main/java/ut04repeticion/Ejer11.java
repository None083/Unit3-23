/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut04repeticion;

/**
 *
 * @author FX506
 */
public class Ejer11 {

    public static void main(String[] args) {
        
        char letra = 'A';
        int contador = 1;
        
        do{
            int num = Character.valueOf(letra);
            System.out.printf(letra + "-");
            num++;
            letra = (char)num;
            contador++;
        }while(contador<=26);
        
    }
    
}
