package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class mapTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nombres = llenarNombres();
//		System.out.print(nombres.size());
		// nombres.forEach(n -> System.out.print(n + " "));

		Map<String, Integer> nombresEdad = new HashMap<>();
		nombres.forEach(n -> nombresEdad.put(n, generarEdad()));
		// System.out.print(nombresEdad.values());
		// System.out.print(nombresEdad.keySet());
		// Imprimimos el Map con un Iterador
		Iterator it = nombresEdad.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + nombresEdad.get(key));
		}

	}

	public static List<String> llenarNombres() {
		String nombresText = "Andres Berta Carlos Deysi Elena Fausto";
		StringBuilder nombresDos = new StringBuilder("Gabriel Hilda Ines Juan");
		List<String> nombresArray = new ArrayList<String>(Arrays.asList(nombresText.split(" ")));
		String[] temp = nombresDos.toString().split(" ");

		for (int i = 0; i < temp.length; i++) {
			nombresArray.add(temp[i]);
		}

		return nombresArray;
	}

	public static Integer generarEdad() {
		Random r = new Random();
		return r.nextInt((100 - 1) + 1) + 1;
	}

}
