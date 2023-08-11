package com.smokeWise.demo.image;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ImageRepository {
    @PersistenceContext
    EntityManager em;

    public String save(Image image) {
        em.persist(image);
        return image.getImgName();
    }

    public Image findOne(String imageName) {
        return em.find(Image.class, imageName);
    }

    public List<Image> findByBoardId(int boardId) {
        return em.createQuery("select i from IMAGE i where i.board.id = :id", Image.class)
                .setParameter("id",boardId)
                .getResultList();
    }
}
