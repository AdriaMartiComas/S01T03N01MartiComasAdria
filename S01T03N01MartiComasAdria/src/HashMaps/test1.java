package HashMaps;

import java.util.HashMap;

public class test1 {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		String linea = "estiu calor";
		String key;
		String value, aux;
		
		key = linea.split(" ")[0];
		value = linea.split(" ")[1];
		
		System.out.println(key);
		System.out.println(value);
		

		hashMap.put(key, value);
		
		aux = hashMap.get(key);
		System.out.println(aux);
		

	}

}
