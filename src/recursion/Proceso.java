package recursion;
//La siguiente clase realiza los procesos del programa , formando el backend de la aplicación

public class Proceso {

	
	private int[] num;
	
	
StringBuffer array = new StringBuffer();
	
	Proceso(int[] copiado){
	

		this.num = copiado;
visualizar();
	}
	
	
	private void visualizar (){
		
		
		for(int va : num){
			
			array.append(("|" + String.valueOf(va)) + "|");
			
		}
		
		System.out.println(array);
	}
	
	
	
	
	
	private void creciente(){
		
		
		
		
		
		
		
		
	}
	
	private void decreciente(){
		
	}
	
	

	
	
}
