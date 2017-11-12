package tarea03;

import utilidades.Entrada;

public class Principal {

	public static void main(String[] args) {
		
		char color;
		Rey rey;
		int menu = 0;
		int celda;
		
				
		
		do {
			
			System.out.println("  *********************************************");
			System.out.println("  **Bienvenido al programa Movimiento del Rey**");
			System.out.println("  *********************************************");
			System.out.println("");
			System.out.println("Elige un color para tu Rey (b para Blanco o n para Negro):");
			System.out.println("");
			
			color = Entrada.caracter();
		
			if(color == 'b') {
				rey = new Rey(Color.BLANCO);
			}else {
				rey = new Rey(Color.NEGRO);
			}
				
		}while (color != 'b' && color != 'n');
		
		do {
			
			System.out.println("");
			System.out.println("Elige una opción: ");
			System.out.println("1. Mueve el Rey");
			System.out.println("2. Obtén información del Rey");
			System.out.println("3. Salir del programa");
			
			menu = Entrada.entero();
			
			switch (menu) {
				
				case 1:
					
					do {
						System.out.println("");
						System.out.println("Introduce el numero según el movimiento que quieras realizar: ");
						System.out.println("1. SUBIR UNA CELDA");
						System.out.println("2. BAJAR UNA CELDA");
						System.out.println("3. DESPLAZAR UNA CELDA A LA DERECHA");
						System.out.println("4. DESPLAZAR UNA CELDA A LA IZQUIERDA");
						System.out.println("5. DESPLAZAR UNA CELDA ARRIBA A LA DERECHA");
						System.out.println("6. DESPLAZAR UNA CELDA ARRIBA A LA IZQUIERDA");
						System.out.println("7. DESPLAZAR UNA CELDA ABAJO A LA DERECHA");
						System.out.println("8. DESPLAZAR UNA CELDA ABAJO A LA IZQUIERDA");
						
						celda = Entrada.entero();
						
						switch(celda) {
							
							case 1:
								rey.mueve(Direccion.NORTE);
								break;
							case 2:
								rey.mueve(Direccion.SUR);
								break;
							case 3:
								rey.mueve(Direccion.ESTE);
								break;
							case 4:
								rey.mueve(Direccion.OESTE);
								break;
							case 5:
								rey.mueve(Direccion.NORESTE);
								break;
							case 6:
								rey.mueve(Direccion.NOROESTE);
								break;
							case 7:
								rey.mueve(Direccion.SURESTE);
								break;
							case 8:
								rey.mueve(Direccion.SUROESTE);
								break;
						}//Fin del switch
						
					}while(celda < 1 || celda > 8);
					
				case 2:	
					
					System.out.println(rey.toString());
					break;
					
			}//Fin del switch
						
		}while (menu > 0 && menu < 3);
			
	}	

}
