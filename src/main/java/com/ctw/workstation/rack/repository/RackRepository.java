package com.ctw.workstation.rack.repository;

import com.ctw.workstation.rack.entity.Rack;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RackRepository implements PanacheRepositoryBase<Rack, Long> {

    public void merge(Rack rack) {
        getEntityManager().merge(rack);
    }

    public boolean isPersistent(Rack rack) {
        return getEntityManager().contains(rack);
    }

    public void saveOrUpdate(Rack rack) {
        if (isPersistent(rack)) {
            merge(rack);
        } else {
            getEntityManager().persist(rack);
        }
    }

    public void persist(Rack rack) {
        getEntityManager().persist(rack);
    }
}