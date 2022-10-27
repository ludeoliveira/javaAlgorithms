import java.util.Locale;
import java.util.Scanner;

public class Vetores5 {

	
//	6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome
//	da pessoa mais velha.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		String[] nomes = new String[N];
		String pessoaMaisVelha = "";
		
		
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			a[i] = sc.nextInt();
		}
		
		int maiorIdade = a[0];
		int posicaoMaiorIdade = 0;
		
		for (int i =1; i < N; i++) {
			if (a[i] > maiorIdade) {
				maiorIdade = a[i];
				posicaoMaiorIdade = i;
			}
		}
		
		System.out.println("Pessoa Mais velha: " + nomes[posicaoMaiorIdade]);
		
		
		sc.close();
	}

}