package ciclos;
import java.util.Scanner;
public class Ejercicio2DeRepo {
 
	//Escribir un programa que pida al usuario un numero entero y muestre por pantalla si es un numero primo o no
	
	public static void main(String[] args) {
		Scanner numeroEntrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = numeroEntrada.nextInt();

        boolean esPrimo = true;//partimos de que el numero es primo (solo tiene dos divisores)
        for (int i = 2; i <= numero / 2; i++) {//primero comprueba si el numero es divisible entre 2 y si el resultado es igual o menor a 2 se conserva el true
            if (numero % i == 0) {//luego pregunta si el numero tiene residuo 0 cuando se incrementa i
                esPrimo = false;//si cumple la condicion no es primo
                break;
            }
        }
        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
	}//cierre main

}//cierre class
