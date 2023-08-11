package com.smokeWise.demo.cigarette;

import javax.persistence.*;

@Entity
public class Cigarette {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CIGARETTE_NO")
    private int id;


}
