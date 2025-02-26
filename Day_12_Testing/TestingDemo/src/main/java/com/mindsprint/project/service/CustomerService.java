package com.mindsprint.project.service;

import com.mindsprint.project.dao.CustomerDao;
import com.mindsprint.project.dao.CustomerDaoImpl;
import com.mindsprint.project.models.Customer;

import java.util.List;

public class CustomerService {
    private CustomerDao dao;
    public CustomerService(){
        dao = new CustomerDaoImpl();
    }
    public Customer addNewCustomer(Customer customer) {
        return dao.addNewCustomer(customer);
    }

    public List<Customer> getAllCustomer() {
        return dao.getAllCustomer();
    }

}
