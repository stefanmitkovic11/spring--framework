package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String surName;
    private String name;
    private String email;
    private String address;

    @OneToMany
    private List<Payment> payment;

    public Customer(String userName, String surName, String name, String email, String address) {
        this.userName = userName;
        this.surName = surName;
        this.name = name;
        this.email = email;
        this.address = address;
    }
}
