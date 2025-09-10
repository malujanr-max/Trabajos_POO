 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejern17;

import java.util.Scanner;

/**
 *
 * @author Mateo
 */
public class EjerN17 {

    public static void main(String[] args) {
    double numero,cuadrado,cubo;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Ingrese su numero: ");
    numero = scanner.nextDouble();
    cuadrado=Calculos.Cuadrado_n(numero);
    cubo=Calculos.Cubo_n(numero);
    
    System.out.println("su numero es: "+ numero);
    System.out.println("Su cuadrado es: "+ cuadrado);
    System.out.println("Su cubo es: "+ cubo);
    }
}
