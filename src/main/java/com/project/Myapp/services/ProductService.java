package com.project.Myapp.services;

import com.project.Myapp.Repository.ProdRepo;
import com.project.Myapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{
    @Autowired
    ProdRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101,"macbook",50000),
//            new Product(102,"Dell",60000),
//            new Product(103,"Asus",70000)
//    ));

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getproductbyid(int prodid)
    {
       return repo.findById(prodid).orElse(new Product(000,"not found",0000));
    }
    
    public void addproducts(Product prod)
    {
       repo.save(prod);
    }

    public void updateprod(Product prod)
    {
       repo.save(prod);
    }

    public void deleteprod(int prodid)
    {
       repo.deleteById(prodid);
    }
}

