package com.ctw.workstation.booking.boundary;

import com.ctw.workstation.booking.entity.Booking;
import com.ctw.workstation.booking.entity.service.BookingService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/workstation/bookings")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class BookingResource {
    private static final BookingService bookingService = new BookingService();
    @GET
    public Response getAllBookings() {
        return Response.ok(bookingService.getAllBookings()).build();
    }

    @POST
    public Response addBooking(Booking booking) {
        Booking createdBooking = bookingService.addBooking(booking);
        return Response.status(Response.Status.CREATED).entity(createdBooking).build();
    }

    @GET
    @Path("/{id}")
    public Response getBookingById(@PathParam("id") int id) {
        return Response.ok(bookingService.getBookingById(id)).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateBooking(@PathParam("id") int id, Booking updatedBooking) {
        Booking booking = bookingService.updateBooking(id, updatedBooking);
        if (booking != null) {
            return Response.ok(booking).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBooking(@PathParam("id") int id) {
        if (bookingService.deleteBooking(id)) {
            return Response.ok().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
