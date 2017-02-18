/* Maythe Portales Barrios IIS
A01411461 Actividad 6, problema 1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mportalesb.a06p1;

import java.util.Scanner;

/**
 *
 * @author may37
 */
public class SPP2MPortalesBA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dato = 0, suma = 0;
        dato = solicitarDatos();
        while (dato >= 0) {
            suma = calcularSuma(dato, suma);
            dato = solicitarDatos();
        }
        System.out.println("El resultado es " + suma);
    }

    static double solicitarDatos() {
        Scanner teclado = new Scanner(System.in);
        double dato = 0;

        System.out.println("Introduce un dato");
        try {
            dato = teclado.nextDouble();
        } catch (Exception ex) {
            System.out.println("No es un dato numerico");
        }

        return dato;
    }

    static double calcularSuma(double dato, double suma) {
        suma = suma + dato;
        return suma;
    }
}
