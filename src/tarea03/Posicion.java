package tarea03;


/**
 * @author john
 * 
 * Creamos la clase posicion y definimos los atributos
 * fila y columna. No se utilizan tildes en los comentarios
 * expresamente para evitar errores en la generacion de los Javadoc
 */

public class Posicion {
	
	private int fila;
	private char columna;
	
	public Posicion (int fila, char columna) {
		
		if((fila >= 1 && fila <= 8) && (columna >= 97 && columna <= 104)) {
			
			this.fila = fila;
			this.columna = columna;
			
		}else {
			
			System.out.printf("Error, ha introducido valores no válidos o fuera del rango");
			System.out.printf("Se establecerá el valor \"1\" para la fila y el valor \"a\" para la columna.");
			this.fila = 1;
			this.columna = 'a';
			
		}
	}
	
	/**
	 * Creamos los metodos set y get
	 */
	
	/**
	 * Creamos el metodo setFila y comprobamos que el dato 
	 * pasado por paramtero se encuentra en el rango 1 - 8
	 * @param fila
	 */
		
	public void setFila(int fila) {
			
		if(fila >= 1 && fila <= 8) {
				
			this.fila = fila;
				
		}else {
				
			System.out.printf("Error, ha introducido valores no válidos o fuera del rango");
			System.out.printf("Se establecerá el valor \"1\".");
			this.fila = 1;
				
		}
			
	}
	
	/**
	 * Creamos el metodo setColumna y comprobamos que el dato
	 * pasado por parametro se encuentra entre el rango 'a'-'h'
	 * @param columna
	 */
		
	public void setColumna(char columna) {
		
		if (columna >= 97 && columna <= 104) {
				
			this.columna = columna;
				
		}else {
				
			System.out.printf("Error, ha introducido valores no válidos o fuera del rango");
			System.out.printf("Se establecerá el valor \"a\".");
			this.columna = 'a';
				
		}
			
	}
	
	/**
	 * Se declara el metodo getFila 
	 * @return fila
	 */
	
	public int getFila() {
			
		return fila;
			
	}
	
	/**
	 * Se declara el metodo getColumna
	 * @return
	 */
		
	public char getColumna() {
			
		return columna;
			
	}
	
	/**
	 * Declaramos un metodo toString que devuelve las coordenadas
	 * fila y columna
	 */
	
	public String toString() {
		
		return "Las coordenadas son: " + fila + " " + columna;
		
	}
		
}
