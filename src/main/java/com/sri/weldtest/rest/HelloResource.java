package com.sri.weldtest.rest;

import com.sri.weldtest.model.HelloApp;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;


@Path("/")
public class HelloResource {

    @Inject
    private HelloApp app;

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public Response getGreeting(){
        return Response.ok(app.hello()).build();
    }

}
