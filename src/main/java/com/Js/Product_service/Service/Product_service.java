/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.Service;


import com.Js.Product_service.Entity.Product;
import com.Js.Product_service.Repository.Product_repository;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

/**
 *
 * @author Asus
 */

@Service
@AllArgsConstructor
@Data
public class Product_service {
    
    private final Product_repository product_repository;
    
    public Product saveProduct(Product product){
        return product_repository.save(product);
    }
    
    public Product getProductById(Integer id){
        return product_repository.findById(id).get();
    }
    
    public List<Product> AllProduct(){
        return product_repository.findAll();
    }
    
    public Product updateProduct(Product product){
        return product_repository.save(product);
    }
    
    public void deletedProduct(Product product){
        product_repository.delete(product);
    }
    
    public void deletedProductById(Integer id){
        product_repository.deleteById(id);
    }
    
}
