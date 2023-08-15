package com.smokeWise.demo.user;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    // Create
    public void save(User user) {
        em.persist(user);
    }

    // Read (하나만 가져오기)
    public User userFind(String userID) {
        return em.find(User.class, userID);
    }

    // Read (모두 가져오기)
    public List<User> userFindList() {
        return em.createQuery("SELECT u FROM USER u", User.class)
                .getResultList();
    }

    // Update
    public void update(User user) {

    }

    // Delete
    public void delete(User user) {

    }
}