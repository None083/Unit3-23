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
public class EjerClase19102 {

    /**
     * 2.Una persona compra un coche por un precio X y lo va a pagar en N meses.
     * Realiza el cuadro de pagos suponiendo que cada mes paga la mitad de lo
     * que quede por pagar, excepto el último mes del préstamo que paga el resto
     * que quede.
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuanto vale el coche?");
        double precioCoche = teclado.nextDouble();
        
        System.out.println("¿En cuantos meses lo quieres pagar?");
        int numMeses = teclado.nextInt();
        
        double restoPago=precioCoche;
        
        for (int i = 1; i < numMeses; i++) {
            restoPago = restoPago/2;
            System.out.println("Pago nº" + i + " - Cantidad: " + restoPago);
        }
        
        System.out.println("Pago nº" + numMeses + " - Cantidad: " + restoPago);
        //tema 3 estructura control Math-string-random leerlo, descargar repo
        
    }
    
}
