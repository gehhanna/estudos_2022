package com.example.demo.ressources;

import com.example.demo.DTOs.PessoaDTO;
import com.example.demo.models.PessoaModel;
import com.example.demo.services.PessoaService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Objects;

@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {

    @EJB
    PessoaService pessoaService;

    @POST
    public Response save(PessoaDTO pessoaDTO) {
        PessoaModel pessoaModel = pessoaService.save(pessoaDTO);
        if(Objects.nonNull(pessoaModel)) {
            return Response.ok(pessoaDTO).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).entity("Ocorreu um erro ao processar sua requisição").build();
    }

    @GET
    public Response findAll() {
        List<PessoaDTO> listPessoas = pessoaService.findAll();
        return Response.status(Response.Status.OK).entity(listPessoas).build();
    }

    @GET
    @Path("/id/{id}")
    public Response findById(@PathParam("id") Long id) {
        PessoaDTO pessoaDTO = pessoaService.findById(id);
        return Response.status(Response.Status.OK).entity(pessoaDTO).build();
    }

    @GET
    @Path("/nome/{nome}")
    public Response findByName(@PathParam("nome") String nome) {
        PessoaDTO pessoaDTO = pessoaService.findByName(nome);
        return Response.status(Response.Status.OK).entity(pessoaDTO).build();
    }

    @PUT
    public Response update(PessoaDTO pessoaDTO){
        pessoaService.update(pessoaDTO);
        return Response.status(Response.Status.NO_CONTENT).build();
    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Long id) {
        pessoaService.delete(id);
        return Response.status(Response.Status.ACCEPTED).build();

    }

}