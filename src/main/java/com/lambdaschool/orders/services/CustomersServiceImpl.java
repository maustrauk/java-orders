package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class CustomersServiceImpl implements CustomersService{
    @Autowired
    private CustomersRepository customersrepos;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customersrepos.save(customer);
    }
}
