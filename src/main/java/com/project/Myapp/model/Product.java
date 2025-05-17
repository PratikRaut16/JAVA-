package com.project.Myapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product
{
    @Id
    private int prodid;
    private String prodname;
    private int prodprice;

    public Product(int prodid, String prodname, int prodprice) {
        this.prodid = prodid;
        this.prodname = prodname;
        this.prodprice = prodprice;
    }

    public Product() {

    }

    public int getProdprice() {
        return prodprice;
    }

    public void setProdprice(int prodprice) {
        this.prodprice = prodprice;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }
}
