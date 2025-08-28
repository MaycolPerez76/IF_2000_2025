/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.Scanner;

public class Ejercicios_Semana_2_PracticasEnClase {
    Scanner sc = new Scanner(System.in);

    public Ejercicios_Semana_2_PracticasEnClase() {
    }

    public void esParoImpar(int num) {
        System.out.println("_______________________Ejercicio_1___________________________________________");
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
        } else {
            System.out.println("El numero " + num + " es impar.");
        }
    }

    public void valorAbsoluto(int numero) {
        System.out.println("_______________________Ejercicio_2___________________________________________");
        System.out.println("Dame un numero para ver su valor absoluto:");
        int valorAbsoluto = (numero < 0) ? -numero : numero;
        System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);
    }

    public void sumaNumeros(Scanner sc) {
        System.out.println("_______________________Ejercicio_3___________________________________________");
        int[] numeros = new int[10];
        int resultado = 0;
        System.out.println("Introduce los " + numeros.length + " numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            resultado += numeros[i];
        }
        System.out.println("La suma de los numeros es: " + resultado);
    }

    public void numerosAscendentes(Scanner sc) {
        System.out.println("_______________________Ejercicio_4___________________________________________");
        System.out.println("Introduce los 3 numeros:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b) { int temp = a; a = b; b = temp; }
        if (b > c) { int temp = b; b = c; c = temp; }
        if (a > b) { int temp = a; a = b; b = temp; }

        System.out.println(a + ", " + b + ", " + c);
    }

    public void operarDosNumeros(Scanner sc) {
        System.out.println("_______________________Ejercicio_5___________________________________________");
        System.out.println("Introduce los 2 numeros correspondientes:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int resultado = (numero1 == numero2) ? numero1 * numero2
                       : (numero1 > numero2) ? numero1 - numero2
                       : numero1 + numero2;

        System.out.println("El resultado es: " + resultado);
    }

    public void detectarNotaDiez(Scanner sc) {
        System.out.println("_______________________Ejercicio_6___________________________________________");
        System.out.println("Introduce las notas alrededor del 1 al 10 solamente. Para terminar debes colocar un -1:");
        boolean huboDiez = false;
        int nota;

        while ((nota = sc.nextInt()) != -1) {
            if (nota == 10) {
                huboDiez = true;
            }
        }
        System.out.println(huboDiez ? "Hubo un 10" : "No hubo 10");
    }

    public void calcularPulsaciones(Scanner sc) {
        System.out.println("_______________________Ejercicio_7___________________________________________");
        System.out.println("Introduce tu sexo (F/M):");
        char sexo = sc.next().toUpperCase().charAt(0);
        System.out.println("Introduce tu edad:");
        int edad = sc.nextInt();

        double pulsaciones = (sexo == 'F') ? (220 - edad) / 10.0 : (210 - edad) / 10.0;
        System.out.println("Tus pulsaciones pueden llegar a ser alrededor de los: " + pulsaciones);
    }

    public void calcularUtilidad(Scanner sc) {
        System.out.println("_______________________Ejercicio_8___________________________________________");
        System.out.println("Introduce tu salario:");
        double salario = sc.nextDouble();
        System.out.println("Introduce tu tiempo en la empresa:");
        int anios = sc.nextInt();

        double porcentaje = (anios < 1) ? 0.05
                         : (anios < 2) ? 0.07
                         : (anios < 5) ? 0.10
                         : (anios < 10) ? 0.15
                         : 0.20;

        System.out.println("La utilidad es: " + (salario * porcentaje));
    }

    public void verificarPrimo(Scanner sc) {
        System.out.println("_______________________Ejercicio_9___________________________________________");
        System.out.println("Dame un numero para verificar si es primo o no:");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("No es primo");
            return;
        }

        boolean esPrimo = true;
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        System.out.println(esPrimo ? "Es primo" : "No es primo");
    }

    public void calcularCompraComputadoras(Scanner sc) {
        System.out.println("_______________________Ejercicio_10___________________________________________");
        System.out.println("Introduce la cantidad de computadoras a comprar:");
        int cantidad = sc.nextInt();

        double precioUnitario = 11000;
        double subtotal = cantidad * precioUnitario;
        double descuento = (cantidad < 5) ? 0.10 : (cantidad < 10) ? 0.20 : 0.40;

        double total = subtotal * (1 - descuento);
        System.out.println("El total a pagar es: " + total);
    }

    public void listarPrimosHastaN(Scanner sc) {
        System.out.println("_______________________Ejercicio_11___________________________________________");
        System.out.println("Introduce un numero:");
        int limite = sc.nextInt();

        for (int i = 2; i <= limite; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void areaTriangulo(Scanner sc) {
        System.out.println("_______________________Ejercicio_12___________________________________________");
        System.out.println("Dame la base del triangulo:");
        double base = sc.nextDouble();
        System.out.println("Dame la altura del triangulo:");
        double altura = sc.nextDouble();

        System.out.println("El area es: " + (base * altura) / 2);
    }
}
    

