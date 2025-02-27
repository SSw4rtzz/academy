package com.ctw.workstation.team.entity;

import com.ctw.workstation.rack.entity.Rack;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "T_TEAM")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamIdGenerator")
    @SequenceGenerator(name = "teamIdGenerator", sequenceName = "SEQ_TEAM_ID")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "PRODUCT", nullable = false)
    private String product;
    @Column(name = "DEFAULT_LOCATION", length = 20, nullable = false)
    private String default_location;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdat;
    @Column(name = "MODIFIED_AT")
    private LocalDateTime modifiedat;



    //@OneToMany(mappedBy = "team", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private List<Rack> racks;

    public Team(){}

    public Team(Long id, String name, String product) {
        this.id = id;
        this.name = name;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
