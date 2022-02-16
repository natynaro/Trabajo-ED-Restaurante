package Restaurante;

public class Administrador {

	private Pedidos[] pedidosTotal;
	private Ingredientes[] ingredientesTotal;
	private Platos[] platosTotal;
	private Domiciliario[] domiciliarios;
	
	public Administrador(Pedidos[] pedidosTotal, Ingredientes[] ingredientesTotal, Platos[] platosTotal,
			Domiciliario[] domiciliarios) {
		super();
		this.pedidosTotal = pedidosTotal;
		this.ingredientesTotal = ingredientesTotal;
		this.platosTotal = platosTotal;
		this.domiciliarios = domiciliarios;
	}

	
	public Pedidos[] getPedidosTotal() {
		return pedidosTotal;
	}

	public void setPedidosTotal(Pedidos[] pedidosTotal) {
		this.pedidosTotal = pedidosTotal;
	}

	public Ingredientes[] getIngredientesTotal() {
		return ingredientesTotal;
	}

	public void setIngredientesTotal(Ingredientes[] ingredientesTotal) {
		this.ingredientesTotal = ingredientesTotal;
	}

	public Platos[] getPlatosTotal() {
		return platosTotal;
	}

	public void setPlatosTotal(Platos[] platosTotal) {
		this.platosTotal = platosTotal;
	}

	public Domiciliario[] getDomiciliarios() {
		return domiciliarios;
	}

	public void setDomiciliarios(Domiciliario[] domiciliarios) {
		this.domiciliarios = domiciliarios;
	}
	
	//Métodos
	
	
	public void ModificarIngrePlato(String plato, Ingredientes[] nuevosIngre){
		//estoy cambiando cosas
	}

	public void NuevoPedido(String[] nombresPlatos, String nombreUsu, String direccionUsu, String telefonoUsu){
		inti=0; //borrar
	}
	public void addPlato(String nombre,Ingredientes[] ingredientesTotal, double precio) {
		if(buscarPlato(nombre) == -1) {
			platosTotal= Arrays.copyOf(platosTotal,platosTotal.length+1);
			platosTotal[platosTotal.length-1]= new Platos(nombre,ingredientesTotal,precio);
		}
	}
	public void borrarPlato(String nombre) {
		if(buscarPlato(nombre) != -1) {
			int i=buscarPlato(nombre);
			int j=buscarPlato(nombre)+1;
			while(i<platosTotal.length) {
			platosTotal[i]= platosTotal[j];
			i++;j++;
		}
			platosTotal= Arrays.copyOf(platosTotal, platosTotal.length-1);
			}
	}
	public int buscarPlato(String Nombre) {
		String n= Nombre.toLowerCase();
		int i=0;
		while(i<platosTotal.length && !(platosTotal[i].getNombre().equals(n))) {
			i++;
		}
		return(i<platosTotal.length)?i:-1;
	}
	
}
