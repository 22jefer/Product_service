/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Product")
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false)
    private String productCode;
    
    @Column(nullable = false)
    private String brand;
    
    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String size;
    
    @Column(nullable = false)
    private int existence;
    
    private String description;
    
    @Column(nullable = false)
    private int supplierId;
    
    
}
