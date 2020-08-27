package stack;

public class Program {

	public static void main(String[] args) {
		
		Estudiante es = new Estudiante();
		
		System.out.println("promedio " + es.CalcularPromedio());
		System.out.println("mayor es " + es.CalcularMayor());
		es.CalcularDiferencia();
	
			

	}

}
