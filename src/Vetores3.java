import java.util.Locale;
import java.util.Scanner;

public class Vetores3 {

	
//	4) Fazer um programa para ler um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos
//	elementos. Depois mostrar todos os elementos do vetor que estejam abaixo da média.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] a = new double[N];
		double media;
		double soma = 0.0;
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < N; i++) {
			soma += a[i];
		}
		
		media = (double) soma / N;
		System.out.println(media);
		
		for (int i = 0; i < N; i++) {
			if (a[i] < media) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}

}