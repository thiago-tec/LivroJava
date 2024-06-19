package capituloDois;

import java.util.Scanner;

public class ErroDivisaoPorZero {
	

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int divisao;
		int valor = 0;
		String resposta;


		do {
			System.out.print("Qual valor que vai ser do dividendo ?\n");
			valor = entrada.nextInt();
			
			System.out.print("Qual valor do divisor ?\n");
			divisao = entrada.nextInt();
		
			
			if (valor == 0) {
				System.out.println("não podemos executar divisão por 0 ");
			}else {
				int resultado = divisao / valor;
				System.out.println("resultado: " + resultado);
			}
			
			System.out.println("quer dividir outro valor ?");
			resposta = entrada.next();
			System.out.println();

		} while (resposta.equalsIgnoreCase("sim"));

		entrada.close();

	}

}
