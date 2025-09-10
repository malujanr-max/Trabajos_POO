/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejern5;
import java.util.Scanner;
/**
 *
 * @author Mateo
 */
public class EjerN5 {

    public static void main(String[] args) {
    double suma,x,y;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Ingrese el valor de suma");
    suma = scanner.nextDouble();
    System.out.println("Ingrese el valor de x");
    x = scanner.nextDouble();
    System.out.println("Ingrese el valor de y");
    y = scanner.nextDouble();
    
    suma=Calculos.calcular_suma(x, suma);
    x=Calculos.calcular_x(x, y);
    suma=suma+(x/y);
    
    System.out.println("El valor de la suma es: "+ suma);
    System.out.println("El valor de la x es: "+ x);
    System.out.println("El valor de la y es: "+ y);
    
    
    }
}
