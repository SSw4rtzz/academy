package com.ctw.workstation.team.entity.service;

import com.ctw.workstation.team.entity.Team;
import com.ctw.workstation.team.entity.Team;
import com.ctw.workstation.team.repository.TeamRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class TeamService {
    private static final List<Team> teams = new ArrayList<>();
    private static final AtomicInteger idGenerate = new AtomicInteger(1);
//    private final TeamRepository teamRepository;
//    private final TeamMemberRepository teamMemberRepository;
//    private final TeamMapper teamMapper;

//    @Inject
//    public TeamService(TeamRepository teamRepository, TeamMemberRepository teamMemberRepository, TeamMapper teamMapper){
//        this.teamRepository = teamRepository;
//        this.teamMemberRepository = teamMemberRepository;
//        this.teamMapper = teamMapper;
//    }

//    @Transactional
//    public TeamDTO create(TeamDTO teamDTO){
//        Log.info("create team {0}", teamDTO);
//        Team team = teamMapper.toTeam(teamDTO);
//        teamRepository.persist(team);
//        return teamMapper.toTeamDTO(team);
//    }


    public Team addTeam(Team team) {
        teams.add(team);
        return team;
    }

    public List<Team> getAllTeams() {
        return teams;
    }

    public Team getTeamById(int id) {
        return teams.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    // Update Team by ID
    public Team updateTeam(int id, Team updatedTeam) {
        for (Team t : teams) {
            if(t.getId() == id) {
                t.setName(updatedTeam.getName());
                t.setProduct(updatedTeam.getProduct());
                return t;
            }
        }
        return null;
    }

    // Delete Team by ID
    public boolean deleteTeam(int id) {
        for (Team t : teams) {
            if(t.getId() == id) {
                teams.remove(t);
                return true;
            }
        }
        return false;
    }
}
