package n1exercici4;

public class Execucio {

	public static void main(String[] args) {
		
		try {
			
			NombreParell nombre = new NombreParell(1);
			System.out.println("Has introduït un nombre parell correctament");
		}
		
		catch (ParellException e) {
			
			System.err.println(e.getMessage());
		}

	}

}
