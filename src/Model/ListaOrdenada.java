package Model;

import java.util.Comparator;
import java.util.List;
import java.util.Collection;
import java.util.Collections;

import exceptions.ElementNotAllowedException;
import exceptions.ListSizeOverflownException;
import java.util.ArrayList;


//ListaOrdenada hereda los de ArrayList, para as� poder implementar los m�todos de �sta colecci�n.
public class ListaOrdenada<E> extends ArrayList<E> {
	//Atributos

      private byte max_size=100;

     public ListaOrdenada(Comparator<E> comp) {
		super();
	}
    //Comportamiento, m�todos

     //La funcion add comprueba si el objeto que le pasamos por par�metro sobrepasa el tama�o l�mite que hemos declarado como constante
	@Override
 	public boolean add(Object element){
    
	
 		if (element != null) {
 			if (this.size() <= max_size) {
 				return super.add((E) element);
 			} else {
 				try {
					throw new ListSizeOverflownException("La cola est� llena!");
				} catch (ListSizeOverflownException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			}
 		} else {
 			throw new ElementNotAllowedException("No acepto valores null!");
 		}
		return false;
	}
	
	//Borramos el elemento de la lista
	@Override
 	public boolean remove(Object element){
    
	
 		if (element != null) { 		
 				return super.remove((E) element);
 			} else {
 				try {
					throw new ListSizeOverflownException("La cola est� llena!");
				} catch (ListSizeOverflownException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
 			}
 		
 			throw new ElementNotAllowedException("No acepto valores null!");
 		}





 	public void min(){
 		
 	}
 	//Para ordenar inversamente los objetos del array,
 	// es decir, como el enunciado decia que se odenaba descendientemente, ahora se ordena ascendentemente
	public void reverse(Object element)  {
		
				Collections.sort(lista, (Object a, Object b) -> a-b);
 		}
}

 	

 	

