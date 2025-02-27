package com.ctw.workstation.rack.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "T_RACK")
public class Rack extends PanacheEntityBase {
    public static final String GET_ALL = "Rack.getAll";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private Status status;
    @Column(name = "SERIAL_NUMBER", length = 20, nullable = false)
    private String serialNumber;
    @Column(name = "DEFAULT_LOCATION", length = 20, nullable = false)
    private String default_location;
    @Column(name = "CREATED_AT")
    public LocalDateTime createdat;
    @Column(name = "MODIFIED_AT")
    public LocalDateTime modifiedat;
//    @Column(name = "TEAM_ID")
//    public Long team_id;

    public Rack(){}

    public Rack(Long id, Status status, String serialNumber, String default_location, LocalDateTime createdat, LocalDateTime modifiedat) {
        this.id = id;
        this.status = status;
        this.serialNumber = serialNumber;
        this.default_location = default_location;
        this.createdat = createdat;
        this.modifiedat = modifiedat;
        //this.team_id = team_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDefault_location() {
        return default_location;
    }

    public void setDefault_location(String default_location) {
        this.default_location = default_location;
    }

    public LocalDateTime getCreatedat() {
        return createdat;
    }

    public void setCreatedat(LocalDateTime createdat) {
        this.createdat = createdat;
    }

    public LocalDateTime getModifiedat() {
        return modifiedat;
    }

    public void setModifiedat(LocalDateTime modifiedat) {
        this.modifiedat = modifiedat;
    }

//    public Long getTeam_id() {
//        return team_id;
//    }
//
//    public void setTeam_id(Long team_id) {
//        this.team_id = team_id;
//    }
}
