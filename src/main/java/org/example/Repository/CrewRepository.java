package org.example.Repository;

import org.example.Tables.Crew;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository

public class CrewRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Crew> getAllCrews() {
        TypedQuery<Crew> query = entityManager.createQuery("SELECT c FROM Crew c", Crew.class);
        return query.getResultList();
    }

    public Crew getCrewById(int idCrews) {
        return entityManager.find(Crew.class, idCrews);
    }

    @Transactional
    public Crew createCrew(Crew crew) {
        entityManager.persist(crew);
        return crew;
    }

    @Transactional
    public Crew updateCrew(int idCrews, Crew updatedCrew) {
        Crew existingCrew = entityManager.find(Crew.class, idCrews);
        if (existingCrew != null) {
            existingCrew.setName(updatedCrew.getName());
            existingCrew.setMembers(updatedCrew.getMembers());
            existingCrew.setId(updatedCrew.getId());
            existingCrew.setAge(updatedCrew.getAge());
        }
        return existingCrew;
    }

    @Transactional
    public void deleteCrew(int idCrews) {
        Crew crew = entityManager.find(Crew.class, idCrews);
        if (crew != null) {
            entityManager.remove(crew);
        }
    }
}