package com.example.apivenda.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/livro")

public class ItensVenda {

    @Inject
    private ItensVenda itensVenda;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response listarVendas() {
        return Response.ok(itensVenda.listarVendas()).build();
    }
    }

