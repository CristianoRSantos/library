package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/livros")
public class LivroResource {
	
	public LivroResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livro> getLivro(){
		List<Livro> lista = new ArrayList<Livro>();
		lista.add(new Livro("E o vento levou"));
		return lista;
	}

}
