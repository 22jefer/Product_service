/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Js.Product_service.SUPPLIER;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Asus
 */

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Supplier {
    
    private int id;
    
    private String code;

    private String tradeName;
    
    private String email;
    
    private String phone;
    
    private String address;
}
