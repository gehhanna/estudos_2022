package com.example.demo.ressources;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.demo.DTOs.ContaDTO;
import com.example.demo.models.ContaModel;
import com.example.demo.services.ContaService;

@Path("/contas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON) 
public class ContaResource {

    @EJB
    ContaService contaService;

    @POST
    public Response save(ContaDTO contaDTO){
        ContaModel contaModel = contaService.save(contaDTO);
        return Response.ok(contaModel).build();

    }
    
}
