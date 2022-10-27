import java.util.Locale;
import java.util.Scanner;

public class ExUri2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int option = 1;
		int empate = 0;
		int vitoriaG = 0;
		int vitoriaI = 0;

		while (option == 1 ) {
			int golsInter = sc.nextInt();
			int golsGremio = sc.nextInt();

			if (golsInter > golsGremio) {
				vitoriaI += 1;
			}
			else if (golsGremio> golsInter) {
				vitoriaG += 1;
			}
			else {
				empate += 1;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			option = sc.nextInt();
				
		}
		
		int total = vitoriaI + vitoriaG + empate;
		
		System.out.println(total + " grenais");
		System.out.println("Inter:" + vitoriaI);
		System.out.println("Gremio:" + vitoriaG);
		System.out.println("Empates:" + empate);
		
		if (vitoriaI > vitoriaG) {
			System.out.println("Inter venceu mais");
		}
		else if (vitoriaG > vitoriaI) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();
	
	}

}
