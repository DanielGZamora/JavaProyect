
public class Calculadora {
		public static void main(String[] args) {
		
	}
		
	public double restar(double[] numeros) {
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
		
		return resultado;
	}
}
