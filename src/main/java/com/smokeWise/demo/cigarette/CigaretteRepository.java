package com.smokeWise.demo.cigarette;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CigaretteRepository {

    @PersistenceContext
    private EntityManager em;

    //Create
    public int save(Cigarette cigarette) {
        em.persist(cigarette);
        return cigarette.getId();
    }

    //Read(하나만 가져오기)
    public Cigarette findOne(int cigaretteId) {
        return em.find(Cigarette.class, cigaretteId);
    }

    //Read(DB데이터 전부 가져오기)
    public List<Cigarette> findAll() {
        return em.createQuery("select c from CIGARETTE c", Cigarette.class)
                .getResultList();
    }

    //update
    public void update(Cigarette cigarette) {
        Cigarette findCigarette = em.find(Cigarette.class, cigarette.getId());

        findCigarette = cigarette;
        em.persist(findCigarette);
    }

    //Delete
    public void delete(Cigarette cigarette) {
        em.remove(cigarette);
    }
}
