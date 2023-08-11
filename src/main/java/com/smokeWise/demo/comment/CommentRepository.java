package com.smokeWise.demo.comment;

import com.smokeWise.demo.cigarette.Cigarette;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class CommentRepository {

    @PersistenceContext
    private EntityManager em;

    //Create
    public int save(Comment comment) {
        em.persist(comment);
        return comment.getId();
    }

    //Read(하나만 가져오기)
    public Comment findOne(int commentId) {
        return em.find(Comment.class, commentId);
    }

    //Read(DB데이터 전부 가져오기)
    public List<Comment> findAll() {
        return em.createQuery("select c from COMMENT c", Comment.class)
                .getResultList();
    }

    //update
    public void update(Comment comment) {
        Comment findComment = em.find(Comment.class, comment.getId());


        findComment = comment;
        em.persist(findComment);
    }

    //Delete
    public void delete(Comment comment) {
        em.remove(comment);
    }
}
