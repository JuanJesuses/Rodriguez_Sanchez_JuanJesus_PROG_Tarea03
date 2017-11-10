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
	
}
