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
	 * El metodo getColor devuelve una variable de tipo Color
	 * que indica el color del objeto
	 * @return color
	 */
	public Color getColor() {
		
		return color;
		
	}
	
	/**
	 * El metodo getPosicion devuelve una variable de tipo Posicion
	 * que determina la posicion del objeto
	 * @return posicion
	 */
	public Posicion getPosicion() {
		
		return posicion;
		
	}
	
	/**
	 * Este metodo toString devuelve una cadena 
	 * que representa el objeto
	 */
	public String toString() {
		
		return "El rey " + color + " se encuentra en la posición " + posicion;
		
	}
	
	
	/**
	 * El metodo mueve actualiza la posicion del objeto a traves de los parametros
	 * @param fila
	 * @param columna
	 */
	public void mueve(int fila, char columna) {
		
		while((fila < 1 || fila > 8) && (columna < 97 || columna > 104)) {
		
			System.out.println("Los parámetros introducidos están fuera del rango establecido.");
			System.out.println("El valor para la fila debe estar comprendido entre 1 y 8.");
			System.out.println("El valor para la columna debe estar comprendido entre \'a' y \'h'.");
			
		}
		
		posicion = new Posicion(fila, columna);
		
	}
	
}
