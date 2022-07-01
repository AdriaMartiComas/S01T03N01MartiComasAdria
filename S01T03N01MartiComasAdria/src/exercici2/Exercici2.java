package exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Exercici2 {

	public static void main(String[] args) {
		//Llista ordenada menor a major
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i<10; i++) {
			numeros.add(i+1);
		}
		System.out.println(numeros);
		
		
		//Llista ordenada major a menor
		List<Integer> numerosInvers = new ArrayList<Integer>();
		ListIterator<Integer> it = numeros.listIterator(numeros.size());

		while (it.hasPrevious()) {
			numerosInvers.add(it.previous());	
		}
		System.out.println(numerosInvers);

	}

}
