package com.codegym.cms.service;

import com.codegym.cms.model.Customer;

public interface CustomerService extends Service<Customer>{
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

}
