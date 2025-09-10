/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejern12;

/**
 *
 * @author Mateo
 */
public class Impuestos {
    static double Retencion(double salario){
        return salario*0.125;
    }
    static double Salario_Neto (double salario, double retencion){
        return salario-retencion ;
    }
    static double Salario_Bruto (double salario){
        return salario;
        
    }
}
