package com.smokeWise.demo.product;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PROD_NO")
    private int pordNum;

    @NotNull
    @Column(name = "PROD_NAME")
    private String prodName;


    @NotNull
    @Column(name= "PROD_REG_DARE")
    private LocalDateTime prodRegDate;

    @NotNull
    @Column(name = "PROD_PRICE")
    private int prodPrice;

    @NotNull
    @Column(name ="PROD_STOCK")
    private int prodStock;

    @Column(name = "PROD_IMG")
    private String prodImage;

    public int getPordNum() {
        return pordNum;
    }

    public void setPordNum(int pordNum) {
        this.pordNum = pordNum;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public LocalDateTime getProdRegDate() {
        return prodRegDate;
    }

    public void setProdRegDate(LocalDateTime prodRegDate) {
        this.prodRegDate = prodRegDate;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdStock() {
        return prodStock;
    }

    public void setProdStock(int prodStock) {
        this.prodStock = prodStock;
    }

    public String getProdImage() {
        return prodImage;
    }

    public void setProdImage(String prodImage) {
        this.prodImage = prodImage;
    }
}
