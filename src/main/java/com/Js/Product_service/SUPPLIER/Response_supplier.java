/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.SUPPLIER;

import com.Js.Product_service.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Response_supplier {
    
    private Product product;
    private Supplier supplier;
    
}
