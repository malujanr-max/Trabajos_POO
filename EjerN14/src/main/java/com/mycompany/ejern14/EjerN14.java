/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejern14;
import java.util.Scanner;
/**
 *
 * @author Mateo
 */
public class EjerN14 {

    public static void main(String[] args) {
    double numero,cuadrado,cubo;
    Scanner scanner= new Scanner(System.in);
    System.out.println("ingrese el numero");
    numero = scanner.nextDouble();
    cuadrado=Calculos.Ncuadrado(numero);
    cubo=Calculos.Ncubo(numero);
    System.out.println("El cuadrado es: "+cuadrado);
    System.out.println("El cubo es: "+cubo);
    
    }
}
