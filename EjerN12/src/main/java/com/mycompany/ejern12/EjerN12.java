/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejern12;

/**
 *
 * @author Mateo
 */
public class EjerN12 {

    public static void main(String[] args) {
    double salario=5000*48;
    double retencion=Impuestos.Retencion(salario);
    double Sbruto= Impuestos.Salario_Bruto(salario);
    double Sneto= Impuestos.Salario_Neto(salario, retencion);
    System.out.println("La retencion del 12.5% es: "+ retencion);
    System.out.println("El salario bruto es de: "+ Sbruto);
    System.out.println("El salario neto es de: "+ Sneto);
    
    }
}
