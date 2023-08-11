package com.smokeWise.demo.comment;

import com.smokeWise.demo.board.Board;
import lombok.NonNull;

import javax.persistence.*;
import java.time.LocalDateTime;

/*회원 엔티티추가되면 넣기*/
@Entity
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMENT_NO")
    private int id;

    @Column(name = "PARENT_COMMENT_NO")
    private int parentCommentNo;

    @NonNull
    @Column(name="COMMENT_REG_DATE")
    private LocalDateTime regDate;

    @NonNull
    @Column(name = "COMMENT_CONTENT")
    private String content;

    @NonNull
    @ManyToOne
    @JoinColumn(name="BOARD_NO")
    private Board board;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentCommentNo() {
        return parentCommentNo;
    }

    public void setParentCommentNo(int parentCommentNo) {
        this.parentCommentNo = parentCommentNo;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
