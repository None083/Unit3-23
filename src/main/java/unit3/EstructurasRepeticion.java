/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import javax.swing.JOptionPane;

/**
 *
 * @author noelia
 */
public class EstructurasRepeticion {

    //todos los bucles tienen tres partes
    //1.iniciacion de la variable de control
    //2.condicion (usando la variable de control)
    //3.actualizacion de la variable de control
    //em java hay tres bucles, que sirven para repetir una seria de instrucciones
    //mientras la condiciona es verdadera
    //bucle while
    //bucle do-while
    //bucle for
    public static void main(String[] args) {

        //BUCLE WHILE, ejecuta entre 0 y n veces
        int edad = 45; //inicialización de la vasiable de control

        while (edad <= 50) { //condición del bucle, si es true se ejecuta otra vez
            System.out.println("Tu edad es: " + edad);
            edad++; //actualizacion de la var. de control
        }
        System.out.println("Fuera del bucle while");

        //bucle que no se ejecuta nunca
        while (edad > 100 && edad < 0) {
            System.out.println("Hola");
        }

        //bucle infinito
        while (edad < 100) {
            System.out.println("Holaaaaa");
        }

        //BUCLE DO-WHILE, ejecuta entre 1 y n veces
        String nombre;

        do {
            nombre = JOptionPane.showInputDialog("Escribe el nombre");
            System.out.println("Nombre: " + nombre);
        } while (nombre.equalsIgnoreCase("Julia"));

        //BUCLE FOR, se usa cuando se sabe el número de iteracuiones a realizar
        int numero = 0;
        while (numero <= 100) {
            System.out.println("Numero " + numero);
            numero++;
        }
        
        //Cuenta de 0 a 100
        for (int numero2 = 0; numero2 <= 100; numero2++) {
            System.out.println("Numero2 " + numero2);
        }
        //Cuenta de 100 a 0
        for (int numero3 = 100; numero3 >= 0; numero3--) {
            System.out.println("Numero2 " + numero3);
        }

    }

}
