package capituloUm;

public class ExercicioDois {
	
	public static void main(String[] args) {
		
		//exercicio 1-2
		
		double galao, litros;
		int contador;
		
		contador = 0;
		
		for (galao = 1; galao <= 30; galao++) {
			litros = galao * 3.7854; //coverte para litros
			System.out.printf(galao + " galão é %.2f litros\n", litros);
			
			contador++;
			
			if(contador == 10) {
				System.out.println("\n---- corta em 10 linhas ----\n");
				contador = 0;
			}
		}
		
		
		
	}

}
