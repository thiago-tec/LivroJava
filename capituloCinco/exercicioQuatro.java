package capituloCinco;

public class exercicioQuatro {

	public static void main(String[] args) {
		
		String strs[] = {"esse","é","um","teste","de","uma","string","sortida"};
		
		int a,b;
		String t;
		int size;
		
		size = strs.length; // numero dos elementos a serem classificados
		
		//exibe o array original
		System.out.print("array original: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + strs[i]);
		}
		System.out.println();

		
		//essa é a classificao por bolha para strings
		for ( a= 1; a < size; a++) {
			for (b=size-1; b >= a; b--) {
				if (strs[b-1].compareTo(strs[b]) > 0) {//se tiver fora de ordem troca os elementos
					t = strs [b-1];
					strs[b-1] = strs[b];
					strs[b] = t;
				}
			}
		}
			//exibe o array classificado
			System.out.print("Array sortido: ");
			for (int i = 0; i < size; i++) {
				System.out.print(" " + strs[i]);
			}
			System.out.println();
	}

}
