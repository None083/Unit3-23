/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class EjerClase2010 {

    /**
     * Adivinia adivinanza. Vamos a jugar a acertar un número pensado por la
     * máquina entre 100 y 200. Hay 4 intentos para adiviniarlo. Si se acierta,
     * mostrar mensaje informando, en caso contrario se debe ayudar al jugador
     * indicando si el número pensado es mayor o menor al que ha puesto. Una vez
     * finalizada la partida, se debe preguntar si quiere jugar otra vez.
     * 
     * 
     * 
     * 
     * 
     * En BurgerCrangeBurger están de promoción durante el fin de semana. 
     * A cada cliente que se acerque a la caja a pagar su pedido de comida 
     * basura le van a descontar unos euros para que pueda dedicarlos en ir 
     * al dentista. Cada vez que un cliente se acerca a la caja, este debe 
     * tirar un dado. Si la tirada es par, le descuentan un 25% del total 
     * del pedido y si la tirada es impar, entonces debe sacar una bolita 
     * de color de un saco. Si la bolita es blanca, no hay descuento, 
     * si es roja le quitan un 12%
     * 
     * y si es amarilla un 5%.Soliicita al cliente que va a a pagar el 
     * importe del pedido y muestra el descuento, la tirada del dado y 
     * el color de la bolita, si es que tuvo que sacarla. Se debe preguntar 
     * si hay más clientes, para proceder de igual forma.
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int numMaquina;
        int numAdivina;
        String resultado;
        String nuevoIntento;

        System.out.println("Adivina el número (100-200)");

        do {
            numMaquina = random.nextInt(100, 201);
            teclado.nextInt();

            for (int i = 0; i < 4; i++) {

                do {
                    System.out.println("Adivina el número (100-200)");
                    numAdivina = teclado.nextInt();
                    teclado.nextInt();
                } while (!(numAdivina>=100 && numAdivina<=200));
                
                resultado = (numAdivina == numMaquina) ? ("¡Lo has adivinado, ole!")
                        : ("Otra vez será. Era el número %d").formatted(numMaquina);
                System.out.println("Intento nº " + i + ":" + resultado);

                if (resultado.equals("¡Lo has adivinado, ole!")) {
                    break;
                }
            }

            System.out.println("¿Quieres jugar de nuevo? (S o N)");
            nuevoIntento = teclado.nextLine();

        } while (nuevoIntento.equalsIgnoreCase("s"));

    }

}
