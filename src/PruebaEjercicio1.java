import java.util.Scanner;

public class PruebaEjercicio1 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numero: ");
		int numero = entrada.nextInt();

		System.out.println("\nDivisores");
		System.out.println(MetodosRecursivos.divisores(numero, numero));

	}

}
