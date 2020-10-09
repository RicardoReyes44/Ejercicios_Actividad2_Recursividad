import java.util.Scanner;

public class PruebaEjercicio2 {

	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce numero: ");
		long numero = entrada.nextInt();
		
		System.out.println("\nFactorial");
		System.out.println(MetodosRecursivos.factorial(numero));
      
	}

}
