package com.jsanchez.rest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jsanchez.dao.Access;
import com.jsanchez.entities.Tuple;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tuple")
public class TupleService {

    Access access = new Access();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{key}")
    public String getTuple(@PathParam("key") String key) {

        Tuple tuple = null;
        try {
            tuple = access.getAndDeleteTuple(key);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        return gson.toJson(tuple);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public String addTuple(Tuple tuple) {
        System.out.println("Adding tuple");
        int result=0;
        try {
            result = access.addTuple(tuple);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
      //  return gson.toJson(json.toString());
        return gson.toJson(result);
    }
}