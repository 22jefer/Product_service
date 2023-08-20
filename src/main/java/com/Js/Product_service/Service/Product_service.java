/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.Service;


import com.Js.Product_service.Entity.Product;
import com.Js.Product_service.Repository.Product_repository;
import com.Js.Product_service.SUPPLIER.Response_supplier;
import com.Js.Product_service.SUPPLIER.Supplier;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Asus
 */

@Service
@AllArgsConstructor
@Data
public class Product_service {
    
    private final Product_repository product_repository;
    
    private final RestTemplate restTemplate;
    
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
    
    public Response_supplier getResponse_supplierById(Integer id){
        
        Product product = new Product();
        Response_supplier response_supplier = new Response_supplier();
        product = product_repository.findById(id).get();
        
        ResponseEntity<Supplier> responseEntity = restTemplate.getForEntity(
                "http://localhost:8081/api/supplier/"+product.getSupplierId(), 
                Supplier.class);
        
        Supplier supplier = responseEntity.getBody();
        
        response_supplier.setProduct(product);
        response_supplier.setSupplier(supplier);
        
        return response_supplier;
        
    }
    
}
