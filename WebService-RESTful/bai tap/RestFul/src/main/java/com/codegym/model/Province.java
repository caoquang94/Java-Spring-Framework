package com.codegym.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "province")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "province")
    private Set<Customer> customers;
    private Set<Customer> getCustomers(){return customers; }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public Province() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
