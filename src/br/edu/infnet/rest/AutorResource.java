package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/autor")
public class AutorResource {
	
	public AutorResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Autor> getAutor(){
		List<Autor> lista = new ArrayList<Autor>();
		lista.add(new Autor("Dan Brown"));
		return lista;
	}

}
