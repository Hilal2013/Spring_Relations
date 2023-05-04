package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


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
    @OneToOne(fetch=FetchType.LAZY)
private Client client;
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