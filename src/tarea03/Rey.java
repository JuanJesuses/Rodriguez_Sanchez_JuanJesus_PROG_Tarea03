package tarea03;
/**
 * Se crea la clase Rey con los atributos color de tipo Color
 * y posicion de tipo Posicion
 * @author john
 *
 */
public class Rey {
	
	private Color color;
	private Posicion posicion;
	
	public Rey (Color color) {
		
		this.color = color;
		
		switch (color) {
		
			case BLANCO:
				posicion = new Posicion(1, 'e');
				break;
			
			case NEGRO:
				posicion = new Posicion(8, 'e');
				break;
		}			
	}
	
	public Rey (){
		
		color = Color.BLANCO;
		posicion = new Posicion(1, 'e');
		
	}
	
	/**
	 * El método getColor devuelve una variable de tipo Color
	 * que indica el color del objeto
	 * @return color
	 */
	public Color getColor() {
		
		return color;
		
	}
	
	/**
	 * El método getPosicion devuelve una variable de tipo Posicion
	 * que determina la posición del objeto
	 * @return posicion
	 */
	public Posicion getPosicion() {
		
		return posicion;
		
	}
	
	/**
	 * Este método toString devuelve una cadena 
	 * que representa el objeto
	 */
	public String toString() {
		
		return "El rey " + color + " se encuentra en la posición " + posicion;
		
	}
	
	
	/**
	 * El método mueve actualiza la posición del objeto a través de los parámetros
	 * @param fila
	 * @param columna
	 */
	public void mueve(Direccion direccion) {
		
		int fila = posicion.getFila();
		int numeroColumna = posicion.getColumna();
		
		switch(direccion) {
		
			case NORTE:
				
				fila = posicion.getFila()-1;
				if (fila < 1) {
					System.out.println("No se puede mover el Rey hacia el Norte. Posición fuera de rango.");
					fila = posicion.getFila()+1;
				}
				break;
				
			case SUR:
				
				fila = posicion.getFila()+1;
				if (fila > 8) {
					System.out.println("No se puede mover el Rey hacia el Sur. Posición fuera de rango.");
					fila = posicion.getFila()-1;
				}
				break;
				
			case ESTE:
				
				numeroColumna = posicion.getColumna()+1;
				if (numeroColumna > 'h') {
					System.out.println("No se puede mover el Rey hacia el Este. Posición fuera de rango.");
					numeroColumna = posicion.getColumna()-1;
				}
				break;
			
			case OESTE:
				
				numeroColumna = posicion.getColumna()-1;
				if (numeroColumna < 'a') {
					System.out.println("No se puede mover el Rey hacia el Oeste. Posición fuera de rango.");
					numeroColumna = posicion.getColumna()+1;
				}
				break;
				
			case NORESTE:
				
				fila = posicion.getFila()-1;
				numeroColumna = posicion.getColumna()+1;
				if (fila < 1 || numeroColumna > 'h') {
					System.out.println("No se puede mover el Rey hacia el Noreste. Posición fuera de rango.");
					fila = posicion.getFila()+1;
					numeroColumna = posicion.getColumna()-1;
				}
				
			case NOROESTE:
				
				fila = posicion.getFila()-1;
				numeroColumna = posicion.getColumna()-1;
				if (fila < 1 ||  numeroColumna < 'a') {
					System.out.println("No se puede mover el Rey hacia el Noroeste. Posición fuera de rango.");
					fila = posicion.getFila()+1;
					numeroColumna = posicion.getColumna()+1; 
				}
			
			case SURESTE:
				
				fila = posicion.getFila()+1;
				numeroColumna = posicion.getColumna()+1;
				if (fila > 8 || numeroColumna > 'h') {
					System.out.println("No se puede mover el Rey hacia el Sureste. Posición fuera de rango.");
					fila = posicion.getFila()-1;
					numeroColumna = posicion.getColumna()-1;
				}
				
			case SUROESTE:
				
				fila = posicion.getFila()+1;
				numeroColumna = posicion.getColumna()-1;
				if(fila > 8 || numeroColumna < 'a') {
					System.out.println("No se puede mover el Rey hacia el Suroeste. Posición fuera de rango.");
					fila = posicion.getFila()-1;
					numeroColumna = posicion.getColumna()+1;
				}
		}//Fin del switch
		
	}//Fin del método mueve
}//Fin de la clase Rey