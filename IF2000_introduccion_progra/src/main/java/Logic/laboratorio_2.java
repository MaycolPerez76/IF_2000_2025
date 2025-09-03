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
public class laboratorio_2 {

public laboratorio_2() {
    
}
    
    public int sumaPares(Scanner sc) {
                System.out.println("-----______________________EJERCICIO_13________________-----:");
        int suma = 0;
        System.out.println("Dame 7 numeros primos y te dare sus sumas:");
        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();   
            if (num % 2 == 0) {
                suma = suma + num;
            } else {
                System.out.println("el numero" + num + "no es par");
                 System.out.println("continua:");         
            }
        }
        System.out.println("El resultado de tu suma es:" + suma);
        return 1;
    }
    
    
            public void celsiusAFahrenheit(Scanner sc) {
                System.out.println("-----______________________EJERCICIO_14________________-----:");
                 System.out.println("Ingresa los grados celsius a convertir:");
                int tempCelsius = sc.nextInt();
                
                double tempfahr = (tempCelsius * 9/5) + 32;
                  
                 System.out.println(tempCelsius + " grados Celsius son equivalentes a " + tempfahr + " grados Fahrenheit.");
    }
    
    
            
            
                public double calcularPotencia(int base, int exponente) {
                System.out.println("-----______________________EJERCICIO_15________________-----:");
        if (exponente == 0) {
            return 1;
        }
        double resultado = 1;
        int expAbsoluto = Math.abs(exponente);
        for (int i = 0; i < expAbsoluto; i++) {
            resultado = resultado * base;
 
        }
       System.out.println("El resultado de la enesima potencia es:" + resultado);               
        return 1;
    }
                
                
       public String obtenerMes(Scanner sc) {
                System.out.println("-----______________________EJERCICIO_16________________-----:");
           int numeroMes = sc.nextInt();
        switch (numeroMes) {
            case 1: return "Enero";
            case 2: String mes = "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Numero de mes no valido. Debe ser entre 1 y 12.";
        }
    }             
                
                
                   public double evaluarFuncion(double valorX) {
                 System.out.println("-----______________________EJERCICIO_17________________-----:");                      
        if (valorX > 0) {
            return valorX + 5;
        } else if (valorX < 0) {
            return valorX * valorX;
        } else {
            return 1;
        }
    }
                
                public double areaTriangulo (Scanner sc) {
                 System.out.println("-----______________________EJERCICIO_18________________-----:");                
                    int ladoA, ladoB, ladoC;
                    
                    System.out.println("Dame los lados del triangulo y su base:");
                    
                     System.out.println("Lado A:");
                     ladoA = sc.nextInt();      
                      System.out.println("Lado B:");
                     ladoB = sc.nextInt();                          
                     System.out.println("Base del triangulo:");
                     ladoC = sc.nextInt();                  
                     
                     
                    double perimetro = (ladoA + ladoB + ladoC) / 2.0; 
    double formula = perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC);
                    double area = Math.sqrt(formula);
                    
                    System.out.println("El area del triangulo es:" + area);
                return area;
                }
                

     public void intercambioDeValor(Scanner sc) {
                   System.out.println("-----______________________EJERCICIO_19________________-----:");      
     System.out.println("Ingrese el valor de la variable A:");     
int a = sc.nextInt();
     System.out.println("Ingrese el valor de la variable B:");     
int b = sc.nextInt();
System.out.println("Antes del intercambio: a = " + a + ", b = " + b); 

int temp = a; 
a = b;       
b = temp;  

System.out.println("Después del intercambio: a = " + a + ", b = " + b); 


     }


 
