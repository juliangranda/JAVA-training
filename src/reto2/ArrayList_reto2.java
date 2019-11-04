package reto2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		int numero_carne;
		int numero_creditos;
		int valor_credito;
		float descuento;
		int tamaño;
		int matriculaMasAlta = 0;
		int carnetMatriculaMasAlta = 0;
		
		
		//Estudiantes estudiante = new Estudiantes();
		List<Estudiantes> miLista = new ArrayList();
		
		Scanner scaner = new Scanner(System.in);
		System.out.println("ingrese numero de estudiantes: ");
		tamaño = scaner.nextInt();
		
		Estudiantes estudiante = new Estudiantes();
		for (int i = 0; i < tamaño; i++) {
			
			System.out.println("escriba nombre estudiante");
			nombre = scaner.next();
			estudiante.setNombre(nombre);
			
			System.out.println("escriba numero_carne estudiante");
			numero_carne = scaner.nextInt();
			estudiante.setNumero_carne(numero_carne);
			
			System.out.println("escriba numero_creditos estudiante");
			numero_creditos = scaner.nextInt();
			estudiante.setNumero_creditos(numero_creditos);
			
			System.out.println("escriba valor_credito estudiante");
			valor_credito = scaner.nextInt();
			estudiante.setValor_credito(valor_credito);
			
			System.out.println("escriba descuento estudiante");
			descuento = scaner.nextFloat();
			estudiante.setDescuento(descuento);
			
			Estudiantes datos = new Estudiantes(nombre, numero_carne, numero_creditos, valor_credito, descuento);
			miLista.add(datos);
			System.out.println(miLista.get(i));
			
		}

		
		System.out.println("-----------------");
		

		
		
		for (int i = 0; i < miLista.size(); i++) {
			
			System.out.println("matricula estudiante: "+ miLista.get(i).getNombre() + " es del valor de : "+ miLista.get(i).matricula());
			if(miLista.get(i).matricula() > matriculaMasAlta) {
				matriculaMasAlta = miLista.get(i).matricula();
				carnetMatriculaMasAlta = miLista.get(i).getNumero_carne();
			}
		}
		System.out.println("la matricula mas alta es de : " + carnetMatriculaMasAlta);
		

        for(int x=0;x<miLista.size();x++) {
			System.out.println( miLista.get(x).toString());
      	}
		

	}

}
