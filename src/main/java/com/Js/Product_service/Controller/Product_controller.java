/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.Controller;

import com.Js.Product_service.Entity.Product;
import com.Js.Product_service.Service.Product_service;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Asus
 */

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
@Data
public class Product_controller {
    
    private final Product_service product_service;
    
    @PostMapping
    public Product saveProduct(@RequestBody Product product){
        return product_service.saveProduct(product);
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Integer id){
        return product_service.getProductById(id);
    }
    
    @GetMapping
    public List<Product> getProduct(){
        return product_service.AllProduct();
    }
    
    @PutMapping
    public Product updateProduct(@RequestBody Product product){
        return product_service.updateProduct(product);
    }
    
    @DeleteMapping
    public void  deleteProduct(@RequestBody Product product){
        product_service.deletedProduct(product);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable Integer id){
        product_service.deletedProductById(id);
    }
    
}
