package br.edu.infnet.rest;

@Entity
public class Autor {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String primNome;
	private String sobrenome;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrimNome() {
		return primNome;
	}
	public void setPrimNome(String primNome) {
		this.primNome = primNome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
}
