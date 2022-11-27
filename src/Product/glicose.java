package Product;

import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		double glicose;
		
		System.out.print("Digite a media da glicose: ");
		glicose = sc.nextDouble();
		
		System.out.print("Classificaçao: ");
		
		if(glicose <= 100) {
			System.out.println("Normal");	
		}
		else if (  glicose <= 140) {
				System.out.println("Elevado");	
			}
		    else {
						System.out.println("Diabete");
					}
		
		sc.close();

	}

}
