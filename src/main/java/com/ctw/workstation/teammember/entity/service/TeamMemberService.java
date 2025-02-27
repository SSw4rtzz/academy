package com.ctw.workstation.teammember.entity.service;

import com.ctw.workstation.teammember.TeamMember;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TeamMemberService {
    private static final List<TeamMember> TEAM_MEMBERS = new ArrayList<>();

    public TeamMember addTeam(TeamMember teamMember) {
        TEAM_MEMBERS.add(teamMember);
        return teamMember;
    }

    public List<TeamMember> getAllTeams() {
        return TEAM_MEMBERS;
    }

    public TeamMember getTeamById(int id) {
        return TEAM_MEMBERS.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    // Update Team by ID
    public TeamMember updateTeam(int id, TeamMember updatedTeamMember) {
        for (TeamMember t : TEAM_MEMBERS) {
            if(t.getId() == id) {
                t.setName(updatedTeamMember.getName());
                //t.setProduct(updatedTeamMember.getProduct());
                return t;
            }
        }
        return null;
    }

    // Delete Team by ID
    public boolean deleteTeam(int id) {
        for (TeamMember t : TEAM_MEMBERS) {
            if(t.getId() == id) {
                TEAM_MEMBERS.remove(t);
                return true;
            }
        }
        return false;
    }
}