public void ecuacionRecta(int x0, int y0, int x1, int y1) {
    
         System.out.println("-----______________________EJERCICIO_20________________-----:");     
    if (x0 == x1) {
        System.out.println("No se puede calcular la pendiente: división entre cero.");
        return;
    }
    int m = (y0 - y1) / (x0 - x1);
    int b = y0 - (m * x0);
    System.out.println("La ecuacion de la recta es: y = " + m + "x + " + b);
}




                
                public void sumaNaturalesK (Scanner sc) {
                System.out.println("-----______________________EJERCICIO_21________________-----:");     
                       System.out.println("Ingrese un numero y te dare sus sumas:");   
                    int k = sc.nextInt();
                    
                    if (k > 0) {
                       for (int i = 0; i < k; i++)  {
                          int suma = k + i;
                         System.out.println("La suma de" + " " + k + " " + "con el numero " + " " + i + "es:"  + " " + suma);
                       }
                    } else {
                       System.out.println("error, debe ser un numero positivo y entero");   
                    }
                    
                    
                }
                
                
                   public void calcularPromedio(Scanner sc) {
                System.out.println("-----______________________EJERCICIO_22________________-----:");     
                double suma  = 0;   
               
          System.out.println("ingrese 10 numeros y te dare su promedio:"); 
            for (int i = 0; i < 10; i++)  {
                 int numeros = sc.nextInt();
                 suma = suma + numeros;
                       }
            double promedio = (suma / 10);
                 System.out.println("El promedio de tus numeros es:" + promedio);
            
            
       }               
                    
            public void visualizarLista(Scanner sc) {
                System.out.println("-----______________________EJERCICIO_23________________-----:");     
                int sumaTotal = 0;
                int   sumaPares = 0;
                int  sumaImpares = 0;
                int contadorPares = 0;
                int contadorImpares = 0;
                
                 System.out.println("Ingresa los 10 numeros:");
                   for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();   
            if (num % 2 == 0) {
                sumaPares = sumaPares + num;
                contadorPares++;
            } else {
                     sumaImpares = sumaPares + num;
                     contadorImpares++;
            }
            sumaTotal = sumaTotal + num;
        }       
                 System.out.println("La cantidad de numero pares son:" + contadorPares);   
                 System.out.println("La cantidad de numero impares son:" + contadorImpares);                
                   
                 System.out.println("La suma de los numeros pares es:" + sumaPares);   
                 System.out.println("La suma de los numeros impares es:" + sumaImpares);
                 System.out.println("La suma de todos los numeros es:" + sumaTotal);
                 
                
                
                
            }        
             
            
            
            
                    public void parImparRandom () {
                System.out.println("-----______________________EJERCICIO_24________________-----:");  
             Random random = new Random();
             
            int nums[] = new int[100];     
            int sumaPares = 0;
            int sumaImpares = 0;
             for (int i = 0; i < nums.length; i++) {
             nums[i] = random.nextInt(100);
        if (nums[i] % 2 == 0) {
            sumaPares = sumaPares + nums[i];
        } else {
                 sumaImpares = sumaImpares + nums[i];
        }
        
      }
             System.out.println("Los numeros pares sumados son:" + sumaPares);
             System.out.println("Los numeros impares sumados son:" + sumaImpares);
    }
            
                    
     
                public int sumaCuadradosPrimeros100() {
          System.out.println("-----______________________EJERCICIO_25________________-----:");   
    int suma = 0;
    for (int i = 1; i <= 100; i++) {
        suma += i * i;
    }
    return suma;
}    
                    
                    
            
   public int factorial (Scanner sc) {
            System.out.println("______________________________EJERCICIO_26______________________________:");     
         System.out.println("Introduce un numero para saber su factorial:");
       int num = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            if (num > 0) {
            result = result * i;
            } else {
             return 1;
           }
        }
        System.out.println("El factorial de " +" " + num + " "  + "es:" + result);
          return result;
   }
            

       public int valorMaximo(Scanner sc) {
            System.out.println("______________________________EJERCICIO_27______________________________:");
                int[] numeros = new int[10];
                
                  System.out.println("Introduce los 10 numeros");                  
         for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
    }
    
    int maximo = numeros[0];
    
    for (int j = 1; j < numeros.length; j++) {
        if (numeros[j] > maximo) {
            maximo = numeros[j];
        }
    }
    
    System.out.println("El valor maximo de los 10 numeros es: " + maximo);
    return maximo;
}
       
       
       
       
}
   
   
  
            
   
