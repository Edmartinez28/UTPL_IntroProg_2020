import java.util.Scanner;

public class ParImpar1 {
	public static void main (String[] args) {
		// Declaración de variable
		Scanner sc = new Scanner(System.in);
		int numero;

		// Entrada de datos
		System.out.print("Ingrese un número entero: ");
		numero = sc.nextInt();

		// Proceso
		if (numero % 2 == 0) {
			System.out.println("\nEl número es PAR");
		} else {
			System.out.println("\nEl número es IMPAR");
		}

	}
}