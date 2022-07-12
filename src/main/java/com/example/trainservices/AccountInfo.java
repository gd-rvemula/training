package com.example.trainservices;

/**
 * Created by rcvemula on 12/23/16.
 */


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/account")
public class AccountInfo {


    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccountInJSON() {

        Account account = new Account();
        account.setName("John Doe");
        account.setNumber("1234567890123456");
        account.setNbrCards(4);
        return account;

    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createAccountInJSON(Account account) {

        String result = "Account saved : " + account;
        return Response.status(201).entity(result).build();

    }
}
