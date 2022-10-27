import java.util.Locale;
import java.util.Scanner;

public class Matriz1 {

//	8) Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas. Fazer um programa que calcule e escreva:
//		a maior e a menor altura do grupo
//		a média de altura das mulheres
//		o número de homens
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] altura = new double[N];
		char[] sexo = new char[N];

		
		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		
		int numeroMulheres = 0;
		int numeroHomens = 0;
		
		for (int i = 0; i < N; i++) {
			if (sexo[i] == 'F') {
				numeroMulheres++;
			} else {
				numeroHomens++;
			}	
		}
		
		double somaAlturaMulheres = 0.0;
		
		for (int i = 0; i < N; i++) {
			if (sexo[i] == 'F') {
				somaAlturaMulheres += altura[i];
			}
		}
		
		double media = (double) somaAlturaMulheres / numeroMulheres;
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		 for (int i = 1; i < N; i++) {
			 if (altura[i] < menorAltura) {
				 menorAltura = altura[i];
			 }
		 }
		 
		 for (int i = 1; i < N; i++) {
			 if (altura[i] > maiorAltura) {
				 maiorAltura = altura[i];
			 }
		 }
		
		System.out.println("Menor altura = " + menorAltura);
		System.out.println("Maior altura = " + maiorAltura);
		System.out.println("Numero de homens = " + numeroHomens);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		
		sc.close();
	}
}