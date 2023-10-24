/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit3;

import java.util.InputMismatchException;
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
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        
        final int INTENTOS = 4;
        int numMaquina;
        int numUsuario;
        String nuevoJuego;

        do {
            numMaquina = random.nextInt(100, 201);

            for (int i = 1; i <= INTENTOS; i++) {

                do {

                    try {
                        System.out.println("Adivina el número (100-200)");
                        numUsuario = teclado.nextInt();
                    } catch (InputMismatchException ime) {
                        teclado.nextLine();
                        numUsuario = 0;
                        System.out.println("Eso no es un NÚMERO");
                    }
                    if (!(numUsuario >= 100 && numUsuario <= 200)) {
                        System.out.println("Número no válido, vuelve a intentar");
                    }
                    System.out.println("------------------------------------------------------------");
                } while (!(numUsuario >= 100 && numUsuario <= 200));

                if (numUsuario < numMaquina) {
                    System.out.println("Intento " + i + "/4: El número es MAYOR al que has introducido");
                } else if (numUsuario > numMaquina) {
                    System.out.println("Intento " + i + "/4: El número es MENOR al que has introducido");
                } else if (numUsuario == numMaquina) {
                    System.out.println("Intento " + i + "/4: ¡Has acertado, olee!");
                    break;
                }
                System.out.println("------------------------------------------------------------");
            }

            System.out.println("Era el número %d".formatted(numMaquina));
            System.out.println("------------------------------------------------------------");
            System.out.println("¿Quieres jugar de nuevo? (S o N)");
            teclado.nextLine();
            nuevoJuego = teclado.nextLine();
            System.out.println("------------------------------------------------------------");

        } while (nuevoJuego.equalsIgnoreCase("s"));

    }

}
