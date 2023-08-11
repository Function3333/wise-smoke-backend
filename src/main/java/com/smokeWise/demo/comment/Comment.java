package com.smokeWise.demo.comment;

import com.smokeWise.demo.board.Board;

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

    @Column(name="COMMENT_REG_DATE")
    private LocalDateTime regDate;

    @Column(name = "COMMENT_CONTENT")
    private String content;

    @ManyToOne
    @JoinColumn(name="BOARD_NO")
    private Board board;
}
