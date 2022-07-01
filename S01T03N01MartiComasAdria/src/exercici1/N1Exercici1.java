package exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class N1Exercici1 {

	public static void main(String[] args) {
		
		//ARRAY LIST 
		ArrayList<Month> mesos = new ArrayList<Month>();

		Month mes1 = new Month("Gener");
		Month mes2 = new Month("Febrer");
		Month mes3 = new Month("Març");
		Month mes4 = new Month("Abril");
		Month mes5 = new Month("Maig");
		Month mes6 = new Month("Juny");
		Month mes7 = new Month("Juliol");
		Month mes9 = new Month("Setembre");
		Month mes10 = new Month("Octubre");
		Month mes11 = new Month("Novembre");
		Month mes12 = new Month("Desembre");
		
		mesos.add(mes1);
		mesos.add(mes2);
		mesos.add(mes3);
		mesos.add(mes4);
		mesos.add(mes5);
		mesos.add(mes6);
		mesos.add(mes7);
		mesos.add(mes9);
		mesos.add(mes10);
		mesos.add(mes11);
		mesos.add(mes12);
		

		System.out.println("ARRAY LIST");
		for (Month mes : mesos) {
			System.out.print(mes+ ", ");
		}
		System.out.println("");
		
		Month mes8 = new Month("Agost");
		mesos.add(7, mes8);
		
		for (Month mes : mesos) {
			System.out.print(mes+ ", ");
		}

		//HASH SET
		HashSet<Month> mesosHashSet = new HashSet<Month>(mesos);
				
		mesosHashSet.add(mes1);
		mesosHashSet.add(mes1);
		mesosHashSet.add(mes1);
		mesosHashSet.add(mes2);
		mesosHashSet.add(mes2);
		
		Iterator<Month> it = mesos.iterator();
		System.out.println("\n\nHASH SET");
		while (it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		
	}

}
