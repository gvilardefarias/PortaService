package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entity.Pessoa;
import entity.Porta;

@Path("/Abrir")
public class PortaService {
	
	@GET
	@Path("/Porta")
    @Produces(MediaType.APPLICATION_JSON)	
	public Response porta(){
		Porta porta = new Porta();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Gustavo");
		porta.setNumero(2);
		porta.setPessoa(pessoa);
		
		return Response.status(200).entity(porta).build();
	}
}
