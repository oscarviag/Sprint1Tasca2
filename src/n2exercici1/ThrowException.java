package n2exercici1;

public class ThrowException {
	
	public static void f() throws Exception {
		
		System.out.println("M�tode f() de la classe ThrowException executat");
				
		try {
			
			g();
			
		}
		catch (ParellException e){
			
			System.out.println(e.getMessage());
			System.out.println("Generem Nova Excepci�");
			throw new Exception("Nova excepci� generada");
		}
		
		
	}
	
	public static void g() throws ParellException {
		
		System.out.println("M�tode g() de la classe ThrowException executat");
		NombreParell nombre = new NombreParell(1);
	}

}
