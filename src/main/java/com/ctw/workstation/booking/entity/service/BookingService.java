package com.ctw.workstation.booking.entity.service;

import com.ctw.workstation.booking.entity.Booking;
import com.ctw.workstation.booking.entity.Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingService {
    private static final List<Booking> bookings = new ArrayList<>();
    private static final AtomicInteger idGenerate = new AtomicInteger(1);

    public Booking addBooking(Booking booking) {
        booking.setId(idGenerate.getAndIncrement());
        bookings.add(booking);
        return booking;
    }

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Booking getBookingById(int id) {
        return bookings.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    // Update Booking by ID
    public Booking updateBooking(int id, Booking updatedBooking) {
        for (Booking b : bookings) {
            if(b.getId() == id) {
                b.setRackId(updatedBooking.getRackId());
                b.setRequesterId(updatedBooking.getRequesterId());
                b.setBookFrom(updatedBooking.getBookFrom());
                b.setBookTo(updatedBooking.getBookTo());
                return b;
            }
        }
        return null;
    }

    // Delete Booking by ID
    public boolean deleteBooking(int id) {
        for (Booking r : bookings) {
            if(r.getId() == id) {
                bookings.remove(r);
                return true;
            }
        }
        return false;
    }
}
