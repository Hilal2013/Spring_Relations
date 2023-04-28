package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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