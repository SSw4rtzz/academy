package com.ctw.workstation.booking.entity;

import com.ctw.workstation.rack.entity.Rack;
import com.ctw.workstation.teammember.TeamMember;
import jakarta.persistence.*;

import java.util.Date;

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookingIdGenerator")
    @SequenceGenerator(name = "bookingIdGenerator", sequenceName = "SEQ_BOOKING_ID")
    private int id;
    @Column(name = "RACK_ID", nullable = false)
    private int rackId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RACK_ID", updatable = false, insertable = false, nullable = false)
    public Rack rack;
    @Column(name = "REQUESTER_ID", nullable = false)
    private int requesterId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REQUESTER_ID", updatable = false, insertable = false, nullable = false)
    public TeamMember teamMember;
    @Temporal(TemporalType.DATE)
    @Column(name = "BOOK_FROM")
    private Date bookFrom;
    @Temporal(TemporalType.DATE)
    @Column(name = "BOOK_TO")
    private Date bookTo;

    public Booking(){}

    public Booking(int id, int rackId, int requesterId, Date bookFrom, Date bookTo) {
        this.rackId = rackId;
        this.requesterId = requesterId;
        this.bookFrom = bookFrom;
        this.bookTo = bookTo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRackId() {
        return rackId;
    }

    public void setRackId(int rackId) {
        this.rackId = rackId;
    }

    public int getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(int requesterId) {
        this.requesterId = requesterId;
    }

    public Date getBookFrom() {
        return bookFrom;
    }

    public void setBookFrom(Date bookFrom) {
        this.bookFrom = bookFrom;
    }

    public Date getBookTo() {
        return bookTo;
    }

    public void setBookTo(Date bookTo) {
        this.bookTo = bookTo;
    }
}
