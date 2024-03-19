package dominio;

public class categoriaGasto {
	
	protected Integer idCategoria;
	public String name;
	
	public categoriaGasto(Integer idCategoria, String name) {
		this.idCategoria = idCategoria;
		this.name = name;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
