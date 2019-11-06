package reto1_y_reto2;

import java.util.Scanner;

public class reto2 {
	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);	
		
		System.out.println("ingresa el tamaño del vector: ");
		int tamañoAgenda = escaner.nextInt();

		String[] agenda = new String[tamañoAgenda];	

		for (int i = 0; i < agenda.length; i++) {
			System.out.println("ingrese el nombre de la persona: ");
			agenda[i] = escaner.next();
			
		}
		
		System.out.println("solicite el nombre a buscar: ");
		String nombrePersona = escaner.next();
		
		int index = 0;
		index = buscarNombre(agenda, nombrePersona);
		System.out.println("la posicion de nombre ingresado es: "+ index + " en el vector");
	}
	
	public static int buscarNombre(String[] agenda , String nombrePersona) {
		int posicion = 0;
		for (int i = 0; i < agenda.length; i++) {
			if(agenda[i].equals(nombrePersona)){
				posicion = i;
			}
		}
		return posicion;
	}
	
	

}
