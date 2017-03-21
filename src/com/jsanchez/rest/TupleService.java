package com.jsanchez.rest;

import com.google.gson.Gson;
import com.jsanchez.entities.Tuple;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/tuple")
public class TupleService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getMessage() {

        Tuple tuple = new Tuple("q","2");

        Gson gson = new Gson();

        return gson.toJson(tuple);
    }
}