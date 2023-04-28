package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Getter
@Setter
//@Table(name="invoice_product")
public class Invoice_Product extends BaseEntity{

    private int quantity;
    private double profit;

/*  These fields will be used in STEP-3
    private Invoice invoice;
    private Product product;
 */

    @Override
    public String toString() {
        return "Invoice_Product{" +
                "quantity=" + quantity +
                ", profit=" + profit +
                '}';
    }
}