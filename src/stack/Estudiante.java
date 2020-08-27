package stack;



public class Estudiante {
	
	
	String estudiantes []= {"Juan", "Pablo", "Oscar", "David"};

		float pagos []=  {2,4,6,8};

	
	int suma = 0;	
	float promedio; 
	
	float CalcularPromedio() {
		float resultado = 0;
		 for(int i = 0 ; i < pagos.length; i++) {
			suma += pagos[i];
		 }
		 resultado = suma/pagos.length;
		 promedio = resultado;
		return resultado; 

	}   
	
	float CalcularMayor() {
		float mayor = 0;
		
		for(int j = 0 ;  j < pagos.length; j++) {
			
			if(pagos [j] > mayor) {
				mayor = pagos [j];
			}
		}		
		
		return mayor;
		
	}
	
	
	float CalcularDiferencia() {
		float diferencia = 0;
		 
		diferencia = CalcularMayor() - promedio;
		
		System.out.println("Diferencia: " + diferencia);
		return diferencia;
	} 
	
	
}// fin


