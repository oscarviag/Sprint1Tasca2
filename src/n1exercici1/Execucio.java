package n1exercici1;

public class Execucio {

	public static void main(String[] args) {
		
		int numero;

		try {
			
			numero=10/0;
			
		}
		catch (Exception e){
			
			System.err.println("Missatge d'error: " + e.getMessage());
		}
		
		finally {
			
			System.out.println("Bloc finally");
			
		}
		
		
	}

}
