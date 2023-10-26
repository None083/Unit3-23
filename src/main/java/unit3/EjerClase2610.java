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
public class EjerClase2610 {

    /**
     * Una cadena de tiendas de autoservicio cuenta con sucursales en C ciudades
     * del país, en cada ciudad cuenta con T tiendas y cada tienda tiene E
     * empleados. Cada día una tienda pregunta lo que vende cada empleado de
     * manera individual, para saber cuánto vendió la tienda en total, cuánto se
     * vendió en la ciudad y el total recaudado por la cadena de tiendas en el
     * país. Realiza el programa para introducir en un día lo que vendió cada
     * empleado de cada tienda de cada ciudad y saber las ventas de cada tienda,
     * de cada ciudad y del total en el país
     */
    public static void main(String[] args) {

        int numeroCiudades = Integer.parseInt(JOptionPane.showInputDialog("¿En cuántas ciudades están nuestras tiendas?"));
        int numeroTiendas = numeroTiendas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas tiendas hay en cada ciudad?"));
        int numeroEmpleados = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos empleados hay en las tienda?"));
        int numeroVentas = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas ventas han realizado los empleados?"));
        double precioVentas = Double.parseDouble(JOptionPane.showInputDialog("¿De cuánto es la cantidad de las ventas?"));
        double sumaTotal = 0;
        double sumaTienda = 0;
        double sumaEmpleado = 0;

        for (int i = 0; i < numeroCiudades; i++) {
            for (int j = 0; j < numeroTiendas; j++) {
                 sumaTienda += precioVentas;
                for (int k = 0; k < numeroEmpleados; k++) {
                    sumaEmpleado += precioVentas;
                    for (int l = 0; l < numeroVentas; l++) {
                        sumaTotal += precioVentas;
                    }
                }
            }
        }
        System.out.println("Cada empleado ha vendido: " + sumaEmpleado + "€");
        System.out.println("En cada tienda se ha vendido: " + sumaTienda + "€");
        System.out.println("El total del país es: " + sumaTotal + "€");

    }

}
