package capituloCinco;

public class exercicosFimCapitulo {
	
	public static void main(String[] args) {
		

		//exercico 1
		
		
		double SegundaForma[] = new double[12];
		double[] TerceiraForma = new double[12];
		
		//exercico 2
		
		System.out.println("\nexercicio 2");
		
		double ArrayDouble[] = {1.1,1.2,1.3,1.4,1.5};
		
		for (int i = 0; i < ArrayDouble.length; i++) {
			System.out.print(ArrayDouble[i] + " ");
		}
		
		System.out.println();
		
		//exercicio 3
		
		System.out.println("\nexercicio 3");
		
		for (int i = 0; i < ArrayDouble.length; i++) {
			double a = 0;
			
			a += ArrayDouble[i];
			System.out.println("nums dentro do array " + i + " = " + a / ArrayDouble.length);
		}
		
		//exercicio 6
		
		System.out.println("\nexercicio 6");
		
		String str = new String("i like java");
		System.out.println(str.length());
		System.out.println(str.charAt(10));
		
		//exercicio 9
		
		// y = x < 0 ? 10 : 20;
		
		//exercicio 13
		
		System.out.println("\nexercicio 13");
		
		int nums[] = new int[10]; 
	    int min, max; 
	 
	    nums[0] = 99; 
	    nums[1] = -10; 
	    nums[2] = 100123; 
	    nums[3] = 18; 
	    nums[4] = -978; 
	    nums[5] = 5623; 
	    nums[6] = 463; 
	    nums[7] = -9; 
	    nums[8] = 287; 
	    nums[9] = 49; 
	 
	    min = max = nums[0]; 
	    // Use a for-each style for loop.
	    for(int v : nums) { 
	      if(v < min) min = v; 
	      if(v > max) max = v; 
	    } 
	    System.out.println("min and max: " + min + " " + max); 
	  }  
		
	
	

}
