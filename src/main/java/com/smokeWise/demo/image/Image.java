package com.smokeWise.demo.image;

import com.smokeWise.demo.board.Board;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid", strategy = "uuid2")
    @Column(name = "IMAGE_NAME", length = 200)
    private String imgName;

    @ManyToOne
    @JoinColumn(name = "BOARD_NO")
    private Board board;

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
