package n1exercici3;

public class Execucio {

	public static void main(String[] args) {

		int[] llista = {0,1};
		
		try {
			
			System.out.println(llista[2]);
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("S'ha intentat accedir una posició de l'array que no existeix\n" + e.getMessage());
		}
		
	}

}
