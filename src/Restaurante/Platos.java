package Restaurante;

public class Platos {
	
	private String nombre;
	private Ingredientes[] Ingredientes;
	private double precio;
	
	public Platos(String nombre, Restaurante.Ingredientes[] ingredientes, double precio) {
		super();
		this.nombre = nombre;
		Ingredientes = ingredientes;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ingredientes[] getIngredientes() {
		return Ingredientes;
	}

	public void setIngredientes(Ingredientes[] ingredientes) {
		Ingredientes = ingredientes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
