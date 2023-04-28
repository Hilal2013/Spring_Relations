package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity{

   // private Long id;
    private String description;
    private String zipCode;

    /*  This field will be used in STEP-3
    private State state;
     */

    @Override
    public String toString() {
        return "Address{" +
                "description='" + description + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}