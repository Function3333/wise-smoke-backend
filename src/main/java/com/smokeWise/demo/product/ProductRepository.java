package com.smokeWise.demo.product;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
public class ProductRepository {

    @PersistenceContext
    private EntityManager em;

    // product 항목 저장
    public void save(Product product){
        em.persist(product);
    }

    //한개만 read
    public Product findOne(int prodNum){
        return em.find(Product.class, prodNum);
    }

    // 여러개 read
    public List<Product> findAll() {
        return em.createQuery("select * from PRODUCT", Product.class).getResultList();
    }

    // Product 정보 수정
    public void update(Product updatePoduct) {
        Product findProduct = em.find(Product.class, updatePoduct.getPordNum());

        if(findProduct != null) {
            findProduct.setProdName(updatePoduct.getProdName());
            findProduct.setProdRegDate(updatePoduct.getProdRegDate());
            findProduct.setProdPrice(updatePoduct.getProdPrice());
            findProduct.setProdStock(updatePoduct.getProdStock());
            findProduct.setProdImage(updatePoduct.getProdImage());
        }
    }

    //product 정보 삭제
    public void delete(Product product){
        em.remove(product);
    }
}
