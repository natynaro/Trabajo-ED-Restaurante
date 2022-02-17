package Estructuras;

import java.util.Arrays;

public class AdminRest {
	
	//Atributos
	private Ingredientes[] ingredientesTotal;
	private Domiciliario[] domiciliarios;
	private int cantIngredientes;
	private int cantDomiciliarios;
	
	//Constructor
	public AdminRest() {
		
	}
	
	
	//Añadir ingrediente
	
	public void AddIngrediente(String nombre, int cantidad) {
		if(ingredientesTotal == null) {
			cantIngredientes = 1;
			ingredientesTotal = new Ingredientes[1];
			ingredientesTotal[0] = new Ingredientes(nombre,cantidad);
		}else {
			cantIngredientes++;
			ingredientesTotal = Arrays.copyOf(ingredientesTotal, cantIngredientes);
			ingredientesTotal[ingredientesTotal.length - 1] = new Ingredientes(nombre,cantidad);
		}
	}
	
	//Borrar ingrediente
	
	public void EliminarIngrediente(String nombre) throws EListaIngredientesNull, EListaIngredientesVacia, EIngredienteNoExiste {
		boolean seEncontroElIngrediente = false;
		if(ingredientesTotal != null) {
			if(ingredientesTotal.length > 0) {
				for(int i = 0; i<ingredientesTotal.length; i++) {
					if(nombre.compareTo(ingredientesTotal[i].getNombre()) == 0) {
						seEncontroElIngrediente = true;
						for(int u = i; u<ingredientesTotal.length - 1; u++) {
							ingredientesTotal[u] = ingredientesTotal[u+1];
						}
						cantIngredientes--;
						ingredientesTotal = Arrays.copyOf(ingredientesTotal, cantIngredientes);
						}
					}
				if(seEncontroElIngrediente == false) {
					throw new EIngredienteNoExiste();
				}
			}else {
				throw new EListaIngredientesVacia();
			}
		}else {
			throw new EListaIngredientesNull();
		}
	}
	
	//Añadir domiciliario
	
	public void addDomiciliario(String nombre) {
		if(domiciliarios == null) {
			cantDomiciliarios = 1;
			domiciliarios = new Domiciliario[1];
			domiciliarios[0] = new Domiciliario(nombre);
		}else {
			cantDomiciliarios++;
			domiciliarios = Arrays.copyOf(domiciliarios, cantDomiciliarios);
			domiciliarios[domiciliarios.length - 1] = new Domiciliario(nombre);
		}
	}
}

class Ingredientes{
	
	//Atributos
	private String nombre;
	private int cantidad;
	
	//Constructor
	public Ingredientes(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}

class Domiciliario{
	
	//Atributos
	private String nombre;
	private int numPedidos;
	private boolean disponibilidad;
	
	//Constructor
	public Domiciliario(String nombre) {
		this.nombre = nombre;
		numPedidos = 0;
		disponibilidad = true;
	}
}

class EListaIngredientesNull extends Exception{
	public EListaIngredientesNull() {
		super("Aún no se ha añadido ningún ingrediente");
	}
	
}

class EListaIngredientesVacia extends Exception{
	public EListaIngredientesVacia() {
		super("No hay ingredientes para eliminar");
	}
	
}

class EIngredienteNoExiste extends Exception{
	public EIngredienteNoExiste() {
		super("No se encontro un ingrediente con ese nombre");
	}
	
}



