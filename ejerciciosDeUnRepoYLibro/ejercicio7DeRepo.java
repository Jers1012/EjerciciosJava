package Funciones;

import java.util.Scanner;

public class Ejercicio7Repo {

    public static void main(String[] args) {
        Scanner numeroEntrada = new Scanner(System.in);
        
        //leer numeros enteros positivos del teclado, hasta que el usuario ingrese el numero cero e informar cual fue el mayor y el menor numero ingresado

        int numero, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;//el MIN_VALUE y el MAX_VALUE son constantes en java y tieneen el valor de -2147483647 y 2147483647 respectivamente

        //usamos un do while para hacer las condiciones
        do {
            System.out.print("Ingresa un número entero (0 para salir): ");
            numero = numeroEntrada.nextInt();//asignamos el el numero de entrada a numero

            if (numero != 0) {//si pasa la condicion reasignara valores maximo y minimo si es cero no se asigna nada
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }//cierre  if
        } while (numero != 0);

        if (maximo == Integer.MIN_VALUE) {//si el cero se ingresa al principio devolvera no se ingresaron numeros
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("El número máximo ingresado es: " + maximo);
            System.out.println("El número mínimo ingresado es: " + minimo);
        }
    }
}
