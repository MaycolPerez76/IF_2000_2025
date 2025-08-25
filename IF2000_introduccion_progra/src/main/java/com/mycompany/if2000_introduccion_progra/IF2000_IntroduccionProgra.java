/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.if2000_introduccion_progra;

/**
 *
 * @author mayco
 */
import Logic.Ejercicios_Semana_2_PracticasEnClase;
import Logic.Lab1_ejercicios;
import domain.Person;
import java.util.Scanner;

public class IF2000_IntroduccionProgra {
    public static void main (String args[]) { 
        Scanner sc = new Scanner(System.in);
        // CLASES:
     Person p = new Person("Yuli", "Solis", 1245432, 20, 23422345);
     Ejercicios_Semana_2_PracticasEnClase ej = new Ejercicios_Semana_2_PracticasEnClase();
     Lab1_ejercicios lab = new Lab1_ejercicios();
        
        
     
     
     
        //"______________________________EJERCICIO_A______________________________:" 
        lab.ejercicio_A_algoritmo(5);
        //"______________________________EJERCICIO_B______________________________:" 
        lab.ejercicio_B_algoritmo(7);
     
        
        
        
        
     
        //"______________________________EJERCICIO_D______________________________:" 
           int[] arreglo = new int[10];
       lab.ejercicio_D_array(arreglo, sc);
                System.out.println("Array ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }     
        
        //"______________________________EJERCICIO_E______________________________:"
       lab.ejercicio_E_array();      
        
         //"______________________________EJERCICIO_F______________________________:"        
       lab.ejercicio_F_tablero();
        
        

        
 
        
    }
}
