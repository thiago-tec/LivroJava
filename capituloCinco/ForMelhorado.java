package capituloCinco;

public class ForMelhorado {

	public static void main(String[] args) {
		int melhorado[] = {0,1,2,3,4,5,6,7,8,9};
		
		
		
		for (int i = 1; i <= melhorado.length; i++) {
			
			System.out.println("\nTabuada do " + i);
						
			for (int j = 0; j <= 10; j++) {
				int resultado = i * j;
				
				System.out.println(i + " x " 
				+ j + " = " + resultado);
				
			}
		}
		
	}
}
