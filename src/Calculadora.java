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
		System.out.println("el resultado es: " + resultado);
		return resultado;
		
	}

	private static int resta() {

	}

	private static int multiplicacion() {
		int n1=0, n2=0, resultado;
		System.out.println("introduce un numero: ");
		n1 = teclado.nextInt();
		System.out.println("introduce otro numero: ");
		n2 = teclado.nextInt();
		resultado = n1 * n2;
		System.out.println("el resultado es: " + resultado);
		return resultado;
	}

	private static int division() {

	}
}
