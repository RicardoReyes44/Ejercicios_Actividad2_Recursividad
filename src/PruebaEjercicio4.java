import java.util.Scanner;

public class PruebaEjercicio4 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numer mayor: ");
		int mayor = entrada.nextInt();
		System.out.println("Introduce numer menor: ");
		int menor = entrada.nextInt();
		
		System.out.println("\nDivisores enteros");
		System.out.println(MetodosRecursivos.divisoresEnteros(menor, mayor, mayor));

	}

}
