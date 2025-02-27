package com.ctw.workstation.rack.boundary;


import com.ctw.workstation.rack.entity.Rack;
import com.ctw.workstation.rack.entity.service.RackService;
import com.ctw.workstation.rack.entity.Status;
import com.ctw.workstation.rack.repository.RackRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;

@Path("/workstation/racks")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RackResource {

    @Inject
    RackService rackService;
    @Inject
    RackRepository rackRepository;

    // Path: localhost:8080/workstation/racks
    @GET
    public Response getAllRacks() {
        return Response.ok(rackService.getAllRacks()).build();
    }

    // Path: localhost:8080/workstation/racks/racks?status={status}
    @GET
    @Path("/racks")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRacksByStatus(@QueryParam("status") String statusStr) {
        try {
            Status status = Status.valueOf(statusStr.toUpperCase());
            return Response.ok(rackService.getRacksByStatus(status)).build();
        } catch (IllegalArgumentException e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Invalid status value: " + statusStr).build();
        }
    }

    @POST
    @Transactional
    public Response addRack(Rack rack) {
        Rack createdRack = rackService.addRack(rack);
        return Response.status(Response.Status.CREATED).entity(createdRack).build();
    }

    // Path: localhost:8080/workstation/racks/{id}
    @GET
    @Path("/{id}")
    public Response getRackById(@PathParam("id") Long id) {
        return Response.ok(rackService.getRackById(id)).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateRack(@PathParam("id") Long id, Rack updatedRack) {
        Rack rack = rackService.updateRack(id, updatedRack);
        if (rack != null) {
            return Response.ok(rack).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteRack(@PathParam("id") Long id) {
        if (rackService.deleteRack(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
