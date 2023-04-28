package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Invoice extends BaseEntity{

    private String invoiceNumber;
    private String invoiceType;

    private LocalDate invoiceDate;

/*  This field will be used in STEP-3
    private Client client;
 */
    @ManyToOne(fetch = FetchType.LAZY)
private Client client;
    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", invoiceType='" + invoiceType + '\'' +
                ", invoiceDate=" + invoiceDate +
                '}';
    }
}