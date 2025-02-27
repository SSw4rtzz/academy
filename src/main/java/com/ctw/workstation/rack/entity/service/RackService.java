package com.ctw.workstation.rack.entity.service;

import com.ctw.workstation.rack.entity.Rack;
import com.ctw.workstation.rack.entity.Status;
import com.ctw.workstation.rack.repository.RackRepository;
import com.ctw.workstation.team.repository.TeamRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

import java.util.List;

@ApplicationScoped
public class RackService {

    @Inject
    RackRepository rackRepository;

    @Inject
    TeamRepository teamRepository;

    @Transactional
    public Rack addRack(Rack rack) {
        if (rack.getId() != null && rackRepository.findById(rack.getId()) != null) {
            rackRepository.merge(rack);
        } else {
            try{
                rackRepository.persist(rack);
            }catch(Exception e){
                System.out.println("Error: " + e);
                System.out.println(rack.getId());
                System.out.println(rack.getSerialNumber());
                System.out.println(rack.getStatus());
                //System.out.println(rack.getTeam_id());
                System.out.println(rack.getDefault_location());
                System.out.println(rack.getCreatedat());
                System.out.println(rack.getModifiedat());
            }
        }
        //return rack;
        return rack;
    }

    // List all Racks
    public List<Rack> getAllRacks() {
        return rackRepository.listAll();
    }

    // List all Racks by status
    public List<Rack> getRacksByStatus(Status status) {
        return rackRepository.list("status", status);
    }

    // Return Rack by ID
    public Rack getRackById(Long id) {
        return rackRepository.findById(id);
    }

    // Update Rack by ID
    @Transactional
    public Rack updateRack(Long id, Rack updatedRack) {
        Rack existingRack = rackRepository.findById(id);

        if (existingRack == null) {
            throw new NotFoundException("Rack not found");
        }
        if (updatedRack.getSerialNumber() != null) {
            existingRack.setSerialNumber(updatedRack.getSerialNumber());
        }
        if (updatedRack.getStatus() != null) {
            existingRack.setStatus(updatedRack.getStatus());
        }
        //existingRack.setTeam_id(updatedRack.getTeam_id()); T

        rackRepository.merge(existingRack);
        return existingRack;
    }

    // Delete Rack by ID
    @Transactional
    public boolean deleteRack(Long id) {
        Rack existingRack = rackRepository.findById(id);
        if (existingRack != null) {
            rackRepository.delete(existingRack);
            return true;
        }
        return false;
    }
}