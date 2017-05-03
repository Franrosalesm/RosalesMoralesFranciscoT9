package exceptions;

@SuppressWarnings("serial")
//La excepcion que hemos lanzado en la clase genérica hereda de exception
public class ListSizeOverflownException extends Exception {
	
	public ListSizeOverflownException(String msg)  {
		super("[TU SUPEREXCEPTION]: " + msg);
	}

}
