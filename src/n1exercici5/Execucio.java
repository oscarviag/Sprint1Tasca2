package n1exercici5;

import java.util.Scanner;

public class Execucio {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		boolean repetir = true;
		
		while(repetir) {
			
			try {
				System.out.println("Introdueix un n�mero enter");
				numero=entrada.nextInt();
				repetir = false;
				
			}
			catch (Exception e) {
				
				System.out.println("No s'ha introdu�t un numero enter");
				entrada.next();
			}
		}
		
		System.out.println("\nPerfecte, moltes gr�cies");

	}

}
