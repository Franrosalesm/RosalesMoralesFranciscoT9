package exceptions;

@SuppressWarnings("serial")
//La Excepcion que hemos lanzado en la clase gen�rica hereda de NullPointerException
public class ElementNotAllowedException extends NullPointerException {
	
	public ElementNotAllowedException(String msg)  {
		super("[TU SUPEREXCEPTION]: " + msg);
	}
}
