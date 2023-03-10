package ejerciciosJava;
import java.time.LocalTime;

public class primeraParte {

	public static void main(String[] args) {
		
		//1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
				// Revisar si es un triángulo válido
				
					double A = 3;
					double B =5;
					double C =4;
					
					String  res = (A + B > C && A+C>B && B+C>A) ? "es valido": "no es valido";
					
					System.out.println(res);
				    
					//usando la formula de heron --> área del triángulo es igual a la raíz cuadrada del producto de la semiperímetro por las diferencias entre la semiperímetro y cada uno de los lados del triángulo
					double semiP = (A+B+C)/2;
					
					double op = semiP*(semiP-A)*(semiP-B)*(semiP-C);
					
					double area = Math.sqrt(op);
					
					System.out.println("El area del triangulo es: "+area);
					
					
				
				// 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
				// Utilizar PI de la libreria de Java
					
					double radio = 7;
					
				    // Cálculo del área del círculo
				    double areaC = Math.PI * radio * radio;

				    // Cálculo de la circunferencia del círculo
				    double circunferencia = 2 * Math.PI * radio;

				    System.out.println("El área del círculo es: " + areaC);
				    System.out.println("La circunferencia del círculo es: " + circunferencia);
				
				
				// 3 Escribir un metodo que muestre por consola la hora del sistema
				// Utilizar e investigar la libreria de Java
				
				    LocalTime horaActual = LocalTime.now();
			        System.out.println("La hora actual del sistema es: " + horaActual);
				   
				

				// 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
				// ej 3600 = "1 hora = 60 min = 3600 seg"
				
			        int sec = 790038;
					
					int min = sec/60;
					int hor = sec/3600;
					
					System.out.println("los segundos ingresados son iagual a: "+ hor + " horas " + min + " minutos "+sec+" segundos");
					
						      
					
				    
				// 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
				
					double radioE = 8;
					
					double volumen = (4/3)*(Math.PI)*(Math.pow(radioE, 3));
					
					
					System.out.println("El volumen de la esfera es: "+volumen );
					
					
				
				// 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
					
					double radioCono = 3;
					double altura = 5;
					
					double volCono = ((Math.PI)*(Math.pow(radioCono, 2))*(altura))/3;
					
					System.out.println("El volumen del cono es: "+volCono);
				
				// 7 Encontrar el area superficial de un cubo dado un lado a
					
					double lado = 24;
					
					double areaSup = 6*Math.pow(lado, 2);
					
					System.out.println("El area superficial del cubo es: "+areaSup);

				// 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
						
						int año = 2023;
						
						String verificacion = (año % 4 == 0) ? "ES año Bisiesto":"No es año Bisiesto";
						
						System.out.println(verificacion);
						
	}

}
