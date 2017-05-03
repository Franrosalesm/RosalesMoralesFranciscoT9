package Test;

import java.util.ArrayList;
import Model.ListaOrdenada;

public class Main {

	public static void main(String[] args) {
	
		//Creamos una lista de arrays, donde añadiremos datos de tipo ListaOrdenada
		ArrayList<Integer> lista= new ArrayList<Integer>();
		lista.add(9);
		lista.add(6);
		lista.add(8);
		lista.add(4);
		
		lista.sort(null);
		((ListaOrdenada) lista).reverse(lista);
		lista.remove(3);
		//Mostramos la lista
		System.out.println(lista);
		

	}

}
