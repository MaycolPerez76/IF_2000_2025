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
import Logic.laboratorio_2;
import domain.Person;
import java.util.Scanner;

public class IF2000_IntroduccionProgra {
    public static void main (String args[]) { 
        Scanner sc = new Scanner(System.in);
        // CLASES:
     Person p = new Person("Yuli", "Solis", 1245432, 20, 23422345);
     Ejercicios_Semana_2_PracticasEnClase ej = new Ejercicios_Semana_2_PracticasEnClase();
     Lab1_ejercicios lab = new Lab1_ejercicios();
     laboratorio_2 lab2 = new laboratorio_2();
     
     
     
 
        //"______________________________LAB1_EJERCICIOS______________________________:" 
                //"______________________________EJERCICIO_A______________________________:"
     lab.ejercicio_A_algoritmo(5);
             //"______________________________EJERCICIO_B______________________________:"
     lab.ejercicio_B_algoritmo(7);
        //"______________________________EJERCICIO_C______________________________:"
     lab.ejercicio_C_algoritmo(4);
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
    
     
     
     
     
     
        //"______________________________EJERCICIOS_SEMANA_2______________________________:" 
                 //"______________________________EJERCICIO_1______________________________:"   
       ej.esParoImpar(67);  
                        //"______________________________EJERCICIO_2______________________________:"   
       ej.valorAbsoluto(-42);
                        //"______________________________EJERCICIO_3______________________________:"   
       ej.sumaNumeros(sc);
                        //"______________________________EJERCICIO_4______________________________:"   
       ej.numerosAscendentes(sc);
                        //"______________________________EJERCICIO_5______________________________:"   
       ej.operarDosNumeros(sc);
                        //"______________________________EJERCICIO_6______________________________:"   
       ej.detectarNotaDiez(sc);
                        //"______________________________EJERCICIO_7______________________________:"   
ej.calcularPulsaciones(sc);
                 //"______________________________EJERCICIO_8______________________________:"   
ej.calcularUtilidad(sc);
                 //"______________________________EJERCICIO_9______________________________:"   
ej.verificarPrimo(sc);
                 //"______________________________EJERCICIO_10______________________________:"   
ej.calcularCompraComputadoras(sc);
                 //"______________________________EJERCICIO_11______________________________:"   
ej.listarPrimosHastaN(sc);
                 //"______________________________EJERCICIO_12______________________________:"   
ej.areaTriangulo(sc);

    


        //"______________________________EJERCICIOS_LABORATORIO_2______________________________:"
lab2.sumaPares(sc);
lab2.celsiusAFahrenheit(sc);
lab2.calcularPotencia(2,4);
lab2.obtenerMes(sc);
lab2.evaluarFuncion(5);
lab2.areaTriangulo(sc);
lab2.intercambioDeValor(sc);
lab2.ecuacionRecta(2, 3, 4, 5);
lab2.sumaNaturalesK(sc);
lab2.calcularPromedio(sc);
lab2.visualizarLista(sc);
lab2.parImparRandom();
lab2.sumaCuadradosPrimeros100();
lab2.factorial(sc);
lab2.valorMaximo(sc);


    }
}
