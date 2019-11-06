package reto1_y_reto2;

import java.util.Scanner;

public class reto1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		
		//preguntamos al usuario tamaño del vector
		//pedimos un valor de entrada al usuario
		Scanner escaner = new Scanner(System.in);	
		System.out.println("ingresa el tamaño del vector: ");
		
		try {
			
			//recibimos un entero
			int tamañoVector = escaner.nextInt();
			//System.out.println("el tamaño del vector es: " + tamañoVector);
			
			//creamos el vector
			int[] vector = new int[tamañoVector];
			
			//recorremos y llenamos el vector 
			for (int i = 0; i < vector.length; i++) {

				//generacion de numero aleatorio entre 1-10
				int aleatorio = (int) (Math.random()*10);
				//System.out.println("numero aleatorio es:" + aleatorio);
				
				vector[i] = aleatorio;
				//System.out.println("valor en posicion "+ i +" es "+ vector[i]);
				
				contador += 1;
			}
			System.out.println("tamaño del vector:" + contador);
			for (int i = 0; i < vector.length; i++) {
				System.out.println("valor en posicion "+ i +" es "+ vector[i]);
			}
			
		}catch(Exception e){
			System.out.println("usuario NO ingreso un numero entero");
		}

		
	}
}
