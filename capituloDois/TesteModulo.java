package capituloDois;

import java.util.Scanner;

public class TesteModulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String resposta;
		do {
		
		int dividendo;
		int divisor;
		
		System.out.print("dividendo:");
		dividendo = entrada.nextInt();
		
		System.out.print("divisor:");
		divisor = entrada.nextInt();
		
		int modulo = dividendo % divisor;
		int divisao = dividendo / divisor;
		
		System.out.println("o resto da divisão de " + dividendo + " % " + divisor + " é: " + modulo );
		System.out.println("o valor divisão de " + dividendo + " / " + divisor + " é: " + divisao );
		
		System.out.println("quer digitar outro valor ? ");
		 resposta = entrada.next();
		
		} while (resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s"));
		
		entrada.close();
	}

}
