package n2exercici2;

public class NombreParell {
	

	public NombreParell(int nombre) throws ParellException{
		
		if ((nombre%2)!=0) {
			
			throw new ParellException(nombre + " no es un nombre parell");
		}
	}
	
	

}
