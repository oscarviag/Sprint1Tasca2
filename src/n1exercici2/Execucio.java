package n1exercici2;

public class Execucio {

	public static void main(String[] args) {
		
		String nom=null;
		
		try {
			
			nom.length();
		}
		
		catch (Exception e) {
			
			System.out.println("Missatge d'error: " + e.getMessage() + "\nTipus d'error: " + e.getCause());
		}
	}

}
