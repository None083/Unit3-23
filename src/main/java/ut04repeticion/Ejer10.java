/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ut04repeticion;

/**
 *
 * @author FX506
 */
public class Ejer10 {

    public static void main(String[] args) {
        
//        final int LETRA_A = 97;
//        final int LETRA_Z = 122;
        char letra = 'a';
        
        for (int i = 0; i < 26; i++) {
            int num = Character.valueOf(letra);
            System.out.printf(letra + "-");
            num++;
            letra = (char)num;
        }
        
//        for (int i = LETRA_A; i <= LETRA_Z; i++) {
//            System.out.println((char)i + "-");
//        }
        
    }
    
}
