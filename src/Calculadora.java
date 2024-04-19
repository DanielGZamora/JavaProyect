import java.util.Scanner;

public class Calculadora {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int input = 1;
		
		while (input != 0) {
			System.out.println("Calculadora v1.0"
					+ "\n-------------------------"
					+ "\n 1) sumar"
					+ "\n 2) restar"
					+ "\n 3) multiplicar"
					+ "\n 4) dividir");
			input = teclado.nextInt();
			switch (input) {
			case 0:
				System.out.println("saliendo");
				break;
			case 1:
				suma();
				break;
			case 2:
				resta();
				break;
			case 3:
				multiplicacion();
				break;

			case 4:
				division();
				break;


			default:
				input = 0;
				System.out.println("saliendo");
				break;
			}
		}
	}

	private static int suma() {
		int n1=0, n2=0, resultado;
		System.out.println("introduce un numero: ");
		n1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		n2 = teclado.nextInt();
		resultado = n1 + n2;
		return resultado;
		
	}

	private static double resta() {
		double[] numeros = new double[999];
		
		boolean seguirRestando;
		int contador = 0;
		do {
			System.out.print("Introduce un número: ");
			numeros[contador] = teclado.nextDouble();
			teclado.nextLine();
			
			contador++;
			
			System.out.print("¿Quiere introducir otro número? (s/n):");
			seguirRestando = teclado.nextLine().equalsIgnoreCase("s");
			
		} while (seguirRestando);
		
		double resultado = 0;
		boolean primeraLinea = true;
		
		for (double numero : numeros) {
			if (primeraLinea) {
				resultado = numero;
				primeraLinea = false;
			}
			else {
				resultado -= numero;
			}
		}
		
		System.out.print("RESULTADO: " + resultado + "\n");
		return resultado;
	}

	private static int multiplicacion() {
		int n1=0, n2=0, resultado;
		System.out.println("introduce un numero: ");
		n1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		n2 = teclado.nextInt();
		resultado = n1 * n2;
		return resultado;
	}

	private static double division() {
		double[] numeros = new double[999];
		
		boolean seguirDividiendo;
		int contador = 0;
		do {
			System.out.print("Introduce un número: ");
			numeros[contador] = teclado.nextDouble();
			teclado.nextLine();
			
			contador++;
			
			System.out.print("¿Quiere introducir otro número? (s/n):");
			seguirDividiendo = teclado.nextLine().equalsIgnoreCase("s");
			
		} while (seguirDividiendo);
		
		double resultado = 0;
		boolean primeraLinea = true;
		
		for (double numero : numeros) {
			if (primeraLinea) {
				resultado = numero;
				primeraLinea = false;
			}
			else {
				resultado /= numero;
			}
		}
		
		System.out.print("RESULTADO: " + resultado + "\n");
		return resultado;
	}
}
