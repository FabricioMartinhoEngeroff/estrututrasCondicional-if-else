package Product;

import java.util.Locale;
import java.util.Scanner;

public class aproveitamentoNota {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String aproveitamento = "";
		if(media >= 9 && media <= 10) {
			aproveitamento = "a";
		}else if (media >= 7.5 && media < 9) {
			aproveitamento = "b";
		}else if (media >= 6 && media < 7.5) {
				aproveitamento = "c";
		}else if (media >= 4 && media < 6) {
			aproveitamento = "d";
		}else if (media >= 4 && media < 4) {
			aproveitamento = "e";
		}
		
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("media : " + media);
		System.out.println("Conceito : " + aproveitamento);
		
		switch(aproveitamento) {
		case "a":
		case "b":
		case "c" : System.out.println("APROVADO"); break;
		case "d":
		case "e": System.out.println("REPROVADO"); 
		
		}
		
		sc.close();

	}

}
