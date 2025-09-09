/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicion4;

public class EjercicioN4 {

    public static void main(String[] args) {
    double edjuan = 9;
    double edalber= Calculos.calcular_edalber(edjuan);
    double edana= Calculos.calcular_edana(edjuan);
    double edmama = Calculos.calcular_edmama(edjuan, edalber, edana);
    System.out.println("juan tiene: "+ edjuan);
    System.out.println("ana tiene: "+ edana);
    System.out.println("albert tiene: "+ edalber);
    System.out.println("la mama tiene: "+ edmama);
    }
}