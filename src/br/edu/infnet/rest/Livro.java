package br.edu.infnet.rest;

@Entity
public class Livro {

	@Id
	@GeneratedValue
	private Integer id;
	private String descricao;
	private String dataPublica��o;
	private Autor autor;
	private Categoria categoria;
	
	public Livro(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataPublica��o() {
		return dataPublica��o;
	}

	public void setDataPublica��o(String dataPublica��o) {
		this.dataPublica��o = dataPublica��o;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	