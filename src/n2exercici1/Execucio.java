package n2exercici1;

public class Execucio {

	public static void main(String[] args){
		
		try {
		
			ThrowException.f();
		}
		catch (Exception e){
			
			System.out.println(e.getMessage());
			System.out.println("Recollim Nova Excepció Generada");
		}

	}

}
