import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		double largura, comprimento, valor, area;
		
		System.out.println("digite a largura:");
		Scanner sc = new Scanner(System.in);
		largura = sc.nextDouble();
		System.out.println("digite o comprimento:");
		comprimento = sc.nextDouble();
		area = largura * comprimento;
		valor = area * 200.00;
		Locale.setDefault(Locale.US);
		System.out.printf("AREA = %.2f%nPRECO = %.2f", area, valor);
		sc.close();
	}

}
