package Restaurante;

public class Domiciliario {
	
	private String nombre;
	private int numPedidos;
	private boolean disponibilidad;
	
	public Domiciliario(String nombre, int numPedidos, boolean disponibilidad) {
		super();
		this.nombre = nombre;
		this.numPedidos = numPedidos;
		this.disponibilidad = disponibilidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumPedidos() {
		return numPedidos;
	}
	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
}
