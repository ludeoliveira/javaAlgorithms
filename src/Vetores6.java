import java.util.Locale;
import java.util.Scanner;

public class Vetores6 {

//	7) Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
//	Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
//	considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		String[] nomes = new String[N];
		double[] media = new double[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}

		for (int i = 0; i < N; i++) {
			media[i] = (double) (nota1[i] + nota2[i]) / 2;
		}

		int posicaoAprovado = 0;
		
		System.out.println("Alunos aprovados:");

		for (int i = 0; i < N; i++) {
			if (media[i] >= 6) {
				posicaoAprovado = i;
				System.out.println(nomes[posicaoAprovado]);
			}
		}
		sc.close();
	}
}