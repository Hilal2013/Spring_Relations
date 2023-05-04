package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Getter
@Setter
public class Address extends BaseEntity{

    private String description;
    private String zipCode;

    /*  This field will be used in STEP-3
    private State state;
     */

    @ManyToOne(fetch = FetchType.LAZY)
    private State state;
    @Override
    public String toString() {
        return "Address{" +
                "description='" + description + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}