import java.util.Scanner;

public class PruebaEjercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce numero en base 10: ");
		int numero = entrada.nextInt();
		
		System.out.print("Numero en binario: ");
		MetodosRecursivos.mostrarConversion(numero);
		
	}

}
