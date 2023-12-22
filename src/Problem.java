
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] nomes = new String[10];
		String resultado = "";
		for (int i = 0; i < 10; i++) {

			nomes[i] = sc.nextLine();

			if (nomes[i] == nomes[2]) {
				resultado += nomes[i] + '_';
			}

			if (nomes[i] == nomes[6]) {
				resultado += nomes[i] + '_';
			}

			if (nomes[i] == nomes[8]) {
				resultado += nomes[i] + '_';
			}
		}
		String[] arr = resultado.split("_");
		String terceiro = arr[0];
		String setimo = arr[1];
		String nono = arr[2];

		System.out.println(terceiro);
		System.out.println(setimo);
		System.out.println(nono);

		sc.close();
	}
}