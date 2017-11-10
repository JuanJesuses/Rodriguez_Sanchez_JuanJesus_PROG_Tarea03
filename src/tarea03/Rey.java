package tarea03;

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
	
	public Color getColor() {
		
		return color;
		
	}
	
	public Posicion getPosicion() {
		
		return posicion;
		
	}
	
	public String toString() {
		
		return "El rey " + color + " se encuentra en la posición " + posicion;
		
	}
	
	public void mueve(int fila, char columna) {
		
		while((fila < 1 || fila > 8) && (columna < 97 || columna > 104)) {
		
			System.out.println("Los parámetros introducidos están fuera del rango establecido.");
			System.out.print("El valor para la fila debe estar comprendido entre 1 y 8.");
			System.out.println("El valor para la columna debe estar comprendido entre \'a' y \'h'.");
			
		}
		
		posicion = new Posicion(fila, columna);
		
	}
	
}
