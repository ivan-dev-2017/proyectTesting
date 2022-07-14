package ejemplos;

public class Palindromo {
	
	public static String palabra = "012210";
	
	static String palindromo(String palabra) {
		String control = "Palíndromo";
		if(palabra instanceof String) {
			int tam = 0;
			int aux_decremento = palabra.length() - 1;
			
			
			if(palabra.length() % 2 == 0) {
				tam = palabra.length()/2;
			}
			else {
				tam = (palabra.length() -1)/2;
			}
			for(int i=0; i<tam; i++) {
				if(palabra.charAt(i) != palabra.charAt(aux_decremento)) {
					control = "No es Palíndromo";
				}
				aux_decremento -= 1;				
			}			
		}
		
		return control;
	}
		
	public static void main(String[] args) {
		
		System.out.println(Palindromo.palindromo(Palindromo.palabra));
		

	}

}
