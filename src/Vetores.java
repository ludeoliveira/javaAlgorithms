import java.util.Locale;
import java.util.Scanner;

public class Vetores {

	
//	3) Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde
//	cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado.
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			c[i] = a[i] + b[i];			
		}
		
		for (int i = 0; i < N; i++) {
			System.out.print(c[i] + " ");
		}
			
		System.out.println();
		sc.close();
	}

}