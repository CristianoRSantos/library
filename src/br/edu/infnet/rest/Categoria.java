package br.edu.infnet.rest;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nomeCategoria;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	

}
