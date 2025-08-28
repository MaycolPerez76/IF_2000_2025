/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Scanner;


/**
 *
 * @author mayco
 */
public class laboratorio_2 {

         public void quiz2_A_primos (Scanner sc) {
    
        System.out.println("Introduce un numero:");
                int num = sc.nextInt();
               
               if (num % 2 == 0){
                   System.out.println("El numero introducido es primo");
               } else {
                      System.out.println("Vaya!, el numero introducido no es primo");
               }
             
     }
         
         
         
         
         
         public void quiz2_B_piramide(int n) {  
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    } 
}