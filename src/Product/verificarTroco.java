package Product;

import java.util.Locale;
import java.util.Scanner;

public class verificarTroco {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		int quantidade;
		double precoUnidade ,valorRecebido ,troco ,faltam;

		System.out.print("Preço unitario do produto: ");
		precoUnidade = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		valorRecebido = sc.nextDouble();
		
		if(precoUnidade * quantidade > valorRecebido) {
			faltam = precoUnidade * quantidade - valorRecebido;
			System.out.printf("Dinheiro insuficiente. faltam %.2f\n", faltam);
		}
		else {
		    troco = (precoUnidade * quantidade) - valorRecebido;
		    System.out.printf("TROCO = %.2f\n", troco);
		}
		
		sc.close();

	}

}
