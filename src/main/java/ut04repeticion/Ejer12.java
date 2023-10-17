/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut04repeticion;

/**
 *
 * @author FX506
 */
public class Ejer12 {

    public static void main(String[] args) {
        
        char letra = 'a';
        
        for (int i = 0; i < 26; i++) {
            int num = Character.valueOf(letra);
            System.out.println(letra + " - " + num);
            num++;
            letra = (char)num;
        }
        
    }
    
}
