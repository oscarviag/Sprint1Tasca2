package n2exercici2;

public class ThrowException {
	
	public static void f() {
		
		System.out.println("Mètode f() de la classe ThrowException executat");
		
		try {
			try {
			
				g();
			
			} catch (ParellException e) {
			
				System.out.println(e.getMessage());
			}
		} catch (RuntimeException ex) {
			
			System.out.println("Excepcio Runtime: " +ex.getMessage());
		}
					
	}
	
	public static void g() throws ParellException {
		
		System.out.println("Mètode g() de la classe ThrowException executat");
		NombreParell nombre = new NombreParell(1);
	}

}
