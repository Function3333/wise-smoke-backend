package com.smokeWise.demo.board;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BoardRepository {
    @PersistenceContext
    private EntityManager em;

    //Create
    public int save(Board board) {
        em.persist(board);
        return board.getId();
    }

    //Read(하나만 가져오기)
    public Board findOne(int boardId) {
        return em.find(Board.class, boardId);
    }

    //Read(DB데이터 전부 가져오기)
    public List<Board> findAll() {
        return em.createQuery("select b from BOARD b", Board.class)
                .getResultList();
    }

    //update
    public void update(Board board) {
        Board findBoard = em.find(Board.class, board.getId());
        findBoard = board;

        em.persist(findBoard);
    }

    //Delete
    public void delete(Board board) {
        em.remove(board);
    }
}
