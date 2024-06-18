package capituloUm;

import java.util.Scanner;

public class TesteCapituloUm {
	
	public static void main(String[] args) {
		
		double pesoTerra, pesoLua;
		
		pesoTerra = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("qual seu peso ?");
		pesoTerra = entrada.nextDouble();
		pesoLua = pesoTerra * 1.6;
		
		System.out.println("\nseu peso na lua é: "+ pesoLua);
		
		entrada.close();
	}
	
	

}
