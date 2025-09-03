/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class Lab1_ejercicios {
    Scanner sc = new Scanner(System.in);
    public Lab1_ejercicios () {
    }
    
    
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
    
         public void ejercicio_A_algoritmo (int n) {
              System.out.println(" ");
               System.out.println("______________________________EJERCICIO_A______________________________:");            
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
          
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println(); 
        }
    }
         
         
         

          public void ejercicio_B_algoritmo (int n) {
             System.out.println(" ");
               System.out.println("______________________________EJERCICIO_B______________________________:");
           for (int i = n; i > 1; i--) {
            for (int j = 1; j < i; j++) {
          System.out.print("*");
            }
            System.out.println(" "); 
        }
    }
          
          
          
          
         public void ejercicio_C_algoritmo (int n) {
              System.out.println(" ");
               System.out.println("______________________________EJERCICIO_C______________________________:");            
         for (int i = n; i >= 1; i--) {
            for (int espacio = 1; espacio <= n - i; espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= i; asterisco++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

         
         
         
         
         public void ejercicio_D_array (int arr[], Scanner sc) {
             System.out.println(" ");
               System.out.println("______________________________EJERCICIO_D______________________________:");
                     System.out.println("Introduzca los 10 numeros:");
           for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado ascendentemente:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close(); 
     }
         
         
         
         
         
         
        public void ejercicio_E_array () {
         System.out.println(" ");
            System.out.println("______________________________EJERCICIO_E______________________________:");
             Random random = new Random();
        int arr[] = new int[100];
        System.out.println("Arreglo con numeros random:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Arreglo ordenado descendentemente:");
        for (int num : arr) {
            System.out.print(num + " ");
        }          
     }
                  
                
          
          
          
            public void ejercicio_F_tablero () {
  System.out.println(" ");               
            System.out.println("______________________________EJERCICIO_F______________________________:");                
                char[][] tablero = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = ' ';
            }
        }
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if ((fila + columna) % 2 == 0) {
                    tablero[fila][columna] = 'N';
                }
            }
        }
        for (int fila = 5; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
 
                if ((fila + col) % 2 == 0) {
                    tablero[fila][col] = 'R';
                }
            }
        }
        System.out.print("  ");
        for (int columna = 1; columna <= 8; columna++) {
            System.out.print(columna + " ");
        }
        System.out.println();       
        char[] letraizq = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        for (int fila = 0; fila < 8; fila++) {
            System.out.print(letraizq[fila] + " ");
            for (int columna = 0; columna < 8; columna++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }        
     }
         public void ejercicio_quiz_3 (int n) {
              System.out.println(" ");
               System.out.println("______________________________EJERCICIO_QUIZ_3______________________________:");            
          for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
          
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else if (i == n / 2 && j == n / 2) {
                    System.out.print("*"); 
                } else {
                    System.out.print(" "); 
                }
            }
            System.out.println(); 
            System.out.println(" "); 
        }
    }
         


         
         
         
    }  


