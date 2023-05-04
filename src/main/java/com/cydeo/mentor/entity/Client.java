package com.cydeo.mentor.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Client extends BaseEntity {

    private String clientName;
    private String phone;
    private String email;

/*  This field will be used in STEP-3
    private Address address;
 */
@OneToOne(fetch =FetchType.LAZY)
private Address address;
    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}