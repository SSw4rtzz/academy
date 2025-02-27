package com.ctw.workstation.team.boundary;

import com.ctw.workstation.team.entity.Team;
import com.ctw.workstation.team.entity.service.TeamService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/workstation/teams")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TeamResource {
    private static final TeamService teamService = new TeamService();

    @POST
    public Response addTeam(Team team) {
        Team createdTeam = teamService.addTeam(team);
        return Response.status(Response.Status.CREATED).entity(createdTeam).build();
    }

    @GET
    public Response getAllTeams() {
        return Response.ok(teamService.getAllTeams()).build();
    }

    @GET
    @Path("/{id}")
    public Response getTeamById(@PathParam("id") int id) {
        return Response.ok(teamService.getTeamById(id)).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateTeam(@PathParam("id") int id, Team updatedTeam) {
        Team team = teamService.updateTeam(id, updatedTeam);
        if (team != null) {
            return Response.ok(team).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteTeam(@PathParam("id") int id) {
        if (teamService.deleteTeam(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
