package capituloTres;

import java.io.IOException;

public class ConvertLetra {

	public static void main(String[] args) throws IOException {
		
		char receberValor;
		int  mudar = 0;
		System.out.println("pressione '.' para parar. ");
		
		do {
			
			receberValor = (char) System.in.read();
			
			if (receberValor >= 'a' & receberValor <= 'z') {
				receberValor -= 32;
				mudar++;
				System.out.print(receberValor);
			}else if(receberValor >= 'A' & receberValor <= 'Z'){
				receberValor += 32;
				mudar++;
				System.out.print(receberValor);
			}
			
			
		} while (receberValor != '.');
		
		System.out.print(mudar);

	}

}
