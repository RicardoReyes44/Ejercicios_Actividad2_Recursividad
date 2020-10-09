import java.util.Scanner;

public class PruebaEjercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce cadena: ");
		String cadena = entrada.nextLine();
		
		System.out.println("\nCadena inversa");
		MetodosRecursivos.cadenaInversa(cadena, cadena.length()-1);

	}

}
