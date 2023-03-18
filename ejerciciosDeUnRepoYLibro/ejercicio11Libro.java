package controlDeFlujo;
import java.util.Scanner;
//programa para evaluar examenes

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//1. calificacion minima aprobatoria
		final int calAprob = 60;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingresa los puntos obtenidos");
		
		//asignamos el valor ingresado por el scanner 
		int calIngresada = entrada.nextInt();
		
		//condicion a evaluar, con sus dos posibles escenarios
		if (calIngresada >= calAprob) {
			System.out.println("Aprobado");
			
		} else {
			System.out.println("No Aprobado");
		}
		
		//con operador ternario
		String resultado = (calIngresada >= calAprob) ? "Aprobado":"No Aprobado";
		System.out.println(resultado);
		
		//ciere del scanner
		entrada.close();
		
		
	}

}




//notas

//para declarar constantes en java se usa "final" tipo de dato nombre y asignacion