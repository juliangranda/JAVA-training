package reto2;

public class Estudiantes {
	
	//atributos
	private String nombre;
	private int numero_carne;
	private int numero_creditos;
	private int valor_credito;
	private float descuento;
	
	
	public Estudiantes(){
		
		nombre ="";
		numero_carne = 0;
		numero_creditos = 0;
		valor_credito = 0;
		descuento = 0;
	}
	
	public Estudiantes(String nombre, int numero_carne, int numero_creditos, int valor_credito, float descuento) {
		this.nombre = nombre;
		this.numero_carne = numero_carne;
		this.numero_creditos = numero_creditos;
		this.valor_credito = valor_credito;
		this.descuento = descuento;
	}

	
	public int matricula() {
		int precio = 0;
		float precio_total = 0;

		precio = (this.numero_creditos * this.valor_credito);
		precio_total = precio - precio*(this.descuento / 100);
		return (int)precio_total;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumero_carne() {
		return numero_carne;
	}



	public void setNumero_carne(int numero_carne) {
		this.numero_carne = numero_carne;
	}



	public int getNumero_creditos() {
		return numero_creditos;
	}



	public void setNumero_creditos(int numero_creditos) {
		this.numero_creditos = numero_creditos;
	}



	public int getValor_credito() {
		return valor_credito;
	}



	public void setValor_credito(int valor_credito) {
		this.valor_credito = valor_credito;
	}



	public float getDescuento() {
		return descuento;
	}



	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Estudiantes [nombre=" + nombre + ", numero_carne=" + numero_carne + ", numero_creditos="
				+ numero_creditos + ", valor_credito=" + valor_credito + ", descuento=" + descuento + ", matricula()="
				+ matricula() + "]";
	}
	



	
	

	
}
