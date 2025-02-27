package com.ctw.workstation.teammember;

import com.ctw.workstation.rack.entity.Rack;
import com.ctw.workstation.team.entity.Team;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "T_TEAM_MEMBER")
public class TeamMember {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teamMemberIdGenerator")
    @SequenceGenerator(name = "teamMemberIdGenerator", sequenceName = "SEQ_TEAM_MEMBER_ID")
    private Long id;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "TEAM_ID", nullable = false)
    private Long teamId;
    @Column(name = "CTW_ID", length = 20, nullable = false)
    private String ctwId;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATED_AT")
    public Date createdat;
    @Temporal(TemporalType.DATE)
    @Column(name = "MODIFIED_AT")
    public Date modifiedat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TEAM_ID", updatable = false, insertable = false, nullable = false)
    public Team team;

    public TeamMember(){}

    public TeamMember(Long id, String name, Long teamId, String ctwId, Date createdat, Date modifiedat) {
        this.id = id;
        this.name = name;
        this.teamId = teamId;
        this.ctwId = ctwId;
        this.createdat = createdat;
        this.modifiedat = modifiedat;
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

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public String getCtwId() {
        return ctwId;
    }

    public void setCtwId(String ctwId) {
        this.ctwId = ctwId;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public Date getModifiedat() {
        return modifiedat;
    }

    public void setModifiedat(Date modifiedat) {
        this.modifiedat = modifiedat;
    }
}
