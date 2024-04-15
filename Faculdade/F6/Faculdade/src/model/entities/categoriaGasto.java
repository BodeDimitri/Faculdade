package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class categoriaGasto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer idCategoria;
	private String name;
	
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

	@Override
	public int hashCode() {
		return Objects.hash(idCategoria, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		categoriaGasto other = (categoriaGasto) obj;
		return Objects.equals(idCategoria, other.idCategoria) && Objects.equals(name, other.name);
	}
	
	
}
