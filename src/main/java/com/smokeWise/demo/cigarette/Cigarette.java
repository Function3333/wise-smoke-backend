package com.smokeWise.demo.cigarette;

import lombok.NonNull;

import javax.persistence.*;

@Entity
public class Cigarette {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CIGARETTE_NO")
    private int id;

    @NonNull
    @Column(name = "CIGARETTE_NAME")
    private String name;

    @NonNull
    @Column(name = "CIGARETTE_DESCRIPTION")
    private String description;

    @NonNull
    @Column(name = "CIGARETTE_PRICE")
    private int price;

    @Column(name = "CIGARETTE_SCORE")
    private int score;

    @NonNull
    @Column(name = "CIGARETTE_NICOTINE")
    private int nicotine;

    @NonNull
    @Column(name = "CIGARETTE_TAR")
    private int tar;

    @NonNull
    @Column(name = "CIGARETTE_MENTHOL")
    private boolean MENTHOL;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNicotine() {
        return nicotine;
    }

    public void setNicotine(int nicotine) {
        this.nicotine = nicotine;
    }

    public int getTar() {
        return tar;
    }

    public void setTar(int tar) {
        this.tar = tar;
    }

    public boolean isMENTHOL() {
        return MENTHOL;
    }

    public void setMENTHOL(boolean MENTHOL) {
        this.MENTHOL = MENTHOL;
    }
}
