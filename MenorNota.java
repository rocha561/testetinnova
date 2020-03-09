import java.util.Scanner;

public class MenorNota {

	public static void main(String[] args) {

		int n100 = 0;
		int n50 = 0;
		int n20 = 0;
		int n10 = 0;
		int saque;

		Scanner d = new Scanner(System.in);
		System.out.println("DIGITE O VALOR DO SAQUE:");
		saque = d.nextInt();

		if (saque % 10 != 0) {
			System.out.println("Não existem notas disponiveis para este valor");
		} else {
			while (saque >= 100) {
				n100 = n100 + 1;
				saque = saque - 100;
			}
			System.out.println("Quantidade de notas de R$100: " + n100);
			while (saque >= 50) {
				n50 = n50 + 1;
				saque = saque - 50;
			}
			System.out.println("Quantidade de notas de R$50: " + n50);
			while (saque >= 20) {
				n20 = n20 + 1;
				saque = saque - 20;
			}
			System.out.println("Quantidade de notas de R$20: " + n20);
			while (saque >= 10) {
				n10 = n10 + 1;
				saque = saque - 10;
			}
			System.out.println("Quantidade de notas de R$10: " + n10);
		}
	}
}
