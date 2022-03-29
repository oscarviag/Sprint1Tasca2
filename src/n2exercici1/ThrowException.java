package n2exercici1;

public class ThrowException {
	
	public static void f() throws Exception {
		
		System.out.println("Mètode f() de la classe ThrowException executat");
				
		try {
			
			g();
			
		}
		catch (ParellException e){
			
			System.out.println(e.getMessage());
			System.out.println("Generem Nova Excepció");
			throw new Exception("Nova excepció generada");
		}
		
		
	}
	
	public static void g() throws ParellException {
		
		System.out.println("Mètode g() de la classe ThrowException executat");
		NombreParell nombre = new NombreParell(1);
	}

}
