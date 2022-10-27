import java.util.Locale;
import java.util.Scanner;

public class Vetores4 {

	
//	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média aritmética somente
//	dos números pares lidos.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		double media;
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			if (a[i] % 2 == 0) {
				soma += a[i];
			}
		}
		
		media = (double) soma / N;
		System.out.printf("%.1f", media);
		
		
		sc.close();
	}

}