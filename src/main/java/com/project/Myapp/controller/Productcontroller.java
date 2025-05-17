package com.project.Myapp.controller;

import com.project.Myapp.model.Product;
import com.project.Myapp.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
public class Productcontroller
{
    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getproducts()
    {
        return service.getProducts();
    }

    @GetMapping("/products/{prodid}")
    public Product getproductbyid(@PathVariable int prodid)
    {
        return service.getproductbyid(prodid);
    }

    @PostMapping("/products")
    public void addproduct(@RequestBody Product prod)
    {
        service.addproducts(prod);
    }

    @PutMapping("/products")
    public void updateprod(@RequestBody Product prod)
    {
        service.updateprod(prod);
    }

    @DeleteMapping("products/{prodid}")
    public void deleteprod(@PathVariable int prodid)
    {
        service.deleteprod(prodid);
    }
}
