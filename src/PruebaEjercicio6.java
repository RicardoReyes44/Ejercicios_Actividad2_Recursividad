import java.util.Scanner;

public class PruebaEjercicio6 {

    public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce cadena: ");
		String cadena = entrada.nextLine();

		System.out.println("\nCantidad de vocales");
		System.out.println(MetodosRecursivos.cantidadVocales(cadena.toUpperCase(), cadena.length()-1, 0));
		
	}

}
