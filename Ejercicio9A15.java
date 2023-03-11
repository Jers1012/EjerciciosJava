package ejerciciosJava;

public class segundParte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 9. Escribir mostrar en pantalla los primeros 100 numeros primos
		int count = 0;
        int num = 2;
        
        while (count < 100) {
            if (isPrime(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
		// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos
		
		// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
        public static boolean esPalindromo(int num) {
            int unidad = num % 10;
            int decena = num / 10;
            return (unidad == decena);
        
    
    }
		// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
		// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
		// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops
	    public static String invertirString(String str) {
	        if (str == null || str.length() == 0) {
	            return str;
	        } else {
	            return invertirString(str.substring(1)) + str.charAt(0);
	        }
	    }
		// 15. Escribir un metodo para encontrar el factorial de un numero sin loops

	    public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
}

		


//notas

//para declarar constantes en java se usa "final" tipo de dato nombre y asignacion