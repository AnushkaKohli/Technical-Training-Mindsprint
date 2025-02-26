package com.mindsprint.project.service;

import com.mindsprint.project.dao.CustomerDAO;
import com.mindsprint.project.dao.CustomerDaoImpl;
import com.mindsprint.project.models.Customer;

import java.util.List;

public class CustomerService {
//    to achieve abstraction
    private CustomerDAO dao; // reference to DAO
    public CustomerService() {
        dao = new CustomerDaoImpl(); // pass implementation object to interface
    }
    public Customer addNewCustomer(Customer customer) {
        return dao.addNewCustomer((customer));
    }
    public List<Customer> getAllCustomers() {
        return dao.getAllCustomers();
    }
}
