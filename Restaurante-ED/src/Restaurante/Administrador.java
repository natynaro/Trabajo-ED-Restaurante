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
	
	
	public void ModificarIngrePlato(String plato, Ingredientes[] nuevosIngre){}

	public void NuevoPedido(String[] nombresPlatos, String nombreUsu, String direccionUsu, String telefonoUsu){}
	
}
