/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerunit4;

import java.util.Random;

/**
 *
 * @author FX506
 *
 * 1. Método que devuelva un array de 2 millones de boolean 2. En cada posición
 * guarda cara o cruz 3. Método que recibe un array de boolean y muestre por
 * pantalla el nº de caras y el nº de cruces que contiene
 */
public class Utilidades {

    public static boolean[] arrayBuleanos() {
        boolean[] arrayB = new boolean[2_000];
        Random random = new Random();

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = random.nextBoolean();
        }

        return arrayB;
    }

    public static String[] caraCruz(boolean[] arrayBuleanos) {
        String[] caraCruz = new String[2_000];
        for (int i = 0; i < arrayBuleanos.length; i++) {
            if (arrayBuleanos[i]) {
                caraCruz[i] = "cara";
            }else{
                caraCruz[i] = "cruz";
            }
        }
        return caraCruz;
    }
    
    public static void mostrarNumeroCaraCruz(boolean[] arrayBuleanos){
        int numeroCara = 0;
        int numeroCruz = 0;
        for (int i = 0; i < arrayBuleanos().length; i++) {
            if(arrayBuleanos[i]){
                numeroCara++;
            }else{
                numeroCruz++;
            }
        }
        System.out.println("El número de caras es: " + numeroCara);
        System.out.println("El número de cruces es: " + numeroCruz);
    }

}
