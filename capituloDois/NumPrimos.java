package capituloDois;

public class NumPrimos {

	public static void main(String[] args) {
		
	
		int RestoDivisao; //ele vai pegar o modulo
		int primo= 0;//ele inicializa a variavel primo
		
	
		for (int i = 1; i <= 100 ; i++) {
			for (int j = 2; j < i ; j++) {
				
				RestoDivisao = i % j; // pegando o modulo(resto)
				
				if (RestoDivisao == 0) {
					primo++; //se o resto for igual a 0 add 1 no numero primo
				}
			}
			
			if (primo == 2) { //quando sair do 2 laço for ele vai ser igual a 2 e se for igual a 2 ele vai imprimir o primo
				System.out.println(i);
				
			}
			primo = 0; //aqui é quando sair do if ele vai voltar pro laço com o a inicilização de 2 no primo até o laço acabar
		}
		
		

	}

}
