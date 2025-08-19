/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author mayco
 */
public class Recursividad {
    public static void main (String args[]) {
         int[] array = {1, 2, 3, 4, 5};
         int resultado = sumaRecursividad(array, 0);
        System.out.println(resultado);
    }
    
    public static int sumaRecursividad(int[] numeros, int indice) {
       int res;
       
       if (numeros.length !=  indice) {
           return 1;
       } else {
          res = indice + sumaRecursividad(numeros, indice+1 );
       }
       
       return res;
    }
}
