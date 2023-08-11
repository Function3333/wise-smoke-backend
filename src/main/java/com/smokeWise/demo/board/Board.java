package com.smokeWise.demo.board;

import com.smokeWise.demo.comment.Comment;
import com.smokeWise.demo.commmon.BoardCategory;
import com.smokeWise.demo.image.Image;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


/*회원 엔티티 생성되면 추가하기*/
@Entity
public class Board {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BOARD_NO")
    private int id;

    @NotNull
    @Column(name = "BOARD_TITLE")
    private String title;

    @NotNull
    @Column(name = "BOARD_CONTENT")
    private String content;

    @NotNull
    @Column(name = "BOARD_REG_DATE")
    private LocalDateTime regDate;

    @Column(name = "BOARD_RECOMMEND")
    private int recommend;

    @NotNull
    @Column(name = "BOARD_TYPE")
    @Enumerated(EnumType.STRING)
    private BoardCategory boardCategory;

    @Column(name = "BOARD_IMAGE")
    @OneToMany(mappedBy = "board")
    private List<Image> imageList;

    @Column(name = "BOARD_COMMENT")
    @OneToMany(mappedBy = "board")
    private List<Comment> commentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public BoardCategory getBoardCategory() {
        return boardCategory;
    }

    public void setBoardCategory(BoardCategory boardCategory) {
        this.boardCategory = boardCategory;
    }

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
}
