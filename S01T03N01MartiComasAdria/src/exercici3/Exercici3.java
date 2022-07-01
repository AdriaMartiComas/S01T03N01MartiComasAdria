package exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> paisos = new ArrayList<String>();
		HashMap<String, String> paisosCapitalsHashMap = new HashMap<String, String>();
		
		int n, punts = 0;
		String capital, pais, resultat;
		
		importTxt(paisosCapitalsHashMap, paisos);
		
		System.out.println("Introdueix el teu nom: ");
		String nom = sc.nextLine();
		System.out.println("Endevina les capitals de 10 paisos:");
		
		int size = paisos.size();
		for (int i = 0; i < 10; i++) {
			n = (int) ((Math.random() * size));
			pais = paisos.get(n);
			System.out.println(pais);
			capital = sc.nextLine();
			
			if (capital.equalsIgnoreCase(paisosCapitalsHashMap.get(pais))) {
				System.out.println("Correcte!\n");
				punts++;
			} else {
				System.out.println("No és correcte, la capital de "+pais+" és: "+paisosCapitalsHashMap.get(pais)+"\n");
			}
			
			paisos.remove(n);
			size--;
		}
		
		resultat = "La puntuació de "+nom+" és: "+punts;
		System.out.println(resultat);
		
		exportTxt(resultat);
		
		

	}
	
	public static void exportTxt(String resultat) {
		
		try {
			BufferedWriter sortida = new BufferedWriter(new FileWriter("classificacio.txt") );
			sortida.write(resultat);
			sortida.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void importTxt(HashMap<String, String> paisosCapitalsHashMap, ArrayList<String> paisos) {

		try {
			BufferedReader inputText = new BufferedReader(new FileReader("Countries.txt"));
			String linea, pais, capital;

			while ((linea = inputText.readLine()) != null) {
				pais = linea.split(" ")[0];
				capital = linea.split(" ")[1];
				paisosCapitalsHashMap.put(pais, capital);
				paisos.add(pais);

			}
			inputText.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
 * Donat el fitxer countrties.txt (revisa l'apartat recursos) que conté països i
 * capitals. El programa ha de llegir el fitxer i guardar les dades en un
 * HashMap<String, String>.
 * 
 * El programa demana el nom de l’usuari/ària, i després ha de mostrar un país
 * de forma aleatòria, guardat en el HashMap. Es tracta de què l’usuari/ària ha
 * d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma
 * un punt. Aquesta acció es repeteix 10 vegades. 
 * 
 * Un cop demanades les capitals
 * de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer
 * anomenat classificacio.txt, el nom de l’usuari/ària i la seva puntuació.
 */